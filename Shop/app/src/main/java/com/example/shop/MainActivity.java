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
    TextView Customer1, t11, t12, t13, t14, t15, t16, t17, t21, t22, t23, t24, t25, t26, t27, t31,
            t32, t33, t34, t35, t36, t37, t41, t42, t43, t44, t45, t46, t47, t51, t52, t53, t54, t55, t56, t57;
    LinearLayout Custlayout1, Custlayout2, Custlayout3, Custlayout4, Custlayout5;

    int i1 = 1,i2 = 1,i3 = 1,i4 = 1,i5 = 1;

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
                String text = msg.obj.toString();
                int clnNum = msg.what;

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
                                t11.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 2: {
                                t12.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 3: {
                                t13.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 4: {
                                t14.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 5: {
                                t15.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 6: {
                                t16.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 7: {
                                t17.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch (i2){
                            case 1:{
                                t21.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                            case 2:{
                                t22.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                            case 3:{
                                t23.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 4:{
                                t24.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                            case 5:{
                                t25.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                            case 6:{
                                t26.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                            case 7:{
                                t27.setText(msg.obj + " " + msg.what);
                                i2++;
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        switch (i3){
                            case 1:{
                                t31.setText(msg.obj + " " + msg.what);
                                i3++;
                                break;
                            }
                            case 2:{
                                t32.setText(msg.obj + " " + msg.what);
                                i3++;
                                break;
                            }
                            case 3:{
                                t33.setText(msg.obj + " " + msg.what);
                                i3++;
                                break;
                            }
                            case 4:{
                                t34.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 5:{
                                t35.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 6:{
                                t36.setText(msg.obj + " " + msg.what);
                                i1++;
                                break;
                            }
                            case 7:{
                                t37.setText(msg.obj + " " + msg.what);
                                i3++;
                                break;
                            }
                        }
                        break;
                    }
                    case 4:{
                        switch (i4){
                            case 1:{
                                t41.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 2:{
                                t42.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 3:{
                                t43.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 4:{
                                t44.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 5:{
                                t45.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 6:{
                                t46.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                            case 7:{
                                t47.setText(msg.obj + " " + msg.what);
                                i4++;
                                break;
                            }
                        }
                        break;
                    }
                    case 5:{
                        switch (i5){
                            case 1:{
                                t51.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 2:{
                                t52.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 3:{
                                t53.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 4:{
                                t54.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 5:{
                                t55.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 6:{
                                t56.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                            case 7:{
                                t57.setText(msg.obj + " " + msg.what);
                                i5++;
                                break;
                            }
                        }
                        break;
                    }

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



                            client1 = new Client(cashBox, 3, 1);

                            break;
                        case 2:
                            Custlayout1.setVisibility(View.VISIBLE);
                            Custlayout2.setVisibility(View.VISIBLE);
                            Custlayout3.setVisibility(View.GONE);
                            Custlayout4.setVisibility(View.GONE);
                            Custlayout5.setVisibility(View.GONE);
                            client1 = new Client(cashBox, 3, 1);
                            client2 = new Client(cashBox, 4, 2);
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
                            break;
                    }
                    break;


                case R.id.stack:
                    i = new Intent(MainActivity.this, Stacks.class);
                    i.putExtra("apple", apple.getQuantity());
                    i.putExtra("cucumber", cucumber.getQuantity());
                    i.putExtra("tomato", tomato.getQuantity());
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



