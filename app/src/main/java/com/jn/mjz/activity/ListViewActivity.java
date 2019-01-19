package com.jn.mjz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private ListView mlvListView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mlvListView1 = findViewById(R.id.lv_lv1);
        mlvListView1.setAdapter(new MyListViewAdapter(ListViewActivity.this));
        mlvListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "点击pos:" + position, Toast.LENGTH_SHORT).show();
                //其它操作
            }
        });
        mlvListView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "长按pos:" + position, Toast.LENGTH_SHORT).show();
                return true;//已经处理完,操作,不会触发单击事件
            }
        });
    }
}
