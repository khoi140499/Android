package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=findViewById(R.id.spnCountry);
        sp1.setOnItemSelectedListener(this);
        sp2=findViewById(R.id.spnUni);
        sp2.setOnItemSelectedListener(this);

        String[] country={"Vietnam","Malaysia","Philipine","Thailand","Korea"};
        String[] university={"PTIT", "HMU","HANU","HUST","TMU"};

        ArrayAdapter<String> arctr=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, country);
        ArrayAdapter<String> aruni=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, university);
        arctr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(arctr);

        aruni.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(aruni);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
