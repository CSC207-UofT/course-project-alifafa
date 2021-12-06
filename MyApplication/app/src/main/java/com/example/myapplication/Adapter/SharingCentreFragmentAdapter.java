package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.Activity.SharingItemActivity;
import com.example.myapplication.Fragment.SharingCentreFragment;
import com.example.myapplication.R;

import java.util.ArrayList;

import static com.example.myapplication.Fragment.SharingCentreFragment.postInfo;

public class SharingCentreFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;

    public SharingCentreFragmentAdapter(Context context) {
        this.mContext = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_sharing_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String[] info = SharingCentreFragment.postInfo.get(position);
        ((LinearViewHolder) holder).mtvUsername.setText(info[0]);
        ((LinearViewHolder) holder).mtvContent.setText(info[1]);
        ((LinearViewHolder) holder).mtvLocation.setText(info[2]);
        ((LinearViewHolder) holder).mtvLikes.setText(info[3]);
        ArrayList<String[]> commentArrayList = new ArrayList<>();

        // Try out
        commentArrayList.add(new String[]{"lucas", "Hello!"});
        commentArrayList.add(new String[]{"lucas", "Hello"});
        commentArrayList.add(new String[]{"lucas", "Hell"});
        CommentLVAdapter commentLVAdapter = new CommentLVAdapter(mContext, R.layout.support_simple_spinner_dropdown_item, commentArrayList);
        ((LinearViewHolder) holder).mlvComments.setAdapter(commentLVAdapter);

    }

    @Override
    public int getItemCount() {
        return postInfo.size();
    }

    private class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView mtvUsername;
        private TextView mtvContent;
        private TextView mtvLocation;
        private TextView mtvLikes;
        private ListView mlvComments;

        public LinearViewHolder(View itemView) {
            super(itemView);
            mtvContent = itemView.findViewById(R.id.tv_content);
            mtvUsername = itemView.findViewById(R.id.tv_username);
            mtvLocation = itemView.findViewById(R.id.tv_location);
            mtvLikes = itemView.findViewById(R.id.tv_num_likes);
            mlvComments = itemView.findViewById(R.id.lv_comments);
        }
    }
}
