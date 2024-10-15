package com.green.day05.ch07;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        BankAccountPO po1= new BankAccountPO(); //po1 객체화
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2= new BankAccountPO();//po2 객체화
        po2.checkMyBalance();
        /*
        static 이 붙은 값은 new를 쓸 필요가 없다
        이미 실채화된것에 new를 쓰는것은 의미가 없다
        클래스는 단순 호출하기 위한 연결고리이다
         */

        BankAccountPO.checkMyBalance();//이렇게 사용하기 위해서 쓰는것이 static이다.

    }
}
