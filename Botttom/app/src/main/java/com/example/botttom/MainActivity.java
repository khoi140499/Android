package com.example.botttom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnXuatTB, btnXinChao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnXuatTB = (Button) findViewById(R.id.btn1);
        btnXinChao = (Button) findViewById(R.id.btn2);

        btnXuatTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "XIn chao casc ban, ban vua click button xuat thong bao" , Toast.LENGTH_LONG).show();
            }
        });

        btnXinChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "XIn chao casc ban, ban vua click button xin chao", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void XuatTB(View v){
        switch (v.getId()){
            case R.id.btn1:{
                Toast.makeText(MainActivity.this, "XIn chao casc ban, ban vua click button xuat thong bao" , Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn2:{
                Toast.makeText(MainActivity.this, "XIn chao casc ban, ban vua click button xin chao", Toast.LENGTH_LONG).show();
                break;
            }
        }
//        String getl=String.valueOf(v.getId());
//        Button bt = (Button) v;
//        String ten = (String) bt.getText();
//        Toast.makeText(MainActivity.this, "XIn chao casc ban, ban vua click button " + ten, Toast.LENGTH_LONG).show();
    }
}