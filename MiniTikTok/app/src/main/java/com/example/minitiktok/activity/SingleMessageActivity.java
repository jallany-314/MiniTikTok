package com.example.minitiktok.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.minitiktok.R;

public class SingleMessageActivity extends SimpleActivity{
    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_single);
        Log.i(TAG, "ItemActivity onCreate");
        Bundle bundle = this.getIntent().getExtras();
        int num = bundle.getInt("1");
        initView(num);
    }

    private void initView(int num){
        TextView tv = findViewById(R.id.textView5);
        tv.setText("点击了" + num + "号");
    }
}
