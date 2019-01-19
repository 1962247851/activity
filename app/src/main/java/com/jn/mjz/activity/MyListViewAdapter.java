package com.jn.mjz.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MyListViewAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 15;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle;
        public TextView tvTime;
        public TextView tvContent;
    }

    //设置list的样式
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag((holder));
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("8102年");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(holder.imageView);
        return convertView;
    }
}
