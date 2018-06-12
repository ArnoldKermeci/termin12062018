package rs.aleph.android.example12.async;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import rs.aleph.android.example12.fragments.ListFragment;

public class SimpleSyncTask extends AsyncTask<Void, Void, Void> {
    private Context context;
    private ListFragment.OnItemSelectedListener listener;

    public SimpleSyncTask(Context context) {
        this.context = context;
        }


    @Override
    protected void onPreExecute() {
        }


    @Override
    protected Void doInBackground(Void... params) {
        try {
        //simulacija posla koji se obavlja u pozadini i traje duze vreme
        Thread.sleep(3000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

        return null;
    }


    @Override
    protected void onPostExecute(Void products) {
        Toast.makeText(context, "Sync done", Toast.LENGTH_SHORT).show();
        }
}

