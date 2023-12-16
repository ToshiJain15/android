package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et1);
        b1=findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=e1.getText().toString();
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                //Intent i= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:111111"));
               // Intent i= new Intent(Intent.ACTION_SET_WALLPAPER);
                //Intent i= new Intent(Intent.ACTION_DIAL, Uri.parse("content://contacts/people/1"));
//                Intent i= new Intent(Intent.ACTION_CAMERA_BUTTON);
                startActivity(i);

            }
        });




    }
}