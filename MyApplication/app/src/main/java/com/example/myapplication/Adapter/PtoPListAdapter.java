package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Entity.PtoPMessage;

import java.util.List;

public class PtoPListAdapter extends ArrayAdapter<PtoPMessage> {

    private Context mContext;
    private int mResourceID;
    private List<PtoPMessage> mItemList;

    public PtoPListAdapter(Context context, int resource, List<PtoPMessage> itemList){
        super(context, resource, itemList);
        this.mContext = context;
        this.mResourceID = resource;
        this.mItemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        final PtoPMessage item =

        View view = null;
        RecyclerView.ViewHolder viewHolder;
        return super.getView(position, convertView, parent);
    }
}
