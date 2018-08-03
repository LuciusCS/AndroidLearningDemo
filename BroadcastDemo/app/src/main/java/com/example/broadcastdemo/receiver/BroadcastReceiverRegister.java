package com.example.broadcastdemo.receiver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.broadcastdemo.application.ApplicationDemo;

public class BroadcastReceiverRegister extends BroadcastReceiver {
    

    @Override
    public void onReceive(Context context, Intent intent) {


        Log.i("测试","++++++");
    }
}
