package com.example.shop;

public class CashBox {
     private boolean isWorking;

     void setStatus(boolean newStatus){
         this.isWorking = newStatus;
     }

     boolean getStatus(){
         return isWorking;
     }
}
