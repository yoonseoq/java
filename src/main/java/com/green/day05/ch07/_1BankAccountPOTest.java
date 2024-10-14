package com.green.day05.ch07;

public class _1BankAccountPOTest {
    public static void main(String[] args) {
        System.out.println("balance:"
                +_1BankAccountPO.balance);//다른 클래스에서 불러온것

        int deposit=_1BankAccountPO.deposit(0);
         deposit=_1BankAccountPO.deposit(4000);
        System.out.println("balance:"
                +_1BankAccountPO.balance);

        System.out.println("deposit:"
                +deposit);

        deposit=_1BankAccountPO.withdraw(2000);
        System.out.println("deposit:"+deposit);
        _1BankAccountPO.checkMyBalance();

    }
}
