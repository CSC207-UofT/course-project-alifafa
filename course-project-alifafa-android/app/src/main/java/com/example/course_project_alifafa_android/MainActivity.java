package com.example.course_project_alifafa_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.course_project_alifafa_android.Fragment.ChatFragment;
import com.example.course_project_alifafa_android.Fragment.ContactFragment;
import com.example.course_project_alifafa_android.Fragment.ProfileFragment;
import com.example.course_project_alifafa_android.Fragment.SharingCentreFragment;


public class MainActivity extends AppCompatActivity {
    private FrameLayout mFlMainContainer;

    private RadioGroup mRgMain;
    private RadioButton mRbChat;
    private RadioButton mRbContact;
    private RadioButton mRbSharingCentre;
    private RadioButton mRbProfile;

    private ChatFragment mChatFragment;
    private ContactFragment mContactFragment;
    private ProfileFragment mProfileFragment;
    private SharingCentreFragment mSharingCentreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRgMain = findViewById(R.id.rg_main);
        mRbChat = findViewById(R.id.rb_chat);
        mRbContact = findViewById(R.id.rb_contact);
        mRbSharingCentre = findViewById(R.id.rb_sharing_centre);
        mRbProfile = findViewById(R.id.rb_profile);

        mChatFragment = new ChatFragment();
        mContactFragment = new ContactFragment();
        mProfileFragment = new ProfileFragment();
        mSharingCentreFragment = new SharingCentreFragment();

//        mRgMain.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);
//
//        mRbChat.setChecked(true);
//        replaceFragment(mChatFragment);
    }

//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fl_main_container,fragment);
//        fragmentTransaction.commit();
//    }
//
//    public void onCheckedChanged(RadioGroup radioGroup, int i) {
//        switch (i) {
//
//            case R.id.rb_chat:
//                if(null != mChatFragment){
//                    mChatFragment = new ChatFragment();
//                }
//                replaceFragment(mChatFragment);
//                break;
//
//            case R.id.rb_contact:
//                if(null != mContactFragment) {
//                    mContactFragment = new ContactFragment();
//                }
//                replaceFragment(mContactFragment);
//                break;
//
//            case R.id.rb_sharing_centre:
//                if (null != mSharingCentreFragment) {
//                    mSharingCentreFragment = new SharingCentreFragment();
//                }
//                replaceFragment(mSharingCentreFragment);
//                break;
//
//            case R.id.rb_profile:
//                if(null != mProfileFragment){
//                    mProfileFragment = new ProfileFragment();
//                }
//                replaceFragment(mProfileFragment);
//                break;
//
//
//            default:
//                break;
//        }
//    }
//
}