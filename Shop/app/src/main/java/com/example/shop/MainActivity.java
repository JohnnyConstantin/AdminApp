package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Start, Stack;
    TextView Customer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Customer1 = (TextView) findViewById(R.id.Customer1);
        Start = (Button) findViewById(R.id.Start);
        Stack = (Button) findViewById(R.id.stack);


   View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i;
            switch (v.getId()) {
                case R.id.Start:
                    int MAX_CUSTOMERS;
                    MAX_CUSTOMERS = (int)((Math.random() * (5)) + 1);
                    /*
                    Customer1.setText("" + MAX_CUSTOMERS);
                    Проверка работы рандома
                    */

                    switch (MAX_CUSTOMERS){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                    }
                    break;
                case R.id.stack:
                    i = new Intent(MainActivity.this, Stacks.class);
                    startActivity(i);
                    break;
                default:
                    break;
            }
        }
    };
        Start.setOnClickListener(listener);
        Stack.setOnClickListener(listener);
    }
}





