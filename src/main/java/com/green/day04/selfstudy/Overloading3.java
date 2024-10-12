package com.green.day04.selfstudy;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(5,4));//int넣어도 자동으로 형변환됨
        System.out.println(add(5,2.2));
    }
//서로다른 타입

    public static double add(double a, double b){
        System.out.println("2번");
        return a+b;
    }

}
