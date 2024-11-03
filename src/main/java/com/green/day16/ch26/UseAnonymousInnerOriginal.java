package com.green.day16.ch26;

public class UseAnonymousInnerOriginal {
    public static void main(String[] args) {
        PrintableImpl p=new PrintableImpl();
        p.print();

    }
}
class PrintableImpl implements Printable{
    @Override
    public void print(){
        System.out.println("이름있는 클래스 print");
    }
}
//클래스이름 안만들고 바로 다이렉트로 하는게 익명클래스