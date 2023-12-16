package com.example.smalllarge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 Button b1,b2;
 private float fnt=14f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tv1);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnt-=4f;
                t1.setTextSize(TypedValue.COMPLEX_UNIT_SP,fnt);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnt+=4f;
                t1.setTextSize(TypedValue.COMPLEX_UNIT_SP,fnt);
            }
        });
    }
}