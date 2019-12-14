package com.example.shop;

import android.os.Message;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Client extends Thread {
    static CashBox cashBox;
    int moneyToPay;
    int maxProducts;
    String[] productList;
    Product nextProduct;
    Tomato tomato = new Tomato();
    Apple apple = new Apple();
    Cucumber cucumber = new Cucumber();
    int number;

    public Client(CashBox cash, int maxProducts, int number){
        cashBox = cash;
        this.maxProducts = maxProducts;
        this.productList = new String[maxProducts];
        this.number = number;
    }

    @Override
    public void run() {
        int count = 0;
        Random random = new Random();

        while (this.productList[maxProducts - 1] == null) {
            int x = random.nextInt() % 3 + 1;
            if (x == 1) {
                synchronized (tomato) {
                    if (tomato.getQuantity() > 0) {
                        try {
                            tomato.setQuantity(tomato.getQuantity()-1);
                            TimeUnit.SECONDS.sleep(1);
                            nextProduct = new Tomato();
                            productList[count] = "Tomato";
                            count++;
                            moneyToPay += Tomato.price;
                            Message msg = new Message();
                            msg.obj = String.valueOf(moneyToPay);
                            msg.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler1.sendMessage(msg);
                            Message msg2 = new Message();
                            msg2.obj = "Tomato";
                            msg2.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler2.sendMessage(msg2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else if (x == 2) {
                synchronized (cucumber) {
                    if (cucumber.getQuantity() > 0) {
                        try {
                            cucumber.setQuantity(cucumber.getQuantity()-1);
                            TimeUnit.SECONDS.sleep(1);
                            nextProduct = new Cucumber();
                            productList[count] = "Cucumber";
                            count++;
                            moneyToPay += Cucumber.price;
                            Message msg = new Message();
                            msg.obj = String.valueOf(moneyToPay);
                            msg.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler1.sendMessage(msg);
                            Message msg2 = new Message();
                            msg2.obj = "Cucumber";
                            msg2.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler2.sendMessage(msg2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                synchronized (apple) {
                    if (apple.getQuantity() > 0) {
                        try {
                            apple.setQuantity(apple.getQuantity()-1);
                            TimeUnit.SECONDS.sleep(1);
                            nextProduct = new Apple();
                            productList[count] = "Apple";
                            count++;
                            moneyToPay += Apple.price;
                            Message msg = new Message();
                            msg.obj = String.valueOf(moneyToPay);
                            msg.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler1.sendMessage(msg);
                            Message msg2 = new Message();
                            msg2.obj = "Apple";
                            msg2.what = this.number;
                            TimeUnit.SECONDS.sleep(1);
                            MainActivity.handler2.sendMessage(msg2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        while (this.moneyToPay > 0) {
            synchronized (cashBox) {
                if (cashBox.getStatus()) {
                    try {
                        TimeUnit.SECONDS.sleep(3);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    cashBox.setStatus(true);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        this.moneyToPay = 0;
                        cashBox.setStatus(false);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
