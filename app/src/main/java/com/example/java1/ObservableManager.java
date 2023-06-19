package com.example.java1;

public class ObservableManager {
    private MyObservable mMyObservable;
    private ObservableManager(){
        mMyObservable=new MyObservable();
    }
    private static volatile ObservableManager mObservableManager;
    public static ObservableManager getInstance(){
        if(mObservableManager==null){
            synchronized (ObservableManager.class){
                if(mObservableManager==null){
                    mObservableManager=new ObservableManager();
                }
            }
        }
        return mObservableManager;
    }
    public void addObserver(IMyObserver mIMyObserver){
        mMyObservable.addObserver(mIMyObserver);
    }
    public void removeObserver(IMyObserver mIMyObserver){
        mMyObservable.removeObserver(mIMyObserver);
    }
    public void notifyObserver(Object...arg){
        mMyObservable.notifyObserver(arg);
    }
}
