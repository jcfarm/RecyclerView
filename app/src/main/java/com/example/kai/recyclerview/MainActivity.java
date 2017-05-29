package com.example.kai.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private Tab1Adapter mAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();
        initView1();
        mAdapter1 = new Tab1Adapter(this,mDatas);
        mRecyclerView.setAdapter(mAdapter1);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);//垂直显示
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));//分格显示

    }

    private void initView1() {
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);
    }

    private void initDatas() {
        mDatas = new ArrayList<String>();
        for (int i = 1; i<=10 ; i++){
            mDatas.add(i+"号大棚");
        }
    }
}
