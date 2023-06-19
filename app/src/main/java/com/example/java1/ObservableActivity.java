package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class ObservableActivity extends AppCompatActivity implements IMyObserver{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable);
        ObservableManager.getInstance().addObserver(this);
        mHandler.post(new Runnable() {
            @Override
            public void run() {

            } bn
        },5*1000);
    }
    private Handler mHandler=new Handler();
    @Override
    public void notify(Object... args) {
        Toast.makeText(this, ""+args[0].toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        ObservableManager.getInstance().removeObserver(this);
    }
}