package com.example.shop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Stacks extends AppCompatActivity {

    int appleC,tomatoC,cucumberC;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getIntent().getIntExtra("apple",appleC);
        getIntent().getIntExtra("cucumber",cucumberC);
        getIntent().getIntExtra("tomato",tomatoC);
    }
}
