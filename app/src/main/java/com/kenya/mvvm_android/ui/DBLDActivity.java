package com.kenya.mvvm_android.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.kenya.mvvm.R;
import com.kenya.mvvm.databinding.ActivityDataBindingBinding;
import com.kenya.mvvm_android.util.User;
import com.kenya.mvvm_android.viewmodel.DBLDViewModel;

public class DBLDActivity extends AppCompatActivity {
    private DBLDViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dbldactivity);
        binding.setLifecycleOwner(this);
        viewModel = ViewModelProviders.of(this).get(DBLDViewModel.class);
        binding.setViewModel(viewModel);

        User user = new User("Kenya", "24");
        viewModel.setUser(user);
    }
}