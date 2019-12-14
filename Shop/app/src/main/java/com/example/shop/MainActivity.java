package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CashBox cashBox = new CashBox(false);
    Tomato tomato = new Tomato();
    Cucumber cucumber = new Cucumber();
    Apple apple = new Apple();
    Client client1, client2, client3, client4, client5;


    Button Start, Stack;
    static Handler handler1, handler2;
    TextView Customer1;
    LinearLayout Custlayout1, Custlayout2, Custlayout3, Custlayout4, Custlayout5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cashBox.setStatus(false);
        tomato.setQuantity(8);
        cucumber.setQuantity(8);
        apple.setQuantity(8);

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

        // handler для общей стоимости товаров
        handler1 = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                String text = String.valueOf(msg.what);

            }
        };

        // handler для списка товаров
        handler2 = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                String text = msg.obj.toString();
            }
        };


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



                            client1 = new Client(cashBox, 3);

                            break;
                        case 2:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3);
                            client2 = new Client(cashBox, 4);
                            break;
                        case 3:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3);
                            client2 = new Client(cashBox, 4);
                            client3 = new Client(cashBox, 5);
                            break;
                        case 4:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3);
                            client2 = new Client(cashBox, 4);
                            client3 = new Client(cashBox, 5);
                            client4 = new Client(cashBox, 6);
                            break;
                        case 5:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.VISIBLE);
                            client1 = new Client(cashBox, 3);
                            client2 = new Client(cashBox, 4);
                            client3 = new Client(cashBox, 5);
                            client4 = new Client(cashBox, 6);
                            client5 = new Client(cashBox, 7);
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



