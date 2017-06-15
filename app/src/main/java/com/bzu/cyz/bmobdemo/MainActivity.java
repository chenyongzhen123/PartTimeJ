package com.bzu.cyz.bmobdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"4839d2e36bee04fe7db3f785c8a9debe");
    }
}
