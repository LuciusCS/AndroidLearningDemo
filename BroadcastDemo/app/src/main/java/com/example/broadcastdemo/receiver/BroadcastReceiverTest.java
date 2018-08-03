package com.example.broadcastdemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class BroadcastReceiverTest extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getAction().toString(),Toast.LENGTH_LONG).show();
        final PendingResult pendingResult=goAsync();

        AsyncTask<String,Integer,String>asyncTask=new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... strings) {


                Log.i("+++++++++","++++");
                pendingResult.finish();
                return "测试";
            }
        };

        asyncTask.execute();

    }
}
