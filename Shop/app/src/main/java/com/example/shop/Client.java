package com.example.shop;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Client extends Thread {
    CashBox cashBox;
    int moneyToPay;
    int maxProducts;
    String[] productList;
    Product nextProduct;
    Tomato tomato;
    Apple apple;
    Cucumber cucumber;

    public Client(CashBox cash, int maxProducts){
        cashBox = cash;
        this.maxProducts = maxProducts;
        this.productList = new String[maxProducts];
    }

    @Override
    public void run(){
        int count = 0;
        Random random = new Random();

        while (this.productList[maxProducts - 1] == null){
            int x = random.nextInt() % 3 + 1;
            if(x == 1){
                synchronized (tomato) {
                    if(tomato.getQuantity() > 0) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                            nextProduct = new Tomato();
                            productList[count] = "Tomato";
                            count++;
                            moneyToPay += Tomato.price;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }else if(x == 2){
                synchronized (cucumber) {
                    if(cucumber.getQuantity() > 0) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                            nextProduct = new Cucumber();
                            productList[count] = "Cucumber";
                            count++;
                            moneyToPay += Cucumber.price;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }else {
                synchronized (apple) {
                    if(apple.getQuantity() > 0) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                            nextProduct = new Apple();
                            productList[count] = "Apple";
                            count++;
                            moneyToPay += Apple.price;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }


        synchronized (cashBox){
            if(cashBox.getStatus()){
                try {
                    TimeUnit.SECONDS.sleep(5);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                cashBox.setStatus(true);
                try {
                    TimeUnit.SECONDS.sleep(2);
                    cashBox.setStatus(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
