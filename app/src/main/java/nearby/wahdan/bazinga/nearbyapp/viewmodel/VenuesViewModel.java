package nearby.wahdan.bazinga.nearbyapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import nearby.wahdan.bazinga.nearbyapp.helper.Location.LocationLiveData;
import nearby.wahdan.bazinga.nearbyapp.networking.API.FoursquareAPI;
import nearby.wahdan.bazinga.nearbyapp.networking.API.FoursquareService;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.FoursquareResponse;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.GroupsItem;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.Image.ImageResponse;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.Response;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel.Venue;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel.VenueResponse;

import static nearby.wahdan.bazinga.nearbyapp.helper.Constants.*;
import static nearby.wahdan.bazinga.nearbyapp.helper.Constants.Client_ID;


public class VenuesViewModel extends AndroidViewModel {
    private static String TAG = "VenuesViewModel";
    private final FoursquareAPI api;
    private MutableLiveData<List<Venue>> venueLiveData;
    private LocationLiveData locationLiveData;
    private Observable<String> getPhotoObservable;
    private MutableLiveData<Boolean> errorLiveData;
    MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    private ArrayList venues;


    public VenuesViewModel(Application application) {
        super(application);
        locationLiveData = new LocationLiveData(application);
        api = FoursquareService.newApi();
        venueLiveData = new MutableLiveData<>();
        errorLiveData = new MutableLiveData<>();


    }

    public MutableLiveData<List<Venue>> getVenueLiveData(String latlng) {
        getVanes(latlng);
        return venueLiveData;
    }

    private void getVanes(String latlng) {
        Log.d(TAG, latlng);

       venues = new ArrayList<>();
        Disposable subscribe = api.getVenues(latlng, Client_ID, Client_Secret, apiVersion).subscribeOn(Schedulers.io()).
                map(retrofit2.Response::body)
                .map(FoursquareResponse::getResponse)
                .map(Response::getGroups)
                .flatMap(Observable::fromIterable)
                .map(GroupsItem::getItems)
                .flatMap(Observable::fromIterable)
                .flatMap(itemsItem -> {
                    Log.d(TAG, itemsItem.getVenue().getId());
                            Observable<Venue> venueObservable1 = GetVenueObservable(itemsItem.getVenue().getId());
                            Observable<String> getPhotoUrlObservable =
                                    GetPhotoUrlObservable(itemsItem.getVenue().getId());
                            return
                                    Observable.zip(venueObservable1, getPhotoUrlObservable, (venue, imgUrl) -> {

                                        venue.setImgUrl(imgUrl);
                                        Log.d(TAG, venue.toString());
                                        return venue;
                                    });
                        }
                ).observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onLoadVenue, this::onError, this::onLoadAllVenues);
    }

    private Observable<Venue> GetVenueObservable(String id) {
       return   api.getVenue(id,Client_ID,Client_Secret,apiVersion).
        subscribeOn(Schedulers.io()).
                map(retrofit2.Response::body).
                map(VenueResponse::getResponse).map(response -> response.getVenue());
    }

    private void onLoadVenue(Venue venue) {
        venues.add(venue);
    }
    private void onLoadAllVenues() {
        venueLiveData.setValue(venues);

    }
    private void onError(Throwable throwable) {
        Log.e(TAG, throwable.getMessage());
        errorLiveData.postValue(true);
    }



    private Observable<String> GetPhotoUrlObservable(String id) {
        getPhotoObservable =  api.getPhoto(id,Client_ID,Client_Secret,apiVersion).
                subscribeOn(Schedulers.io()).
                map(retrofit2.Response::body)
                .map(ImageResponse::getResponse)
                .map(response -> response.getPhotos())
                .map(photos -> photos.getItems())
                .flatMap(Observable::fromIterable)
                .take(1)
                .map(itemsItem ->itemsItem.getPrefix() + "612x612" + itemsItem.getSuffix());

        return  getPhotoObservable;
    }

    public LocationLiveData getLocationLiveData() {
        return locationLiveData;
    }

    public MutableLiveData<Boolean> getErrorLiveData() {
        return errorLiveData;
    }
}
