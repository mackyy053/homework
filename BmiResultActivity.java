package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BmiResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        Intent intent = getIntent();
        Double bmi = intent.getDoubleExtra("bmi_value", 0);
        String bmitext = intent.getStringExtra("bmi_text");

        String unit = String.valueOf(String.format("%.1f", bmi));
        TextView t1 = (TextView) findViewById(R.id.BmiCal);
        TextView t2 = (TextView) findViewById(R.id.BmiResult);

        t1.setText("ค่า BMI ที่ได้คือ " + unit);
        t2.setText("อยู่ในเกณฑ์ " + bmitext);


    }
}
