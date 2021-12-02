package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.Controllers.UserControllers.AccountRegistrationController;
import com.example.myapplication.Presenters.AccountRegistrationPresenter;
import com.example.myapplication.R;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private Button mBtnCreateAccount;
    private EditText mEtRegUsername;
    private EditText mEtPassword1;
    private EditText mEtPassword2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mBtnCreateAccount = findViewById(R.id.btn_create_account);
        mEtPassword1 = findViewById(R.id.et_reg_password1);
        mEtPassword2 = findViewById(R.id.et_reg_password2);
        mEtRegUsername = findViewById(R.id.et_reg_username);

        mBtnCreateAccount.setOnClickListener(new View.OnClickListener() {
            AccountRegistrationController controller = new AccountRegistrationController();
            AccountRegistrationPresenter presenter = new AccountRegistrationPresenter();

            @Override
            public void onClick(View view) {
                String[] inputs = {mEtRegUsername.getText().toString(), mEtPassword1.getText().toString(),
                        mEtPassword2.getText().toString()};
                if (!TextUtils.isEmpty(inputs[0]) && !TextUtils.isEmpty(inputs[1]) &&
                        !TextUtils.isEmpty(inputs[2])) {
                    controller.createAnAccount(inputs, presenter);

                }
                else{

                }

            }
        });
    }
}