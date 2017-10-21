package nearby.wahdan.bazinga.nearbyapp.helper.internet;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;


public class ConnectionLiveData implements LifecycleObserver {
    public static final int MobileData = 2;
    public static final int WifiData = 1;
    private Context mContext;
    private MutableLiveData<ConnectionModel> connectionModelLiveData = new MutableLiveData<>();

    public ConnectionLiveData(LifecycleOwner lifecycleOwner, Context context) {
        mContext = context;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void registerYourReceiver() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        mContext.registerReceiver(networkReceiver, filter);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void unRegisterYourReceiver() {
        mContext.unregisterReceiver(networkReceiver);
    }

     public MutableLiveData<ConnectionModel> getConnectionType() {
        return connectionModelLiveData;
    }

    private BroadcastReceiver networkReceiver = new BroadcastReceiver() {
        @SuppressWarnings("deprecation")
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getExtras()!=null) {
                NetworkInfo activeNetwork = (NetworkInfo) intent.getExtras().get(ConnectivityManager.EXTRA_NETWORK_INFO);

                boolean isConnected = activeNetwork != null &&
                        activeNetwork.isConnected();
                Log.d("ConnectionLiveData", "isConnected:" + isConnected);
                if (isConnected)
                    switch (activeNetwork.getType()){
                        case  ConnectivityManager.TYPE_WIFI:
                             connectionModelLiveData.postValue(new ConnectionModel(WifiData, true));
                             break;
                        case ConnectivityManager.TYPE_MOBILE:
                             connectionModelLiveData.postValue(new ConnectionModel(MobileData, true));
                             break;

                    }
                else
                    connectionModelLiveData.postValue(new ConnectionModel(0, false));

            }
        }

    };
}