package com.green.day04.selfstudy;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(5,4));//int넣어도 자동으로 형변환됨
        System.out.println(add(5,2.2));
    }
/*
오버로딩이란 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩이라고 한다.
add(int)
add(double)

반환타입이 다를경우 컴파일 오류발생
int add(int )
double add(int )

int add (int a int b)
int add (int c int d) 안되는 유형들

 */

    public static double add(double a, double b){
        System.out.println("2번");
        return a+b;
    }

}
