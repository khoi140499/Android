package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{
    Spinner sp1,sp2, spCountry, spConver;
    CheckBox ck1, ck2, ck3, ck4, ck5, ck6, ck7, ck8;
    RadioGroup gr1;
    Button submit;
    String txt1, txt2, txt3, txt4, txt5, value;
    View v;
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

        int[] id={R.id.ckAD,R.id.ckIP, R.id.ckRD, R.id.ckRN, R.id.ckSL, R.id.ckSW, R.id.ckTN, R.id.ckWP};
        for(int as:id){
            v=findViewById(as);
        }
        switch (v.getId()){
            case R.id.ckAD:{
                
            }
        }
        gr1=(RadioGroup)findViewById(R.id.group1);

        spConver=(Spinner)findViewById(R.id.spnCountry);
        spCountry=(Spinner)findViewById(R.id.spnUni);

        if(ck1.isChecked()){
            txt1+=ck1.getText().toString();
        }


        value=((RadioButton)findViewById(gr1.getCheckedRadioButtonId())).getText().toString();
        submit=(Button)findViewById(R.id.btnSubmit);
        submit.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, value,Toast.LENGTH_LONG).show();
    }
}