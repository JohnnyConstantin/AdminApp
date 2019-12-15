package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {

    CashBox cashBox = new CashBox(false);
    Tomato tomato = new Tomato();
    Cucumber cucumber = new Cucumber();
    Apple apple = new Apple();
    Client client1, client2, client3, client4, client5;
    int chose_end=0;
    int profit = 0;




    Button Start, Stack;
    static Handler handler1, handler2;
    TextView Cust1, Cust2, Cust3, Cust4, Cust5, t11, t12, t13, t14, t15, t16, t17, t21, t22, t23, t24, t25, t26, t27, t31,
            t32, t33, t34, t35, t36, t37, t41, t42, t43, t44, t45, t46, t47, t51, t52, t53, t54, t55, t56, t57;
    LinearLayout Custlayout1, Custlayout2, Custlayout3, Custlayout4, Custlayout5;

    int i1 = 1,i2 = 1,i3 = 1,i4 = 1,i5 = 1;

    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cashBox.setStatus(false);
        tomato.setQuantity(8);
        cucumber.setQuantity(8);
        apple.setQuantity(8);

        Cust1 = (TextView) findViewById(R.id.Cust1);
        Cust2 = (TextView) findViewById(R.id.Cust2);
        Cust3 = (TextView) findViewById(R.id.Cust3);
        Cust4 = (TextView) findViewById(R.id.Cust4);
        Cust5 = (TextView) findViewById(R.id.Cust5);

        t11 = (TextView) findViewById(R.id.t11);
        t12 = (TextView) findViewById(R.id.t12);
        t13 = (TextView) findViewById(R.id.t13);
        t14 = (TextView) findViewById(R.id.t14);
        t15 = (TextView) findViewById(R.id.t15);
        t16 = (TextView) findViewById(R.id.t16);
        t17 = (TextView) findViewById(R.id.t17);
        t21 = (TextView) findViewById(R.id.t21);
        t22 = (TextView) findViewById(R.id.t22);
        t23 = (TextView) findViewById(R.id.t23);
        t24 = (TextView) findViewById(R.id.t24);
        t25 = (TextView) findViewById(R.id.t25);
        t26 = (TextView) findViewById(R.id.t26);
        t27 = (TextView) findViewById(R.id.t27);
        t31 = (TextView) findViewById(R.id.t31);
        t32 = (TextView) findViewById(R.id.t32);
        t33 = (TextView) findViewById(R.id.t33);
        t34 = (TextView) findViewById(R.id.t34);
        t35 = (TextView) findViewById(R.id.t35);
        t36 = (TextView) findViewById(R.id.t36);
        t37 = (TextView) findViewById(R.id.t37);
        t41 = (TextView) findViewById(R.id.t41);
        t42 = (TextView) findViewById(R.id.t42);
        t43 = (TextView) findViewById(R.id.t43);
        t44 = (TextView) findViewById(R.id.t44);
        t45 = (TextView) findViewById(R.id.t45);
        t46 = (TextView) findViewById(R.id.t46);
        t47 = (TextView) findViewById(R.id.t47);
        t51 = (TextView) findViewById(R.id.t51);
        t52 = (TextView) findViewById(R.id.t52);
        t53 = (TextView) findViewById(R.id.t53);
        t54 = (TextView) findViewById(R.id.t54);
        t55 = (TextView) findViewById(R.id.t55);
        t56 = (TextView) findViewById(R.id.t56);
        t57 = (TextView) findViewById(R.id.t57);



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

        Start = (Button) findViewById(R.id.Start);
        Stack = (Button) findViewById(R.id.Stack);

        // handler для общей стоимости товаров
        handler1 = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                String text = msg.obj.toString();
                profit += Integer.valueOf(msg.obj.toString());
                int clnNum = msg.what;
                switch (clnNum){
                    case 1:{
                        Cust1.setText("Client 1                              Total : "+ text + " $");
                        break;
                    }
                    case 2:{
                        Cust2.setText("Client 2                              Total : "+ text + " $");
                        break;
                    }
                    case 3:{
                        Cust3.setText("Client 3                              Total : "+ text + " $");
                        break;
                    }
                    case 4:{
                        Cust4.setText("Client 4                              Total : "+ text + " $");
                        break;
                    }
                    case 5:{
                        Cust5.setText("Client 5                              Total : "+ text + " $");
                        break;
                    }
                }

            }
        };

        // handler для списка товаров
        handler2 = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                String text = msg.obj.toString();
                int clnNum = msg.what;
                switch (clnNum){
                    case 1: {
                        switch (i1) {
                            case 1: {
                                t11.setText(text);
                                t11.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 2: {
                                t12.setText(text);
                                t12.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 3: {
                                t13.setText(text);
                                t13.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 4: {
                                t14.setText(text);
                                t14.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 5: {
                                t15.setText(text);
                                t15.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 6: {
                                t16.setText(text);
                                t16.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                            case 7: {
                                t17.setText(text);
                                t17.setBackgroundColor(getColor(R.color.colorBack));
                                i1++;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch (i2){
                            case 1:{
                                t21.setText(text);
                                t21.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 2:{
                                t22.setText(text);
                                t22.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 3:{
                                t23.setText(text);
                                t23.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 4:{
                                t24.setText(text);
                                t24.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 5:{
                                t25.setText(text);
                                t25.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 6:{
                                t26.setText(text);
                                t26.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                            case 7:{
                                t27.setText(text);
                                t27.setBackgroundColor(getColor(R.color.colorBack));
                                i2++;
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        switch (i3){
                            case 1:{
                                t31.setText(text);
                                t31.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 2:{
                                t32.setText(text);
                                t32.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 3:{
                                t33.setText(text);
                                t33.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 4:{
                                t34.setText(text);
                                t34.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 5:{
                                t35.setText(text);
                                t35.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 6:{
                                t36.setText(text);
                                t36.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                            case 7:{
                                t37.setText(text);
                                t37.setBackgroundColor(getColor(R.color.colorBack));
                                i3++;
                                break;
                            }
                        }
                        break;
                    }
                    case 4:{
                        switch (i4){
                            case 1:{
                                t41.setText(text);
                                t41.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 2:{
                                t42.setText(text);
                                t42.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 3:{
                                t43.setText(text);
                                t43.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 4:{
                                t44.setText(text);
                                t44.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 5:{
                                t45.setText(text);
                                t45.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 6:{
                                t46.setText(text);
                                t46.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                            case 7:{
                                t47.setText(text);
                                t47.setBackgroundColor(getColor(R.color.colorBack));
                                i4++;
                                break;
                            }
                        }
                        break;
                    }
                    case 5:{
                        switch (i5){
                            case 1:{
                                t51.setText(text);
                                t51.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 2:{
                                t52.setText(text);
                                t52.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 3:{
                                t53.setText(text);
                                t53.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 4:{
                                t54.setText(text);
                                t54.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 5:{
                                t55.setText(text);
                                t55.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 6:{
                                t56.setText(text);
                                t56.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                            case 7:{
                                t57.setText(text);
                                t57.setBackgroundColor(getColor(R.color.colorBack));
                                i5++;
                                break;
                            }
                        }


                        break;
                    }

                }
                    try {
                        switch (chose_end) {
                            case 1: {
                                if (!client1.working ) {
                                    TimeUnit.SECONDS.sleep(2);
                                    Custlayout1.setVisibility(View.GONE);
                                }
                                break;
                            }
                            case 2: {
                                if (!client1.working && !client2.working){
                                    TimeUnit.SECONDS.sleep(2);
                                    Custlayout1.setVisibility(View.GONE);
                                    Custlayout2.setVisibility(View.GONE);
                                }

                                break;
                            }
                            case 3: {
                                if (!client1.working && !client2.working && !client3.working){
                                    TimeUnit.SECONDS.sleep(2);
                                    Custlayout1.setVisibility(View.GONE);
                                    Custlayout2.setVisibility(View.GONE);
                                    Custlayout3.setVisibility(View.GONE);
                                }

                                break;
                            }
                            case 4: {
                                if (!client1.working && !client2.working && !client3.working && !client4.working){
                                    TimeUnit.SECONDS.sleep(2);
                                    Custlayout1.setVisibility(View.GONE);
                                    Custlayout2.setVisibility(View.GONE);
                                    Custlayout3.setVisibility(View.GONE);
                                    Custlayout4.setVisibility(View.GONE);
                                }

                                break;
                            }
                            case 5: {
                                if (!client1.working && !client2.working && !client3.working && !client4.working && !client5.working) {
                                    TimeUnit.SECONDS.sleep(2);
                                    Custlayout1.setVisibility(View.GONE);
                                    Custlayout2.setVisibility(View.GONE);
                                    Custlayout3.setVisibility(View.GONE);
                                    Custlayout4.setVisibility(View.GONE);
                                    Custlayout5.setVisibility(View.GONE);
                                }
                                break;

                            }
                        }
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
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
                    Cust1.setText("" + MAX_CUSTOMERS);
                    Проверка работы рандома
                    */

                    switch (MAX_CUSTOMERS){
                        case 1:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.GONE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3, 1);
                            chose_end = 1;
                            client1.start();
                            break;
                        case 2:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3, 1);
                            client2 = new Client(cashBox, 4, 2);
                            chose_end = 2;
                            client1.start();
                            client2.start();
                            break;
                        case 3:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3, 1);
                            client2 = new Client(cashBox, 4, 2);
                            client3 = new Client(cashBox, 5, 3);
                            chose_end = 3;
                            client1.start();
                            client2.start();
                            client3.start();
                            break;
                        case 4:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3, 1);
                            client2 = new Client(cashBox, 4, 2);
                            client3 = new Client(cashBox, 5, 3);
                            client4 = new Client(cashBox, 6, 4);
                            chose_end = 4;
                            client1.start();
                            client2.start();
                            client3.start();
                            client4.start();
                            break;
                        case 5:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.VISIBLE);
                            Custlayout4.setVisibility(View.VISIBLE);
                            Custlayout5.setVisibility(View.VISIBLE);
                            client1 = new Client(cashBox, 3, 1);
                            client2 = new Client(cashBox, 4, 2);
                            client3 = new Client(cashBox, 5, 3);
                            client4 = new Client(cashBox, 6, 4);
                            client5 = new Client(cashBox, 7, 5);
                            chose_end = 5;
                            client1.start();
                            client2.start();
                            client3.start();
                            client4.start();
                            client5.start();
                            break;
                    }
                    break;

                case R.id.Stack:
                    Toast.makeText(MainActivity.this, "This feature is developing right now.\n Wait a little and it will work", Toast.LENGTH_SHORT).show();
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
