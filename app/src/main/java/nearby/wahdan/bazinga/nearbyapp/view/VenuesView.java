package nearby.wahdan.bazinga.nearbyapp.view;

import android.Manifest;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

import com.gturedi.views.StatefulLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import nearby.wahdan.bazinga.nearbyapp.R;
import nearby.wahdan.bazinga.nearbyapp.helper.Constants;
import nearby.wahdan.bazinga.nearbyapp.helper.Location.LocationModel;
import nearby.wahdan.bazinga.nearbyapp.helper.internet.ConnectionLiveData;
import nearby.wahdan.bazinga.nearbyapp.helper.internet.ConnectionModel;
import nearby.wahdan.bazinga.nearbyapp.viewmodel.VenuesViewModel;

public class VenuesView extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView rv;
    @BindView(R.id.stateful)
    StatefulLayout stateful;
    private VenuesViewModel venuesViewModel;
    private boolean isOnline;
    Location firstLocation = null;
    private VenueAdapter venueAdapter;
    boolean realTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         venuesViewModel = ViewModelProviders.of(this).get(VenuesViewModel.class);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        venuesViewModel.getLocationLiveData().observe(this,this::LocationChange);

        ConnectionLiveData connectionLiveData = new ConnectionLiveData(this,this);
        connectionLiveData.getConnectionType().observe(this,this::ConnectionSate);
        rv.setLayoutManager(new LinearLayoutManager(this));
         venueAdapter = new VenueAdapter(this);
         rv.setAdapter(venueAdapter);
         venuesViewModel.getErrorLiveData().observe(this, new Observer<Boolean>() {
             @Override
             public void onChanged(@Nullable Boolean error) {
                 if (error)
                     stateful.showError("Error",null);
             }
         });


    }

    private void ConnectionSate(ConnectionModel connectionModel) {
        if (!connectionModel.getIsConnected()){

            stateful.showOffline("no Internet connection ",view -> {
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                isOnline = false;
            });
        }
        else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_CODE);
            isOnline = true;
            stateful.showContent();
            venuesViewModel.getLocationLiveData().requestLocationUpdates();

        }
    }

    private void LocationChange(LocationModel locationModel) {
        Log.d("VenuesView", locationModel.toString());
        if (locationModel.isEnable() && isOnline) {
            if (firstLocation == null) {
                firstLocation = locationModel.getLocation();
                stateful.showLoading();
                getVenues(firstLocation.getLatitude() + "," + firstLocation.getLongitude());

            } else {
                if (firstLocation.distanceTo(locationModel.getLocation()) >= Constants.maxDistance) {
                    firstLocation = locationModel.getLocation();
                    getVenues(firstLocation.getLatitude() + "," + firstLocation.getLongitude());

                }

            }

        }
        else{
            if (isOnline)
            stateful.showLocationOff(view ->
                    startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)));
            else
                stateful.showOffline("no Internet connection ",view -> {
                    startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    isOnline = false;
                });

        }
    }

    private void getVenues(String latlng) {
        venuesViewModel.getVenueLiveData(latlng).observe(this, venues -> {
            Log.d("VenuesView", "venue.size():" + venues.size());
                if(venues.size() == 0)
                    stateful.showEmpty();
                else{
                    Toast.makeText(this, "venues.size():" + venues.size(), Toast.LENGTH_SHORT).show();
                  venueAdapter.updateList(venues);
                    stateful.showContent();
                }
                });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 100: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    venuesViewModel.getLocationLiveData().requestLocationUpdates();
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {
                    stateful.showLocationOff(view -> Log.d("VenuesView", "no gps"));

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.real_time_Action) {
            if (realTime) {
                venuesViewModel.getLocationLiveData().stopLocationUpdates();
                realTime = false;
                Toast.makeText(this, "realTime: Disable " , Toast.LENGTH_LONG).show();
            }
            else {
                venuesViewModel.getLocationLiveData().requestLocationUpdates();
                realTime = true;
                Toast.makeText(this, "realTime: Enabled " , Toast.LENGTH_LONG).show();

            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
