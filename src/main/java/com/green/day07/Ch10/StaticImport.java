package com.green.day07.Ch10;

import static java.lang.Math.*;
/* all이라는 의미
   Math 클래스 아래에 있는 스태틱 멤버필드 멤버메소드 전부 import라는 의미
*/
public class StaticImport {
    public static void main(String[] args) {
        /*
        원래는 이렇게 해야 하지만
        System.out.println(Math.E);
        System.out.println(Math.random());//()소괄호가 있어서 더블타입의 리턴메소드

        static import 선언을 하면

        */

        System.out.println( E );
        System.out.println(random());
        //void메소드는 단독적으로 발생


    }
}
