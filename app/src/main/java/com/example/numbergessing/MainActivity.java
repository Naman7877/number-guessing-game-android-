package com.example.numbergessing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText num;
    TextView result;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.num);
        result=findViewById(R.id.result);
        b1=findViewById(R.id.b1);
        getSupportActionBar().hide();
        
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n= Integer.parseInt(num.getText().toString());
                Random random=new Random();
                int rand =random.nextInt(10);

                if (n==rand)
                {

                    result.setText("you won"+ " & num. is "+rand);
                    Toast.makeText(MainActivity.this, "you win", Toast.LENGTH_SHORT).show();
                }
                else {
                    result.setText("you loss"+ " & num. is "+rand);
                   // Toast.makeText(MainActivity.this, "you loss", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}