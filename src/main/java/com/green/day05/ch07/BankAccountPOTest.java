package com.green.day05.ch07;

public class BankAccountPOTest {
    public static void main(String[] args) {
        System.out.println("balance: "
                + BankAccountPO.balance);
        int balance = BankAccountPO.checkMyBalance();
        balance = BankAccountPO.deposit(4000);
        System.out.println("deposit: "
                + BankAccountPO.balance);
        System.out.println("입금후잔액: "
                + balance);

        balance = BankAccountPO.withdraw(2000);
        System.out.println("withdraw: "
                + balance);
        balance = BankAccountPO.checkMyBalance();//잔액
        System.out.println("잔액2 : " + balance);
    }
}
