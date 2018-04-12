package com.example.dell.application;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("标签1").setContent(new Intent().setClass(this,ListActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("标签2").setContent(new Intent().setClass(this,SecondActivity.class)));

    }
}
