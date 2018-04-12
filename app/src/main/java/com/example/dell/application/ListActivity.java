package com.example.dell.application;

import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import dto.AdminSystem;
import dto.Control;
import dto.RecordTask;
import vo.RecordVo;

public class ListActivity extends AppCompatActivity {
    private List<RecordVo> recordVoList=new ArrayList<RecordVo>();
    private RecoderVoAdpater recoderVoAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);
        //Button b1=(Button)findViewById(R.id.button_ref);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recoderVoAdpater =new RecoderVoAdpater(recordVoList);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(recoderVoAdpater);
        final SwipeRefreshLayout swipeRefreshLayout=(SwipeRefreshLayout)findViewById(R.id.refresh);
        swipeRefreshLayout.setProgressViewOffset(true,50,200);
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                RecordTask task=new RecordTask(recordVoList,recoderVoAdpater);
                task.execute();
                recoderVoAdpater.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    private void intidata() {
        for(int i=0;i<2;i++){
        RecordVo r1=new RecordVo("001",2018-10-10,"001","几把");
        recordVoList.add(r1);
    }

    }
}
