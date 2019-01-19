package com.jn.mjz.activity.PopUp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.jn.mjz.activity.R;
import com.jn.mjz.activity.Util.ToastUtil;

public class PopUpWindowActivity extends AppCompatActivity {

    private Button mBtnPop,mBtnPop1;
    private PopupWindow mPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_window);
        mBtnPop = findViewById(R.id.pop_btn);
        mBtnPop1 = findViewById(R.id.pop_btn1);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_pop_up, null);
                TextView textView1 = view.findViewById(R.id.pop_tv1);
                TextView textView2 = view.findViewById(R.id.pop_tv2);
                TextView textView3 = view.findViewById(R.id.pop_tv3);
                TextView textView4 = view.findViewById(R.id.pop_tv4);
                textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView1");
                    }
                });
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView2");
                    }
                });
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView3");
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView4");
                    }
                });
                mPop = new PopupWindow(view, mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.setContentView(view);
                mPop.setOutsideTouchable(true);
                mPop.setFocusable(true);
                switch (v.getId()){
                    case R.id.pop_btn:
                        mPop.showAsDropDown(mBtnPop);
                        break;
                    case R.id.pop_btn1:
                        mPop.showAsDropDown(mBtnPop1);
                        break;
                }
                return false;
            }
        };
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_pop_up, null);
                TextView textView1 = view.findViewById(R.id.pop_tv1);
                TextView textView2 = view.findViewById(R.id.pop_tv2);
                TextView textView3 = view.findViewById(R.id.pop_tv3);
                TextView textView4 = view.findViewById(R.id.pop_tv4);
                textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView1");
                    }
                });
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView2");
                    }
                });
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView3");
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(getApplicationContext(), "TextView4");
                    }
                });
                mPop = new PopupWindow(view, mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.setContentView(view);
                mPop.setOutsideTouchable(true);
                mPop.setFocusable(true);
                switch (v.getId()){
                    case R.id.pop_btn:
                        mPop.showAsDropDown(mBtnPop);
                        break;
                    case R.id.pop_btn1:
                        mPop.showAsDropDown(mBtnPop1);
                        break;
                }

            }
        };
        mBtnPop1.setOnClickListener(onClickListener);
        mBtnPop1.setOnLongClickListener(onLongClickListener);
        mBtnPop.setOnClickListener(onClickListener);
        mBtnPop.setOnLongClickListener(onLongClickListener);
    }
}
