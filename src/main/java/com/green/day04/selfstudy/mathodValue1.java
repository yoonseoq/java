package com.green.day04.selfstudy;

public class mathodValue1 {//大事な奴
    public static void main(String[] args){
        int num1=5;
        System.out.println("1.bafore call change number"+num1);
        changeNumber(num1);//num1값을 읽고 num2에 복사
        System.out.println("4.after call change number"+num1);//왜5일까?
        /*
        자바는 항상 변수값을 복사함 num2의 값을 바꾸더라도 num1값에다 영향을 주지 않는다
         */
    }
    public static void changeNumber(int num2){
        System.out.println("2.before call change number"+num2);
        num2= num2*2;
        System.out.println("3.after call change number"+num2);

    }
}
