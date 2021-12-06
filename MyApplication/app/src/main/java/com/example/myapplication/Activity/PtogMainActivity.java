package com.example.myapplication.Activity;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class PtogMainActivity extends AppCompatActivity {
    private Button mBtnCreateGroup;
    private Button mBtnJoinGroup;
    private Button mBtnGroupChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptog_main);
        // Go to group chat page
        mBtnCreateGroup = findViewById(R.id.btn_create_group);
//        mBtnJoinGroup = findViewById(R.id.btn_join_group);
//        mBtnGroupChat = findViewById(R.id.btn_group_chat);

//        mBtnCreateGroup.setOnClickListener(view1 -> {
//            Intent intent = new Intent(view1.getContext(), CreateGroupActivity.class);
//            view1.getContext().startActivity(intent);
//        });
//        mBtnJoinGroup.setOnClickListener(view1 -> {
//            Intent intent = new Intent(view1.getContext(), JoinGroupActivity.class);
//            view1.getContext().startActivity(intent);
//        });
//        mBtnGroupChat.setOnClickListener(view1 -> {
//            Intent intent = new Intent(view1.getContext(), GChatActivity.class);
//            view1.getContext().startActivity(intent);
//        });
    }
}