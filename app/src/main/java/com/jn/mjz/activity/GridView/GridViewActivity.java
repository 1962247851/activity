package com.jn.mjz.activity.GridView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.jn.mjz.activity.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
    }
}
