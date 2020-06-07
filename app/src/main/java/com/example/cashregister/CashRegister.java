package com.example.cashregister;

public class CashRegister {

    Integer availableFunds;
    Integer transactionTotal = 0;

    public CashRegister() {
        this.availableFunds = 0;
    }


    public CashRegister(Integer availableFunds) {
        this.availableFunds = availableFunds;
    }

    public void addItem(Integer itemCost) {
        transactionTotal += itemCost;
    }
}
