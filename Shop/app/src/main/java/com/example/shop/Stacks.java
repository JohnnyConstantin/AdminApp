package com.example.shop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Stacks extends AppCompatActivity {


    EditText App_edit, Cuc_edit, Tom_edit;
    Button  Back;
    int appleC,tomatoC,cucumberC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        Back = (Button) findViewById(R.id.button);

        App_edit = (EditText) findViewById(R.id.app_edit);
        Cuc_edit = (EditText) findViewById(R.id.cuc_edit);
        Tom_edit = (EditText) findViewById(R.id.tom_edit);

        getIntent().getIntExtra("apple", appleC);
        getIntent().getIntExtra("cucumber", cucumberC);
        getIntent().getIntExtra("tomato", tomatoC);
    }
}

