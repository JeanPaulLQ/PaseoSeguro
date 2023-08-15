package com.someware.paseoseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.someware.paseoseguro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    TextView tvCreateAccount,tvForgotPass;
    EditText email,pass;
    Button btnLogin;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        bindViews();
    }

    private void bindViews(){
        tvCreateAccount = binding.tvCreateAccount;
        tvCreateAccount.setOnClickListener(view->{
            intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}