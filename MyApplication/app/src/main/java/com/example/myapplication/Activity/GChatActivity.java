package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.myapplication.Controllers.ChatControllers.PtoGMessageFacade;
import com.example.myapplication.Entity.PtoGMessage;
import com.example.myapplication.Presenters.PtoGMessageHistoryPresenter;
//import com.example.myapplication.R;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class GChatActivity extends AppCompatActivity {
//
//    private Button mBtnSend;
//    private EditText mEtGroupName;
//    private EditText mEtMessage;
//    private EditText mEtMyID;
//
//    private List<PtoGMessage> mPtoGList = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gchat);
//
//
//        public View onCreateview(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_ptop_chat, container, false);
//
//
//        mBtnSend = view.findViewById(R.id.btn_send);
//        mEtGroupName = view.findViewById(R.id.et_group_name);
//        mEtGroupMessage = view.findViewById(R.id.groupMessage);
//        mEtMyID = view.findViewById(R.id.et_my_id);
//
//
//        PtoGMessageFacade ptoGMessageFacade = new PtoGMessageFacade();
//        PtoGMessageHistoryPresenter ptoGMessageHistoryPresenter = new PtoGMessageHistoryPresenter();
//        // Haven't been implemented yet
////        CheckFriendController checkFriendController = new CheckFriendController();
//
//        // Send message and present message
//        mBtnSend.setOnClickListener(view1 -> {
//            String message = mEtGroupMessage.getText().toString();
//            String friendUsername = mEtGroupName.getText().toString();
//            String myID = mEtMyID.getText().toString();
//
//            try {
//                ptoGMessageFacade.sendMessage(myID,friendUsername,message);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            //receive message
//            ptoGMessageFacade.receiveMessageHistory(myID,friendUsername,ptoGMessageHistoryPresenter);
//            // return chat history, and turn it into an array, each element is a message
//            String chatHistory = ptoGMessageHistoryPresenter.present();
//            String[] chatArray = chatHistory.split("\n");
//
//        });
//
//        return view;
//    }
//
//}