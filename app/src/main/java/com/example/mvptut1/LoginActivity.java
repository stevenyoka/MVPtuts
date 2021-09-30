package com.example.mvptut1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvptut1.databinding.ActivityLogin2Binding;

public class LoginActivity extends AppCompatActivity implements LoginInterface.LoginViewInterface {
    private ActivityLogin2Binding binding;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogin2Binding.inflate(getLayoutInflater());
        loginPresenter = new LoginPresenter(this);
        setContentView(binding.getRoot());

        Button btnLogin = binding.button;
        EditText edUsername = binding.editTextTextPersonName;
        EditText edPassword = binding.editTextTextPassword;

        btnLogin.setOnClickListener(v -> {
            loginPresenter.checkLogin(edUsername.getText().toString(), edPassword.getText().toString());
        });
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }
}