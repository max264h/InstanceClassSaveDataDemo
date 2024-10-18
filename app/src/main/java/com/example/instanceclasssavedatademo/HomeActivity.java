package com.example.instanceclasssavedatademo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    private TextView userDataTextView;
    private Button getDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bindUI();
    }

    private void bindUI() {
        userDataTextView = findViewById(R.id.user_data_textView);
        getDataButton = findViewById(R.id.get_data_button);

        getDataButton.setOnClickListener(view -> {
            LoginData loginData = LoginData.getInstance();
            String username = loginData.getUsername();
            String email = loginData.getEmail();
            String password = loginData.getPassword();
            userDataTextView.setText(String.format("用戶名：%s\n電子郵件：%s\n密碼：%s", username, email, password));
        });
    }
}