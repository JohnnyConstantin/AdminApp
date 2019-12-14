package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CashBox cashBox;
    Tomato tomato;
    Cucumber cucumber;
    Apple apple;

    Button Start, Stack;
    TextView Customer1;
    LinearLayout Custlayout1,Custlayout2, Custlayout3, Custlayout4, Custlayout5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cashBox.setStatus(false);
        tomato.setQuantity(0);
        cucumber.setQuantity(0);
        apple.setQuantity(0);

        Custlayout1 = (LinearLayout) findViewById(R.id.Custlayout1);
        Custlayout2 = (LinearLayout) findViewById(R.id.Custlayout2);
        Custlayout3 = (LinearLayout) findViewById(R.id.Custlayout3);
        Custlayout4 = (LinearLayout) findViewById(R.id.Custlayout4);
        Custlayout5 = (LinearLayout) findViewById(R.id.Custlayout5);

        Custlayout1.setVisibility(View.INVISIBLE);
        Custlayout2.setVisibility(View.INVISIBLE);
        Custlayout3.setVisibility(View.INVISIBLE);
        Custlayout4.setVisibility(View.INVISIBLE);
        Custlayout5.setVisibility(View.INVISIBLE);

        Customer1 = (TextView) findViewById(R.id.Cust1);
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
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.GONE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            break;
                        case 2:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            break;
                        case 3:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            break;
                        case 4:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.GONE);
                            break;
                        case 5:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.VISIBLE);
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





