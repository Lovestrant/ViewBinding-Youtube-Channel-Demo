package com.example.viewbindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.viewbindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainActivityViewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityViewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainActivityViewBinding.getRoot());

        String text = mainActivityViewBinding.TheTextView.getText().toString();

        mainActivityViewBinding.Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityViewBinding.TheTextView.setVisibility(View.VISIBLE);
            }
        });

        mainActivityViewBinding.Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityViewBinding.TheTextView.setVisibility(View.GONE);
            }
        });


    }
}