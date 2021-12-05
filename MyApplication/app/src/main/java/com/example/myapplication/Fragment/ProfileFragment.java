package com.example.myapplication.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Activity.BlockedListActivity;
import com.example.myapplication.Activity.LoginActivity;
import com.example.myapplication.Controllers.UserControllers.FindLoggedInUserController;
import com.example.myapplication.Controllers.UserControllers.LogOutController;
import com.example.myapplication.Presenters.FindLoggedInUserPresenter;
import com.example.myapplication.R;

public class ProfileFragment extends Fragment {

    private Button mBtnLogout;
    private ImageView mIvProfilePic;
    private TextView mTvUsername;
    private Button mBtnBlockList;
//    private Button mBtnUpdateProfile;

//    private Uri;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        mBtnLogout = view.findViewById(R.id.btn_logout);
        mTvUsername = view.findViewById(R.id.tv_profile_name);
        mIvProfilePic = view.findViewById(R.id.iv_profile_pic);
        mBtnBlockList = view.findViewById(R.id.btn_blocked_list);
//        mBtnUpdateProfile = view.findViewById(R.id.btn_update_pic);

        String userName;
        LogOutController logOutController = new LogOutController();
        FindLoggedInUserController findLoggedInUserController = new FindLoggedInUserController();
        FindLoggedInUserPresenter findLoggedInUserPresenter = new FindLoggedInUserPresenter();
        findLoggedInUserController.findLoggedInUser(findLoggedInUserPresenter);
        userName = findLoggedInUserPresenter.presentOutput();
        mTvUsername.setText(userName);

        mBtnLogout.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View view) {

                logOutController.runLogOut(userName);
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        mBtnBlockList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BlockedListActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        return view;
    }

}
