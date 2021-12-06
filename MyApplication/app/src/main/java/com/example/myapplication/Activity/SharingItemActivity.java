package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.Adapter.CommentLVAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;

public class SharingItemActivity extends AppCompatActivity {

    ListView commentLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing_item);

        commentLV = findViewById(R.id.lv_comments);
        ArrayList<String[]> commentArrayList = new ArrayList<>();

        // Try out
        commentArrayList.add(new String[]{"lucas", "Hello!"});
        commentArrayList.add(new String[]{"lucas", "Hello"});
        commentArrayList.add(new String[]{"lucas", "Hell"});
        CommentLVAdapter commentLVAdapter = new CommentLVAdapter(this, commentArrayList);
        commentLV.setAdapter(commentLVAdapter);


    }
}