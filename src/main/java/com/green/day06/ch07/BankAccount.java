package com.green.day06.ch07;
/*
 static이 없어도 괜찮을까요. ㄴㄴ 클래스인 것을 객체로만들어줘서 필요함
 */
public class BankAccount {
    int balance = 0;

    void deposit(int amount){
        balance+=amount;
    }

    void withdraw(int amount){
        balance-=amount;
    }

    void checkMyBalance(){
        System.out.printf("balance:%d\n",balance);
    }


}
