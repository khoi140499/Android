package com.example.levellist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView hinh;
    Button btn;
    int t=1;
    Handler han;
    Timer time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hinh=(ImageView) findViewById(R.id.anh);
        btn=(Button) findViewById(R.id.btn);
//        hinh.setImageLevel(3);
        btn.setOnClickListener(this);

        han=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if(msg.what ==0){
                    if(t < 4){
                        t++;
                        hinh.setImageLevel(t);
                    }
                    else{
                        t=0;
                    }
                }
            }
        };
        time=new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                han.sendEmptyMessage(0);
            }
        }, 1000, 1000);
    }

    @Override
    public void onClick(View v) {
//        t++;
//        hinh.setImageLevel(t);
    }
}