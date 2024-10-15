package com.green.day06.ch07;

public class Dupref {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1;// ba2에다 ba1주소값을 복사함,얕은복사 == Shallow Copy

        ba1.deposit(1000);
        ba2.checkMyBalance();//왜 1000이 뜰까요?
    }
}
