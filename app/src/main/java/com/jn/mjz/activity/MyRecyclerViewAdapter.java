package com.jn.mjz.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private Context mContext;

    public MyRecyclerViewAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_home, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv.setText("Hello World!\n" + i);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        public ViewHolder(View view) {
            super(view);
            tv = view.findViewById(R.id.tv_recycler);
        }
    }
}
