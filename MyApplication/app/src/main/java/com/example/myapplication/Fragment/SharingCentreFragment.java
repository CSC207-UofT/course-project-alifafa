package com.example.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.Adapter.SharingCentreFragmentAdapter;
import com.example.myapplication.Entity.ParagraphPost;
import com.example.myapplication.R;

import java.util.List;

public class SharingCentreFragment extends Fragment {

    private RecyclerView mRVPosts;
    public static List<String[]> postInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sharing_centre, container, false);

        // Try out
        for (int i = 0; i < 10; i++) {
            String[] temp = {"user"+i, "content"+i, "location", "1"};
            postInfo.add(temp);
        }

        mRVPosts = view.findViewById(R.id.rv_sharing_centre);
        // Use an adapter to display item
        mRVPosts.setLayoutManager(new LinearLayoutManager(view.getContext()));
        mRVPosts.setAdapter(new SharingCentreFragmentAdapter(view.getContext()));

        return view;
    }

}
