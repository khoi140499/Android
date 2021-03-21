package com.example.transitiondm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView txt1;
    TransitionDrawable ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        ts=(TransitionDrawable) txt1.getDrawable();
    }

    public void BatDau(View v) {
//        ts.startTransition(5000);
        ts.reverseTransition(5000);
    }
}