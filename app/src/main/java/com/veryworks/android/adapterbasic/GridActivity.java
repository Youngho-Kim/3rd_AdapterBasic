package com.veryworks.android.adapterbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // 1 데이터
        ArrayList<Data> datas = new ArrayList<>();
        datas = Loader.getData();
        // 2 아답터
        CustomAdapter adapter = new CustomAdapter(datas, this);

        // 3 연결
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }
}
