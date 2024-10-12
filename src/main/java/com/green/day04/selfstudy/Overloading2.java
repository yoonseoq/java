package com.green.day04.selfstudy;

public class Overloading2 {
    public static void main(String[] args) {
        mymathod(1,2.2);
        mymathod(6.2,6);
    }
//서로다른 타입
    public static void mymathod(int a, double b){
        System.out.println("int a, double b");
    }
    public static void mymathod(double a, int b){
        System.out.println("double a, int b");
    }

}
