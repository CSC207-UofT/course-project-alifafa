package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;

import java.util.ArrayList;

public class CommentLVAdapter extends ArrayAdapter<String[]> {

    public CommentLVAdapter(Context context, int res, ArrayList<String[]> commentsArrayList) {
        super(context, res, commentsArrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View list_itemView = convertView;
            if (list_itemView == null) {
                // Layout Inflater inflates each item to be displayed in ListView.
                list_itemView = LayoutInflater.from(getContext()).inflate(R.layout.include_item_comment, parent, false);
            }
            String[] comment = getItem(position);
            TextView commenterTV = list_itemView.findViewById(R.id.tv_commenter);
            TextView commentTV = list_itemView.findViewById(R.id.tv_comment);
            commenterTV.setText(comment[0]);
            commentTV.setText(comment[1]);
            return list_itemView;
    }


}
