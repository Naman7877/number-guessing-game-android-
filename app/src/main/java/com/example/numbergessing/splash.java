package com.example.numbergessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import static java.lang.Thread.sleep;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                );


        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent= new Intent(splash.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        };thread.start();

    }
}