package com.example.java1;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    private int id;
    private String name;
    private int age;
    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int mId) {
        id = mId;
        notifyPropertyChanged(BR.id);
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String mName) {
        name = mName;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int mAge) {
        age = mAge;
        notifyPropertyChanged(BR.age);
    }
}
