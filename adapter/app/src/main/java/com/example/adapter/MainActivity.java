package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String arr[]={"Red","Yellow","Green","Violet","Indigo","Blue","Orange"};
        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Countries));
        l=findViewById(R.id.lv1);
        l.setAdapter(aa);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s=aa.getItem(i).toString();
                Toast.makeText(getApplicationContext(),"Item at "+i+" is "+s,Toast.LENGTH_LONG).show();
            }
        });

    }
}