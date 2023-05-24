package com.atm.machine;

public class Accounts {
    private int customerNumber;
    private int pinNumber;
    private int currentBalance=0;
    private int savingBalance=0;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

}
