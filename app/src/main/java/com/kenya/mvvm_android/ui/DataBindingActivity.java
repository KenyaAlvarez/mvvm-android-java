package com.kenya.mvvm_android.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.kenya.mvvm.R;
import com.kenya.mvvm.databinding.ActivityDataBindingBinding;
import com.kenya.mvvm_android.util.User;

public class DataBindingActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        user = new User("Jhon", "30");

        binding.setUser(user);
    }
}