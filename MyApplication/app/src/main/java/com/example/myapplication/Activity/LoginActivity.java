package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.Controllers.UserControllers.LogInController;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    private TextView mTvRegistration;

    private boolean loggedIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LogInController logInController = new LogInController();

        mEtPassword = findViewById(R.id.et_password);
        mEtUsername = findViewById(R.id.et_username);
        mBtnLogin = findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(view -> {
            mEtUsername.getText();
            mEtPassword.getText();

            loggedIn = logInController.runLogIn(mEtUsername, mEtPassword);
            if (loggedIn){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(LoginActivity.this, "Please type the correct username or password!", Toast.LENGTH_SHORT).show();

            }
        });
        mTvRegistration = findViewById(R.id.tv_register);
        mTvRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}