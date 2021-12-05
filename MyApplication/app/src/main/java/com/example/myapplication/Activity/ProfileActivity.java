package com.example.myapplication.Activity;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class ProfileActivity extends AppCompatActivity {

    private Button mBtnBlockedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnBlockedList = findViewById(R.id.btn_blocked_list);
    }
}
