package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button number1, number2, number3, number4, number5, number6, number7, number8, number9, number0, dot, addition, multiplication, subtraction, division, equal, addorsub, brackets, percentage, clear;
    TextView output;
    EditText data;
    float mValueOne = Float.NaN;
    float mValueTwo;
    String ACTION;
    final String ADDITION = "+";
    final String SUBTRACTION = "-";
    final String MULTIPLICATION = "*";
    final String DIVISION = "/";
    final String EQUAL = "0";
    final String PERCENTAGE = "%";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);
        number0 = findViewById(R.id.number0);
        dot = findViewById(R.id.dot);
        multiplication = findViewById(R.id.multiplication);
        addition = findViewById(R.id.addition);
        division = findViewById(R.id.division);
        subtraction = findViewById(R.id.subtraction);
        addorsub = findViewById(R.id.addorsub);
        brackets = findViewById(R.id.brackets);
        percentage = findViewById(R.id.percentage);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        data = findViewById(R.id.data);
        output = findViewById(R.id.output);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"1");
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"2");
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"3");
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"4");
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"5");
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"6");
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"7");
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"8");
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"9");
            }
        });
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +"0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() +".");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText("");
                }else{
                   commute();
                   ACTION = ADDITION;
                   output.setText(String.valueOf(mValueOne) + "+");
                   data.setText(null);
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText("");
                }else{
                    commute();
                    ACTION = SUBTRACTION;
                    output.setText(String.valueOf(mValueOne) + "-");
                    data.setText(null);
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText("");
                }else{
                    commute();
                    ACTION = MULTIPLICATION;
                    output.setText(String.valueOf(mValueOne) + "*");
                    data.setText(null);
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText("");
                }else{
                    commute();
                    ACTION = DIVISION;
                    output.setText(String.valueOf(mValueOne) + "/");
                    data.setText(null);
                }
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText("");
                }else{
                    commute();
                    ACTION = PERCENTAGE;
                    output.setText(String.valueOf(mValueOne) + "%");
                    data.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commute();
                ACTION = EQUAL;
                output.setText(output.getText().toString() + String.valueOf(mValueTwo) + "=" + String.valueOf(mValueOne));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.getText().length()>0){
                    CharSequence name = data.getText().toString();
                    data.setText(name.subSequence(0, name.length()-1));
                }else{
                    mValueOne = Float.NaN;
                    mValueTwo = Float.NaN;
                    data.setText(null);
                    output.setText(null);
                }
            }
        });

    }
    private void commute(){
        if(!Float.isNaN(mValueOne)){
            mValueTwo = Float.parseFloat(data.getText().toString());


            switch (ACTION){

                case ADDITION:
                    mValueOne = mValueOne + mValueTwo;
                    break;
                case SUBTRACTION:
                    mValueOne = mValueOne - mValueTwo;
                    break;
                case MULTIPLICATION:
                    mValueOne = mValueOne * mValueTwo;
                    break;
                case DIVISION:
                    mValueOne = mValueOne / mValueTwo;
                    break;
                case PERCENTAGE:
                    mValueOne = (mValueOne / mValueTwo)*100;
                case EQUAL:
                    break;
            }
        }else {
            mValueOne = Float.parseFloat(data.getText().toString());
        }
    }

}
