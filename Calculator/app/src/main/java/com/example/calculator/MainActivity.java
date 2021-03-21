package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Float thamso1, thamso2, ketqua, thamso3;
    String s="", toantu="", xuatmanhinh="";
    EditText txtQ;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQ=findViewById(R.id.txtKQ);
        int[] idButton = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8
        ,R.id.btn9,R.id.btnBang,R.id.btnCham,R.id.btnChia,R.id.btnCong,R.id.btnNhan,R.id.btnTru,R.id.btnXoa};

        for(int id:idButton){
            v=(View) findViewById(id);
            v.setOnClickListener(this);
        }
    }

    private void toanTu(){
            thamso1=Float.parseFloat(xuatmanhinh);
            if(thamso3!=null){
                thamso1=thamso3;
            }
            xuatmanhinh="0";
            txtQ.setText("0");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCong:{
                toantu="+";
                toanTu();
                break;
            }
            case R.id.btnTru:{
                toantu="-";
                toanTu();
                break;
            }
            case R.id.btnNhan:{
                toantu="*";
                toanTu();
                break;
            }
            case R.id.btnChia:{
                toantu="/";
                toanTu();
                break;
            }
            case R.id.btnBang:{
                ketqua=null;
                thamso2= Float.parseFloat(xuatmanhinh);
                System.out.println(thamso2);
                if(toantu=="+"){
                    ketqua=thamso1+thamso2;
                }
                if(toantu=="-"){
                    ketqua=thamso1-thamso2;
                }
                if(toantu=="/"){
                    ketqua=thamso1/thamso2;
                }
                if(toantu=="*"){
                    ketqua=thamso1*thamso2;
                }
                thamso3=ketqua;
                txtQ.setText(ketqua+"");
                break;
            }
            case R.id.btnXoa:{
                xuatmanhinh="0";
                txtQ.setText("0");
                break;
            }
            default:{
                Button a=(Button) v;
                if(xuatmanhinh.equals("0")==true){
                    xuatmanhinh="";
                }
                xuatmanhinh+=a.getText();
                txtQ.setText(xuatmanhinh);

            }
        }
    }
}