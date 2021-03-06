package com.jn.mjz.activity.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jn.mjz.activity.R;
import com.jn.mjz.activity.Util.ToastUtil;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private Context mContext;

    public MyRecyclerViewAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder viewHolder, final int i) {
        //赋值等操作
        viewHolder.mTv.setText("" + i);
        viewHolder.itemView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_SCROLL:
                        ToastUtil.showMsg(mContext, "SCROLLING" + i);
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        //  ToastUtil.showMsg(mContext, "CANCELED" + i);
                        break;
                    case MotionEvent.ACTION_HOVER_MOVE:
                        ToastUtil.showMsg(mContext, "HOVER_MOVING" + i);
                        break;
                    //按下后触点发生移动时
                    case MotionEvent.ACTION_MOVE:
                        ToastUtil.showMsg(mContext, "MOVING" + i);
                        break;
                }
                return false;
            }
        });
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showMsg(mContext, "" + i);
            }
        });
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.tv_rv);
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
