package com.green.day04.selfstudy;

public class Overloading2 {
    public static void main(String[] args) {
        myMathod(6,6.2);
        myMathod(6.2,6);
    }
//서로다른 타입
    public static void myMathod(int a, double b){
        System.out.println("int a, double b");
    }
    public static void myMathod(double a, int b){
        System.out.println("double a, int b");
    }

}
