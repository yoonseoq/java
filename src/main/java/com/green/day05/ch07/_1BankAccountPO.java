package com.green.day05.ch07;

public class _1BankAccountPO {

    static int balance=0;//static 전역변수

    public static int deposit(int amount) {//입금 담당 메소드

        balance+=amount;
        return balance;
    }

    static int withdraw(int amount){
        balance=balance-amount;
        return balance;

    }
    static int checkMyBalance(){
        System.out.println("잔액:"+balance);
        return balance;

    }
}
