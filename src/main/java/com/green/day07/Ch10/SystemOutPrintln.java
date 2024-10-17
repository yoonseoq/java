package com.green.day07.Ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {

        /*
        System.abc.kkk().ggg

        System.abc의 결과물을 "A"라고 지칭하면 ,,뒤에.을 넣을 수 있는 경우는 레퍼런스 변수이기 때문
        //A.kkk().ggg

        //A.kkk() 의 결과물을 B라고 지칭하면

        //B.ggg

        Ststem:클래스
        abc:참조변수,멤버필드
        kkk(): abc가 가리키고 있는 객체의 메소드,리턴타입 메소드(참조)
              뒤에 .ggg가 있기때문
        ggg:kkk()메소드가 리턴하는 객체의 멤버필드

         */


        System.out.println();

        PrintStream fff= System.out;//System.out 클래스.//out은 객체의 주소값을 당길 수 있는 전역상수
        //out에 있는 값을 fff에 넘겨줌
        fff.println();//printstream에 있는 객체로 가서 메소드를 명령. 스트림은 생각보다 리소스를 많이 잡아먹음


        //System: 클래스
        //out:static final 멤버필드 PrintStream 객체의 주소값 저장됨
        //println():메소드

        /*
        PrintStream은 println(int i),println(Char c),println(String str)등의 메서드를 가지고 있으면 오버로딩이다
        만약 없다묜
        printlnInr(int i),printlnChar(char i),printlnString(string i)
         */
    }
}
