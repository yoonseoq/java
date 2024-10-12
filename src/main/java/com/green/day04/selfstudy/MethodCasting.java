package com.green.day04.selfstudy;

public class MethodCasting {
    public static void main(String[] args) {
        double number=1.5;
        printNumber((int)number);//int값을 double에 넣을 수 없어서 명시적 형변환을 해야함
    }

    public static void printNumber(int n) {
        System.out.println("숫자:"+n);
    }




}
