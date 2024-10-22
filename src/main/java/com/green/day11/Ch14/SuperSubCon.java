package com.green.day11.Ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        new ClassC();//그냥 객체화 ㅋ

    }
    /*
    class생성자 호출은 자식생성자 코드에서 최상위에 위치해야한다
    최상위 부모클래스먼저 상속됨 b가 a소환 그리고 c가 b소환
     */
}
class ClassA {

    public ClassA(){//이런게 기본생성자 1.이름이 클래스 명이랑 똑같고 2리턴타입이 없다.
   // super();
        System.out.println("나는 클래스A다");
    }

}
class ClassB extends ClassA{

    public ClassB(){
    super();
        System.out.println("나는 클래스B다");

    }
}
class ClassC extends ClassB{
    public ClassC(){
        super();
        System.out.println("나는 클래스C다");

    }
}