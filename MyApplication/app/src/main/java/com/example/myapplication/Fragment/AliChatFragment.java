package com.example.myapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Activity.GCMainActivity;
import com.example.myapplication.Activity.GChatActivity;

import com.example.myapplication.Activity.LoginActivity;

import com.example.myapplication.Activity.PtoPitemActivity;
import com.example.myapplication.Adapter.PtoPListAdapter;
import com.example.myapplication.Controllers.ChatControllers.PtoPMessageController;
import com.example.myapplication.Controllers.ChatControllers.PtoPMessageFacade;
import com.example.myapplication.Controllers.UserControllers.CheckFriendController;
import com.example.myapplication.Entity.PtoPMessage;
import com.example.myapplication.Presenters.CheckFriendPresenter;
import com.example.myapplication.Presenters.PtoPMessageHistoryPresenter;
import com.example.myapplication.R;
import com.example.myapplication.Activity.PtoPitemActivity;
import com.example.myapplication.Adapter.PtoPListAdapter;
import com.example.myapplication.Controllers.ChatControllers.PtoPMessageController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AliChatFragment extends Fragment {

    private Button mBtnGC;
    private Button mBtnSend;
    private EditText mEtFriendName;
    private EditText mEtMessage;
    private EditText mEtMyName;
    private ListView mLvPtoP;

    private PtoPListAdapter ptoPListAdapter;

    private List<String> mPtoPList = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ptop_chat, container, false);

        mBtnGC = view.findViewById(R.id.btn_group_chat);
        mBtnSend = view.findViewById(R.id.btn_send);
        mEtFriendName = view.findViewById(R.id.et_friend_name);
        mEtMessage = view.findViewById(R.id.et_message);
        mEtMyName = view.findViewById(R.id.et_my_name);
        mLvPtoP = view.findViewById(R.id.lv_ptop);

        // Go to group chat page
        mBtnGC.setOnClickListener(view1 -> {
            Intent intent = new Intent(view1.getContext(), GCMainActivity.class);
            view.getContext().startActivity(intent);
        });


        PtoPMessageFacade ptoPMessageFacade = new PtoPMessageFacade();
        PtoPMessageController ptoPMessageController = new PtoPMessageController();
        PtoPMessageHistoryPresenter ptoPMessageHistoryPresenter = new PtoPMessageHistoryPresenter();
        // Haven't been implemented yet

        CheckFriendController checkFriendController = new CheckFriendController();
        CheckFriendPresenter checkFriendPresenter = new CheckFriendPresenter();

        // Send message and present message
        mBtnSend.setOnClickListener(view1 -> {
            String message = mEtMessage.getText().toString();
            String friendUsername = mEtFriendName.getText().toString();
            String myUserName = mEtMyName.getText().toString();

            // haven't been implemented yet
            checkFriendController.runCheckFriend(myUserName, friendUsername, checkFriendPresenter);
            boolean isFriend = checkFriendPresenter.isFriend();

            //write if statement that searches if friend is an existing friend and send out message.
            if (isFriend){
                // send message
                try {
                    ptoPMessageFacade.sendMessage(myUserName,friendUsername,message);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //receive message
                ptoPMessageFacade.receiveMessageHistory(myUserName,friendUsername,ptoPMessageHistoryPresenter);
                // return chat history, and turn it into an array, each element is a message
                String chatHistory = ptoPMessageHistoryPresenter.present();
                String[] chatArray = chatHistory.split("\n");
                for (String chat: chatArray){
                    mPtoPList.add(chat);
                }

                // Haven't been implemented yet:
                // After click Send Button, present the message in chatArray on the phone line by line
            }else{
                Toast.makeText(view.getContext(), "Not valid friend",Toast.LENGTH_SHORT).show();
                // Haven't been implemented yet:
                // When they are not friends
                // Pop up a warning show "No friend found"
            }

        });

        ptoPListAdapter = new PtoPListAdapter(getActivity(), R.layout.activity_ptop_item, mPtoPList);
        mLvPtoP.setAdapter(ptoPListAdapter);

        return view;
    }

}