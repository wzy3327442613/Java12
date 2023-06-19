package com.example.java1;

import java.util.ArrayList;
import java.util.List;

public class MyObservable {
    private List<IMyObserver> mList=new ArrayList<>();
    public void addObserver(IMyObserver mIMyObserver){
        if(!mList.contains(mIMyObserver)){
            mList.add(mIMyObserver);
        }
    }
    public void removeObserver(IMyObserver mIMyObserver){
        if(mList.contains(mIMyObserver)){
            mList.remove(mIMyObserver);
        }
    }
    public void notifyObserver(Object...arg){
        for (IMyObserver mIMyObserver : mList) {
            mIMyObserver.notify(arg);
        }
    }


}
