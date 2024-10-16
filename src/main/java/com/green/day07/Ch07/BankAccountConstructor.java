package com.green.day07.Ch07;

class BankAccount2{
    private String accNumber;//계좌번호
    private String ssNumber;// 주민번호  둘다 변경할수 있는 방법이 없다
    private int balance;//잔액

    /*
        생성자는 메소드의 한 종류
        메소드와 다른점 2가지
        1.이름이 클라스 명과 같다
        2.반환형(리턴타입, void)을 작성하지 않는다

        생성자의 특징은 오로지 객체셍성할때만 호출가능
        객체생성 이후에는 호출불가

        생성자를 작성하지 않으면 기본생성자가 자동으로 만들어진다,
        그렇지만 생성자를 하나라도 작성하게 되면 기본생성자를 자동으로 만들어주지 않는다
        그럴땐 기본생성자를 만들어줘야 한다

        오버로딩이란 같은 이름의 메소드를 여러개 만들 수 있는 기법을 말한다(파라미터가 다르면 가능)
     */

    //파라미터가 있는 생성자 or 오버로딩된 생성자

    //기본생성자의 모습은?
    BankAccount2(){
        super();
                /*생략가능
                    accNumber = acc;
                    ssNumber = ss;
                    balance = bal;
                */
    }

    BankAccount2(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    //메소드
    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    void checkMyBalance(){
        System.out.printf("계좌번호:%s\n",accNumber);
        System.out.printf("주민번호:%s\n",ssNumber);
        System.out.printf("잔   액:%d\n",balance);
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {
        /*
        객체생성된 new키워드 우측에 적는 것은 생성자 호출이다
        모든 객체지향언어는 객체를 생성할때 생성자를 호출해야 한다.
         */
        BankAccount2 ba1 = new BankAccount2();
        ba1.checkMyBalance();
        //파라미터가 있는 생성자 호출 or 오버로딩된 생성자 호출
        BankAccount2 ba2 = new BankAccount2("111-222","980701-1546464",800000);
        ba2.checkMyBalance();
    }
}
