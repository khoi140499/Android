package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rd;
    Button test;
    String va;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd=(RadioGroup)findViewById(R.id.gioitinh);

        test=(Button)findViewById(R.id.btntest);
        test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        va=((RadioButton)findViewById(rd.getCheckedRadioButtonId())).getText().toString();
        Toast.makeText(MainActivity.this, va, Toast.LENGTH_LONG).show();
    }
}