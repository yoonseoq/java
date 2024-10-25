package com.green.day14.ch17;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc="This is a report about...";

        Printable prn1=new Prn204Drv();
        Printable prn2=new Prn731Drv();

        //형제메소드여서
        //
        // 204랑 731은 서로 관계가 없어서 서로호출 안됨


        prn1.print(myDoc);
        System.out.println();
        prn2.print(myDoc);
    }
}

class Prn204Drv implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204Printer");
        System.out.println(doc);
    }
    //인터페이스의 추상메소드를 구현하지 않ㅇㅏ서 빨간줄
}
class Prn731Drv implements Printable{
    @Override
    public void print(String doc){
        System.out.println("FROM MD-731Printer");
        System.out.println("");
    }
}
//인터페이스는 인터페이스끼리 상속가능
//상속가능