package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.java1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ObservableField<String> name=new ObservableField<>("小明");
    public User mUser=new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUser.setName("小妹");
        ActivityMainBinding mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setWoo(this);
    }
    public String getXUsername(){
        return "123";
    }
    public void getToast(){
        name.set("小黑");
        mUser.setName("小哥");
    }
}