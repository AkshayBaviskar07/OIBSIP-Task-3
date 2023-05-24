package com.atm.machine;
import java.util.Scanner;

public class Accounts {
    private int customerNumber;
    private int pinNumber;
    private double currentBalance=0;
    private double savingBalance=0;

    Scanner input = new Scanner(System.in);

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

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

    //calculating withdraw balance in current account
    public double calcCurrentWithdraw(double amount){
        currentBalance -= amount;
        return currentBalance;
    }

    //calculating deposit input in current account
    public double calcCurrentDeposit(double amount){
        currentBalance += amount;
        return currentBalance;
    }

    //calculating withdraw inputs in savings account
    public double calcSavingsWithdraw(double amount){
      savingBalance -= amount;
      return savingBalance;
    }

    //calculating deposit inputs in savings account
    public double calcSavingsDeposite(double amount){
        savingBalance += amount;
        return savingBalance;
    }

    public void getCurrentWithdrawInput(){
        System.out.println("Current Balance: "+currentBalance);
        System.out.println("Enter Amount: ");
        double amount = input.nextDouble();

        if((currentBalance - amount) >= 0){
            calcCurrentWithdraw(amount);
            System.out.println("Current Balance: "+currentBalance);
        } else{
            System.out.println("Not enough balance.");
        }
    }

    public void getCurrentDepositInput(){
        System.out.println("Enter amount: ");
        double amount = input.nextDouble();

        if((currentBalance + amount) >= 0){
            calcCurrentDeposit(amount);
            System.out.println("Current Balance is: "+currentBalance);
        } else{
            System.out.println("Please enter valid amount.");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Balance: "+savingBalance);
        System.out.println("Enter Amount: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingsWithdraw(amount);
            System.out.println("Saving Balance: "+savingBalance);
        } else{
            System.out.println("Not enough balance.");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Enter amount: ");
        double amount = input.nextDouble();

       if((savingBalance + amount) >= 0){
           calcSavingsDeposite(amount);
           System.out.println("Saving balance: "+savingBalance);
        } else{
           System.out.println("Enter valid amount");
        }
    }
}
