package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 TextView t1,t2,t3;
 Button b1,b2,b3,b4,b5;
 int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
        t3=findViewById(R.id.tv3);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
//        b1.setEnabled(false);
        String str1 = t1.getText().toString();
        String str2 = t2.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str1.equals("") && str2.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter both Values", Toast.LENGTH_LONG).show();
                }else{
                    a=Integer.parseInt(t1.getText().toString());
                    b=Integer.parseInt(t2.getText().toString());
                    t3.setText("Result:"+(a+b));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str1.equals("") && str2.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter both Values", Toast.LENGTH_LONG).show();
                }else{
                    a=Integer.parseInt(t1.getText().toString());
                    b=Integer.parseInt(t2.getText().toString());
                    t3.setText("Result:"+(a-b));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str1.equals("") && str2.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter both Values", Toast.LENGTH_LONG).show();
                }else{
                    a=Integer.parseInt(t1.getText().toString());
                    b=Integer.parseInt(t2.getText().toString());
                    t3.setText("Result:"+(a*b));
                }


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str1.equals("") && str2.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter both Values", Toast.LENGTH_LONG).show();
                }else{
                    a=Integer.parseInt(t1.getText().toString());
                    b=Integer.parseInt(t2.getText().toString());
                    if(b==0){
                        Toast.makeText(getApplicationContext(),"Can't divide by zero", Toast.LENGTH_LONG).show();
                    }else {
                        t3.setText("Result:" + (a / b));
                    }
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("Result");
            }
        });
    }
}