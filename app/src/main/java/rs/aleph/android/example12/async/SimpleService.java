package rs.aleph.android.example12.async;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import rs.aleph.android.example12.tools.ReviewerTools;

public class SimpleService extends IntentService {

    public SimpleService(){
        super("SimpleService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        int status = ReviewerTools.getConnectivityStatus(getApplicationContext());

        if (status==ReviewerTools.TYPE_WIFI){
            new SimpleSyncTask(getApplicationContext()).execute();
        }
        stopSelf();
        return START_NOT_STICKY;
    }
}
