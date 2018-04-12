package com.example.dell.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText editText1=(EditText)findViewById(R.id.ed1);
        EditText editText2=(EditText)findViewById(R.id.ed2);
        Button button=(Button)findViewById(R.id.button1);


    }
}
