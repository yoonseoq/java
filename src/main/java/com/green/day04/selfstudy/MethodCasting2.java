package com.green.day04.selfstudy;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number=100;
        printNumber((int)number);// double이 더 크므로 int가 자동형변환됨
    }

    public static void printNumber(double n) {
        System.out.println("숫자:"+n);

    }




}
