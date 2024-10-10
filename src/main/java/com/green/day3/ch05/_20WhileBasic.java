package com.green.day3.ch05;

public class _20WhileBasic {
    public static void main(String[] args) {

        /*
        while 문은 반복문 소괄호 안에 결과가 트루일때 {}내용리 반복된다
        ()안의 결과가false가 될시 while문을 빠져나온다

         */


        int n=0;

        while(n<5){
            System.out.println("I love Java"+(n+1));
            n++;
        }
        System.out.println("End");
    }
}
