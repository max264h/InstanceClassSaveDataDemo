package com.example.instanceclasssavedatademo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etEmail, etPassword;
    private Button btnSave, btnLogin;


    private LoginData loginData = LoginData.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();


    }

    private void bindUI() {
        etUsername = findViewById(R.id.usernameEditText);
        etEmail = findViewById(R.id.emailEditText);
        etPassword = findViewById(R.id.passwordEditText);
        btnSave = findViewById(R.id.saveButton);
        btnLogin = findViewById(R.id.loginButton);

        btnSave.setOnClickListener(this::onSaveButtonClick);

        btnLogin.setOnClickListener(this::onLoginButtonClick);
    }

    private void onLoginButtonClick(View view) {
        if (loginData.getEmail().equals(etEmail.getText().toString()) &&
                loginData.getPassword().equals(etPassword.getText().toString()) &&
                loginData.getUsername().equals(etUsername.getText().toString())) {
            Toast.makeText(this, "登入成功", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "登入失敗", Toast.LENGTH_SHORT).show();
        }
    }

    private void onSaveButtonClick(View view) {
        loginData.setUsername(etUsername.getText().toString());
        loginData.setEmail(etEmail.getText().toString());
        loginData.setPassword(etPassword.getText().toString());

        Toast.makeText(this, "以儲存資料", Toast.LENGTH_SHORT).show();
    }
}