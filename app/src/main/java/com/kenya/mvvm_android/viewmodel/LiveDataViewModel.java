package com.kenya.mvvm_android.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kenya.mvvm_android.util.User;

import java.util.ArrayList;
import java.util.List;

public class LiveDataViewModel extends ViewModel {

    private MutableLiveData<List<User>> userListLiveData;
    private List<User>userList;

    public LiveData<List<User>> getUserList(){
        if(userListLiveData == null){
            userListLiveData = new MutableLiveData<>();
            userList = new ArrayList<>();
        }
        return userListLiveData;
    }
    public void addUser (User user){
        userList.add(user);
        userListLiveData.setValue(userList);
    }
}
