package com.green.day06.ch07;

public class PassingRef {//메소드에다가 레퍼런스값을 전달
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;//ba를 ba2에 복사
        ba2.checkMyBalance();
        ba.checkMyBalance();

        ba2=null;//아무런 객체를 가르키고 있지x(주소값이 없다)
        if(ba2!=null) {//null 체크
            ba2.checkMyBalance();//null인 상태에서 메소드를 입력하면 에러발생(NullPointerException) 가능성 있음
        }
        check(ba);

         /*
          static이 없다는 가정하에 객체화 시키는 방법은
          PassingRef pf= new PassingRef();
          pf.check(ba);

          void or return
          static or non-static

         */

        check(ba);//void에 static이다
    }

    static void check(BankAccount ba){
        ba.checkMyBalance();//BankAccount 주솟값 끌고옴

    }

}
