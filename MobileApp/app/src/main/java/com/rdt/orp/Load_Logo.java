package com.rdt.orp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Load_Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_load__logo);
        getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                        startActivity(new Intent(getBaseContext(), lista.class));
                        finish();
            }

            },3000);
        }
    }
