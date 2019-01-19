package com.jn.mjz.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mRecyclerView = findViewById(R.id.id_recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this));
        mRecyclerView.setAdapter(new MyRecyclerViewAdapter(RecyclerViewActivity.this));
    }
}
