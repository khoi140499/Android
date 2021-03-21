package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUser, txtPass;
    Button btnDangNhap;
    TextView txtDK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUser=findViewById(R.id.user);
        txtPass=findViewById(R.id.pass);
        btnDangNhap=(Button) findViewById(R.id.btnLogin);
        txtDK=findViewById(R.id.btnRes);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tên đăng nhập: "+txtUser.getText()+" Mật khẩu: "+txtPass.getText(),Toast.LENGTH_LONG).show();
            }
        });

        txtDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Chưa phát triển", Toast.LENGTH_LONG).show();
            }
        });
    }
}