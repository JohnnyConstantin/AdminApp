package com.example.shop;

public class CashBox {
     private boolean isWorking;

     CashBox(boolean st){
         this.isWorking = st;
     }

     void setStatus(boolean newStatus){
         this.isWorking = newStatus;
     }

     boolean getStatus(){
         return isWorking;
     }
}
