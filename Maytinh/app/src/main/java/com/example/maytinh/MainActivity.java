package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View v;
    long ts1=0, ts2=0, kq=0, ts3=0;
    String tt="", xuatmh="";
    TextView txtKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtKQ=findViewById(R.id.txtKQ);
        int[] id={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btnCong,R.id.btnTru,R.id.btnNhan,R.id.btnChia,R.id.btnCham,R.id.btnBang,R.id.btnXoa};
        for(int as:id){
            v=findViewById(as);
            v.setOnClickListener(this);
        }
    }

    private void tinhToan(){
        ts1=Long.parseLong(xuatmh);
        if(kq!=0){
            ts1=ts3;
        }
        xuatmh="0";
        txtKQ.setText("0");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCong:{
                tt="+";
                tinhToan();
                break;
            }
            case R.id.btnTru:{
                tt="-";
                tinhToan();
                break;
            }
            case R.id.btnNhan:{
                tt="*";
                tinhToan();
                break;
            }
            case R.id.btnChia:{
                tt="/";
                tinhToan();
                break;
            }
            case R.id.btnBang:{
                txtKQ.setText("");
                ts2=Long.parseLong(xuatmh);
                System.out.println(ts2);
                if(tt=="+"){
                    kq=ts1+ts2;
                }
                if(tt=="-"){
                    kq=ts1-ts2;
                }
                if(tt=="*"){
                    kq=ts1*ts2;
                }
                if(tt=="/"){
                    kq=ts1/ts2;
                }
                ts3=kq;
                txtKQ.setText(kq+"");
                break;
            }
            case R.id.btnXoa:{
                xuatmh="0";
                txtKQ.setText("0");
                break;
            }
            default:{
                if(xuatmh.equals("0")==true){
                    xuatmh="";
                }
                xuatmh+=((Button) v).getText();
                txtKQ.setText(xuatmh);
            }
        }
    }
}