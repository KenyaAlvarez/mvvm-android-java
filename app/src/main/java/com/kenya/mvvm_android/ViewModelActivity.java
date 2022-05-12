package com.kenya.mvvm_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.kenya.mvvm.R;
import com.kenya.mvvm_android.Util.Sumar;
import com.kenya.mvvm_android.viewmodel.SumarViewModel;

public class ViewModelActivity extends AppCompatActivity {
        private TextView tvSumar;
        private TextView tvSumarViewModel;
        private Button btSumar;
        private int resultado;
        private SumarViewModel sumarViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

        setUpView();
    }

    private void setUpView() {
        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel.class);

        tvSumar = findViewById(R.id.tvSumar);
        tvSumarViewModel = findViewById(R.id.tvSumarViewModel);
        btSumar = findViewById(R.id.btSumar);
        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = Sumar.sumar(resultado);
                tvSumar.setText("" + resultado);

                sumarViewModel.setResultado(Sumar.sumar(sumarViewModel.getResultado()));
                tvSumarViewModel.setText(""+ sumarViewModel.getResultado());
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "onDestroy()");
    }
}