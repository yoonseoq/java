package com.green.day05.ch07;

public class BankAccountPO {
    //int balance = 0; 그냥 종이

    static int balance;//static 전역변수 객체화됨

     //static이 없는 함수를 쓰고 싶으면 객체생성 먼저 해야함 new


    static int deposit(int amount) {//입금 담당 메소드


        balance+=amount;
        return balance;
    }

    static int withdraw(int amount){
        balance-=amount;
        return balance;

    }
    static int checkMyBalance(){
        System.out.println("잔액:"+balance);
        return balance;

    }


}
