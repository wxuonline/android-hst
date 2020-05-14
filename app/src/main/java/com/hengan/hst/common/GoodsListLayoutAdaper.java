package com.hengan.hst.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hengan.hst.R;

import java.util.ArrayList;


public class GoodsListLayoutAdaper extends RecyclerView.Adapter<GoodsListLayoutAdaper.MyTVHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final ArrayList<String> mData;

    public GoodsListLayoutAdaper(Context mContext) {
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mData = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            this.mData.add("hello" + i);
        }
    }

    @Override
    public GoodsListLayoutAdaper.MyTVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GoodsListLayoutAdaper.MyTVHolder(mLayoutInflater.inflate(R.layout.goods_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyTVHolder holder, int position) {
        holder.mTextView.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public class MyTVHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public MyTVHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.txt);
        }
    }
}