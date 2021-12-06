package com.example.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;

import java.util.List;

public class ContactFragment extends Fragment {

    private Button mBtnAddFriend;
    private EditText mEtAddFriendName;
    private ListView mLvFriendRequest;
    private ListView mLvContacts;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        mEtAddFriendName = view.findViewById(R.id.et_friend_name);
        mBtnAddFriend = view.findViewById(R.id.btn_add_friend);
        mLvContacts = view.findViewById(R.id.lv_contacts);
        mLvFriendRequest = view.findViewById(R.id.lv_friend_requests);

        mBtnAddFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }
}
