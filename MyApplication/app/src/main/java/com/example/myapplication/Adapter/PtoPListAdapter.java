package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Entity.PtoPMessage;
import com.example.myapplication.R;

import java.util.List;
import java.util.zip.Inflater;

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

        final PtoPMessage item = getItem(position);

        View view = null;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.activity_ptop_item, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.mMessage = (TextView) view.findViewById(R.id.tv_ptop_message);


            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) convertView.getTag();

        }

        if (null != item) {
            viewHolder.mMessage.setText(item.getContent());

            return view;
        }
        return super.getView(position, convertView, parent);
    }

    class ViewHolder {

        TextView mMessage;

    }

    @Override
    public int getCount() {
        return mItemList.isEmpty() ? 0 : mItemList.size();
    }

    @Nullable
    @Override
    public PtoPMessage getItem(int position) {
        return mItemList.isEmpty() ? null : mItemList.get(position);
    }
}
