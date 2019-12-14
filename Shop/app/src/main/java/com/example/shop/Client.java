package com.example.shop;

import java.util.concurrent.TimeUnit;

public class Client extends Thread {
    CashBox cashBox;
    int moneyToPay;
    int maxProducts;
    String[] productList;
    Product nextProduct;

    public Client(CashBox cash, int maxProducts){
        cashBox = cash;
        this.maxProducts = maxProducts;
    }

    @Override
    public void run(){
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
