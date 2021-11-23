package com.example.course_project_alifafa_android.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.course_project_alifafa_android.MainActivity;
import com.example.course_project_alifafa_android.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEtUserName;
    private EditText mEtPassword;
    private Button mBtnLogin;
    private TextView mTvRegister;

    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEtUserName = findViewById(R.id.et_username);
        mEtPassword = findViewById(R.id.et_password);

        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(mEtUserName.getText())
                        && !TextUtils.isEmpty(mEtPassword.getText())) {
                    mBtnLogin.setEnabled(true);
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    mBtnLogin.setEnabled(false);
                    Toast.makeText(LoginActivity.this,"Please enter the correct...",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mTvRegister = findViewById(R.id.tv_register);
        mTvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}