

package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.Controllers.UserControllers.LogInController;
import com.example.myapplication.Fragment.ProfileFragment;
import com.example.myapplication.MainActivity;
import com.example.myapplication.Presenters.LogInPresenter;
import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    private TextView mTvRegistration;

    private boolean loggedIn;
    private String message;
    private OnGenerateStringListener onGenerateStringListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onGenerateStringListener = (OnGenerateStringListener) this;
        onStartGenerateStringFragment();

        try {
            generateString();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LogInController logInController = new LogInController();
        LogInPresenter logInPresenter = new LogInPresenter();

        mEtPassword = findViewById(R.id.et_password);
        mEtUsername = findViewById(R.id.et_username);
        mBtnLogin = findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(view -> {

            logInController.runLogIn(mEtUsername.getText().toString(), mEtPassword.getText().toString(), logInPresenter);

            if (logInPresenter.isLoggedIn()){

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }else{
                message = logInPresenter.presentOutput();
                Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();

            }
        });
        mTvRegistration = findViewById(R.id.tv_register);
        mTvRegistration.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }

    private void generateString() throws InterruptedException {

        // After string userName is generated
        String userName = "userName";
        onGenerateStringListener.onGeneratedString(userName);

        // Sleep 10 secs
        Thread.sleep(10000);

//        String b = "test Two";
//        onGenerateStringListener.onGeneratedString(b);
//
//        // Sleep 10 secs
//        Thread.sleep(10000);
//
//        String c = "test Three";
//        onGenerateStringListener.onGeneratedString(c);

    }

    private void onStartGenerateStringFragment() {
        //Method to launch your fragment
    }

    interface OnGenerateStringListener {
        void onGeneratedString(String string);
    }
}