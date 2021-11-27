package com.example.myapplication;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.myapplication.Fragment.AliChatFragment;
import com.example.myapplication.Fragment.ContactFragment;
import com.example.myapplication.Fragment.ProfileFragment;
import com.example.myapplication.Fragment.SharingCentreFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private FrameLayout mFlMainContainer;
    private AliChatFragment mAliChatFragment;
    private ContactFragment mContactFragment;
    private ProfileFragment mProfileFragment;
    private SharingCentreFragment mSharingCentreFragment;

    private RadioButton mRbAliChat;
    private RadioButton mRbContact;
    private RadioButton mRbSharingCentre;
    private RadioButton mRbProfile;
    private RadioGroup mRgMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlMainContainer = findViewById(R.id.fl_main_container);
        mRbAliChat = findViewById(R.id.rb_ali_chat);
        mRbContact = findViewById(R.id.rb_contact);
        mRbSharingCentre = findViewById(R.id.rb_sharing_centre);
        mRbProfile = findViewById(R.id.rb_profile);
        mRgMain = findViewById(R.id.rg_main);

        mAliChatFragment = new AliChatFragment();
        mContactFragment = new ContactFragment();
        mSharingCentreFragment = new SharingCentreFragment();
        mProfileFragment = new ProfileFragment();

        mRgMain.setOnCheckedChangeListener(this);

        mRbAliChat.setChecked(true);
        replaceFragment(mAliChatFragment);


    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_main_container, fragment);
        fragmentTransaction.commit();
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i){
        switch (i) {
            case R.id.rb_ali_chat:
                if (null != mAliChatFragment){
                    mAliChatFragment = new AliChatFragment();
                }
                replaceFragment(mAliChatFragment);
                break;

            case R.id.rb_contact:
                if (null != mContactFragment){
                    mContactFragment = new ContactFragment();
                }
                replaceFragment(mContactFragment);
                break;

            case R.id.rb_sharing_centre:
                if (null != mSharingCentreFragment){
                    mSharingCentreFragment = new SharingCentreFragment();
                }
                replaceFragment(mSharingCentreFragment);
                break;

            case R.id.rb_profile:
                if (null != mProfileFragment){
                    mProfileFragment = new ProfileFragment();
                }
                replaceFragment(mProfileFragment);
                break;

            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}