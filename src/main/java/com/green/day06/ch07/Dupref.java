package com.green.day06.ch07;

public class Dupref {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        //참조변수 ba1, 주소값저장 BankAccount 객체 주소값만 저장가능 즉 레퍼런스 변수
        BankAccount ba2 = ba1;// ba2에다 ba1주소값을 복사함,얕은복사 == Shallow Copy

        ba1.deposit(1000);
        ba2.checkMyBalance();//왜 1000이 뜰까요?
    }
}
