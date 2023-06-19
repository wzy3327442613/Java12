package com.example.java1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent mIntent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ObservableManager.getInstance().notifyObserver("111");
        return START_STICKY;

    }
}
