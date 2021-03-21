package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnDN;
    private TextView txtUser, txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUser=findViewById(R.id.user);
        txtPass=findViewById(R.id.pass);
        btnDN=(Button) findViewById(R.id.dangnhap);
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ten dang nhap : "+txtUser.getText().toString()+
                        " Mat khau: "+txtPass.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}