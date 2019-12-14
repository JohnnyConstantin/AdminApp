package com.example.shop;

abstract class Product {
    abstract void setQuantity(int q);

    abstract int getQuantity();
}

class Tomato extends Product{
    String name = "Tomato";
    private static int quantity;

    @Override
    void setQuantity(int q){
        quantity = q;
    }

    @Override
    int getQuantity(){
        return quantity;
    }
}


class Cucumber extends Product{
    private static int quantity;

    @Override
    void setQuantity(int q){
        quantity = q;
    }

    @Override
    int getQuantity(){
        return quantity;
    }
}

class Applr extends Product{
    private static int quantity;

    @Override
    void setQuantity(int q){
        quantity = q;
    }

    @Override
    int getQuantity(){
        return quantity;
    }
}

