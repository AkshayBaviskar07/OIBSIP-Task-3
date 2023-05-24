package com.atm.machine;


public class MainInterface extends OptionMenu{
    public static void main(String[] args) {

        System.out.println("Welcome to Atm Machine");

        OptionMenu options = new OptionMenu();
        options.getLogin();
    }
}
