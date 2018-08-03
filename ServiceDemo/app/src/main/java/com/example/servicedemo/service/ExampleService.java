package com.example.servicedemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class ExampleService extends Service {
    int mStartMode;      //指明service被杀死后将会进行的操作
    IBinder mBinder;
    boolean mAllowRebind;   //

    @Override
    public void onCreate() {
        super.onCreate();
        //service被创建
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //service通过startService()启动
       // return super.onStartCommand(intent, flags, startId);

         return mStartMode;
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //client通过bindService()绑定到client
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        //return super.onUnbind(intent);
        //client通过unbindService()与service解除绑定
         return mAllowRebind;
    }

    @Override
    public void onRebind(Intent intent) {
        //super.onRebind(intent);
        //在onUnbind()被调用后，client通过bindService()绑定service
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
