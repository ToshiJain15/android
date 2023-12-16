package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int mcount, ucount;
    String val,user_val;
TextView t1,t2,t3;
Button b1,b2;
RadioButton r1,r2,r3;
RadioGroup r;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.name);
        t2=findViewById(R.id.play);
        t3=findViewById(R.id.result);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        r1=findViewById(R.id.rock);
        r2=findViewById(R.id.paper);
        r3=findViewById(R.id.scissor);
        r=findViewById(R.id.rg1);
        b1.setEnabled(false);
        final Random a=new Random();
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b1.setEnabled(true);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int m=a.nextInt(3)+1;
                String str=t1.getText().toString();

                if(m==1){
                   val="Rock";
                } else if(m==2){
                    val="Paper";
                }else{
                    val="Scissor";
                }
                if(r1.isChecked()){
                    user_val="Rock";
                }else if(r2.isChecked()){
                    user_val="Paper";
                }else if(r3.isChecked()){
                    user_val="Scissor";
                }
                t2.setText(str+" played: "+user_val+"\nComputer played: "+val);
                if(r1.isChecked() && m==1 || r2.isChecked() && m==2 || r3.isChecked() && m==3){
                    t3.setText("Tie");
                    i++;
                }else if(r1.isChecked() && m==3 || r2.isChecked() && m==1 || r3.isChecked() && m==2){
                    t3.setText("Win");
                    ucount++;
                    i++;
                }else{
                    t3.setText("Lose");
                    mcount++;
                    i++;
                }
                if(i==5){
                    r.setEnabled(false);
                    r1.setEnabled(false);
                    r2.setEnabled(false);
                    r3.setEnabled(false);
                    if(mcount>ucount){
                        t3.setText("Lose");
                        Toast.makeText(getApplicationContext(),"Lose",Toast.LENGTH_LONG).show();
                    }else if(mcount<ucount){
                        t3.setText("Win");
                        Toast.makeText(getApplicationContext(),"Win",Toast.LENGTH_LONG).show();
                    }else{
                        t3.setText("Tie");
                        Toast.makeText(getApplicationContext(),"Tie",Toast.LENGTH_LONG).show();
                    }
                    t2.setText("Game Over \nComputer scored " + mcount +"\n You scored "+ucount);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("");
                t3.setText("");
                r.clearCheck();
            }


        });
    }
}