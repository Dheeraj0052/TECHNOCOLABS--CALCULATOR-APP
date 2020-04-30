package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button0, button1, button2, button3 , button4, button5, button6, button7, button8, button9, buttonadd, buttonsub, buttondivide, buttonmultiply, buttonequal, buttonclear;
    private TextView textViewresult , textViewinfo;
    private  double val1 =Double.NaN;
    private   double val2;
    private  final  char ADDITION = '+';
    private  final  char SUBTRACTION = '-';
    private  final  char MULTIPLICATION = '*';
    private  final  char DIVISION = '/';
    private final char EQU ='=';
    private  char Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intialize();
        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewinfo.setText(textViewinfo.getText().toString()+"9");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                Action=ADDITION;
                textViewresult.setText(val1 +"+");
                textViewinfo.setText(null);
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                Action=SUBTRACTION;
                textViewresult.setText(val1 +"-");
                textViewinfo.setText(null);
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                Action=DIVISION;
                textViewresult.setText(val1 +"/");
                textViewinfo.setText(null);
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                Action= MULTIPLICATION;
                textViewresult.setText(val1 +"*");
                textViewinfo.setText(null);

            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                Action= EQU;
                textViewresult.setText(textViewresult.getText().toString()+ val2 +"="+val1);
                textViewinfo.setText(null);
                // 9+8=17
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textViewinfo.getText().length()>0)
                {
                    CharSequence name = textViewinfo.getText().toString();
                    textViewinfo.setText(name.subSequence(0,name.length()-1));
                }
                else
                    {
                        val1=Double.NaN;
                        val2=Double.NaN;
                        textViewinfo.setText(null);
                        textViewresult.setText(null);

                    }

            }
        });
    }
    private void compute()
    {
        if (Double.isNaN(val1)) {
            val1= Double.parseDouble(textViewinfo.getText().toString());
        } else {
            val2=Double.parseDouble(textViewinfo.getText().toString());
            switch (Action)
            {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION :
                    val1-=val2;
                    break;
                case MULTIPLICATION:
                    val1*=val2;
                    break;
                case DIVISION:
                    val1/=val2;
                    break;
                case EQU:
                    break;
            }

        }
    }

    private void intialize() {
        button0= findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        buttonadd=findViewById(R.id.buttonadd);
        buttonsub=findViewById(R.id.buttonsubtract);
        buttondivide=findViewById(R.id.buttondivide);
        buttonmultiply=findViewById(R.id.buttonmultiply);
        buttonequal=findViewById(R.id.buttonequal);
        buttonclear=findViewById(R.id.buttonclear);
        textViewinfo=findViewById(R.id.txtViewInfo);
        textViewresult=findViewById(R.id.txtViewResult);
    }

}
