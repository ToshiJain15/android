package com.example.dynamiclist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
ListView l1;
TextView t1;
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        l1=findViewById(R.id.l1);
        t1=findViewById(R.id.et1);

        ArrayList<String> arr=new ArrayList<String>();
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        l1.setAdapter(aa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr.add(t1.getText().toString());
                aa.notifyDataSetChanged();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa.remove(t1.getText().toString());
                aa.notifyDataSetChanged();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa.clear();
                aa.notifyDataSetChanged();
            }
        });

    }
}