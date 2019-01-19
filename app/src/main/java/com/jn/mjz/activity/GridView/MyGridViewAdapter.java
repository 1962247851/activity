package com.jn.mjz.activity.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jn.mjz.activity.R;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mContent;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context) {
        this.mContent = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new ViewHolder();
            convertView.setTag(holder);
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.textView = convertView.findViewById(R.id.tv_grid_title);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //赋值
        holder.textView.setText("6");
        Glide.with(mContent).load("http://picm.photophoto.cn/015/037/006/0370060483.jpg").into(holder.imageView);
        return convertView;
    }
}
