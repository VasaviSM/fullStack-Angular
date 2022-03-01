package com.exceptionhandling;

import java.util.Scanner;

class Account {
    int balance = 10000;
    private int withdraw;

    public Account(int balance, int withdraw) {
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public Account() {

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public static class exception extends Throwable {  //y shld we have this
    }
}

public class Bank {
    public static void main(String[] args) throws Exception{

        int withdraw=0,balance=0;

        Scanner sc = new Scanner(System.in);

        Account a = new Account();

        balance = sc.nextInt();
        a.setBalance(balance);
        withdraw = sc.nextInt();
        a.setWithdraw(withdraw);

        try{
            if(balance<withdraw){
                throw new Account.exception();
                // what names shld i give for exception and shld i create it.
            }
            else{
                System.err.println("Account balance: "+(balance-withdraw));
            }
        } catch (Account.exception e) {
            System.out.println("Withdrawal amount exceeds account balance!");
            e.printStackTrace();
        }

    }

}
