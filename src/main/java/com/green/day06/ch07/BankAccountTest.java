package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
       // BankAccount.deposit(4000);//왜 deposit에 빨간줄이 뜰까
        //ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수 이다.
        BankAccount ba = new BankAccount();// static이 없는 애들은 이렇게 new를 붙여가면서 객체화 해야함
        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3=new BankAccount();
        ba3.checkMyBalance();// 왜 0이 뜰까요?? 서로 다른 별개의 객체이기 때문이다.
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance();

        ba.checkMyBalance();

        //BankAccount ba2 = new String("안녕");//ba2는 객체 주소값을 담을 수 있다
        String str = new String("안녕");


    }
}
