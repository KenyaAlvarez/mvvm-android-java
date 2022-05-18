package com.kenya.mvvm_android.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kenya.mvvm_android.util.User;

public class DBLDViewModel extends ViewModel {

    private MutableLiveData<User>user;

    public DBLDViewModel(){
        user = new MutableLiveData<>();
    }

    public LiveData<User>getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public void updateUser(){
        User user = new User("Laura", "23");
        this.user.setValue(user);
    }
}
