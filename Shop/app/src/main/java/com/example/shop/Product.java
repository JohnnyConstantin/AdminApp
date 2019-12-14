package com.example.shop;

interface Product {
     void setQuantity(int q);

     int getQuantity();
}

class Tomato implements Product{
    String name = "Tomato";
    private static int quantity;
    public static int price = 3;

    @Override
    public void setQuantity(int q){
        quantity = q;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }
}

class Cucumber implements Product{
    String name = "Cucumber";
    public static int price = 4;
    private static int quantity;

    @Override
    public void setQuantity(int q){
        quantity = q;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }
}

class Apple implements Product{
    String name = "Apple";
    private static int quantity;
    public static int price = 5;

    @Override
    public void setQuantity(int q){
        quantity = q;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }
}

