package com.example.myapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Activity.GChatActivity;
import com.example.myapplication.Activity.PtoPitemActivity;
import com.example.myapplication.Entity.PtoPMessage;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AliChatFragment extends Fragment {

    private Button mBtnGC;
    private Button mBtnSend;
    private EditText mEtFriendName;
    private EditText mEtMessage;

    private List<PtoPMessage> mPtoPList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ptop_chat, container, false);

        mBtnGC = view.findViewById(R.id.btn_group_chat);
        mBtnSend = view.findViewById(R.id.btn_send);
        mEtFriendName = view.findViewById(R.id.et_friend_name);
        mEtMessage = view.findViewById(R.id.message);

        mBtnGC.setOnClickListener(view1 -> {
            Intent intent = new Intent(view1.getContext(), GChatActivity.class);
            view.getContext().startActivity(intent);
        });

        mBtnSend.setOnClickListener(view1 -> {
            String message = mEtMessage.getText().toString();
            String friend = mEtFriendName.getFontFeatureSettings().toString();
            //write if statement that searches if friend is an existing friend and send out message.
        });

        return view;
    }

}