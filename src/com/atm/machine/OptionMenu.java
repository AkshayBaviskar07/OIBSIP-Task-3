package com.atm.machine;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Accounts{

    Scanner menuOption = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin(){
        int x = 1;

        do{
            try{
                data.put(6061987, 3021);
                data.put(6061564, 9875);

                System.out.println("Enter Account Number: ");
                setCustomerNumber(menuOption.nextInt());

                System.out.println("Enter Pin Number: ");
                setPinNumber(menuOption.nextInt());

            }catch (Exception e){
                System.out.println("Enter Valid characters.");
                x=2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            } else{
                System.out.println("Wrong account number or pin number");
            }
        }while( x==1 );

    }
        public void getAccountType() {
            System.out.println("1: Current Account");
            System.out.println("2: Saving Account");
            System.out.println("3: Exit");

            int choice = menuOption.nextInt();

            switch (choice){
                case 1:
                    getCurrent();
                    break;

                case 2:
                    getSaving();
                    break;

                case 3:
                    System.out.println("Thanks for using ATM.");
                    break;

                default:
                    System.out.println("Enter valid choice");
            }

        }

        public void getCurrent(){
            System.out.println("Current Account:");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.println("Choice: ");

            int choice = menuOption.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Balance: "+getCurrentBalance());
                    getAccountType();
                    break;

                case 2:
                    getCurrentWithdrawInput();
                    getAccountType();
                    break;

                case 3:
                    getCurrentDepositInput();
                    getAccountType();
                    break;

                case 4:
                    System.out.println("Thanks for using ATM");
                    break;

                default:
                    System.out.println("Enter valid choice");
            }

        }

        //displaying saving account
        public void getSaving(){
            System.out.println("Saving Account: ");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.println("Choice: ");

            int choice = menuOption.nextInt();

            switch (choice){

                case 1:
                    getSavingBalance();
                    getAccountType();
                    break;

                case 2:
                    getSavingWithdrawInput();
                    getAccountType();
                    break;

                case 3:
                    getSavingDepositInput();
                    getAccountType();
                    break;

                case 4:
                    System.out.println("Thanks for using ATM.");
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
        }
}
