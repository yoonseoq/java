package com.green.day05.ch07;

public class BankAccountPOTest {
    public static void main(String[] args) {
        System.out.println("balance:"
                + BankAccountPO.balance);//다른 클래스에서 불러온것

        int deposit= BankAccountPO.deposit(0);
         deposit= BankAccountPO.deposit(4000);
        System.out.println("balance:"
                + BankAccountPO.balance);

        System.out.println("deposit:"
                +deposit);

        deposit= BankAccountPO.withdraw(2000);
        System.out.println("deposit:"+deposit);
        BankAccountPO.checkMyBalance();

    }
}
