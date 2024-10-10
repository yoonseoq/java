package com.green.day3.ch05;

public class _20WhileBasic {
    public static void main(String[] args) {

        /*
        while 문은 반복문 소괄호 안에 결과가 트루일때 {}내용리 반복된다
        ()안의 결과가false가 될시 while문을 빠져나온다
        몇번 반복하고 싶으면 3요소가 필요
        1.인덱스 초기화 int n=0;
        2.비교문 n<5;
        3.증감식 n++
         */


        int n=0;
        while(n<5){
            System.out.println("I love Java"+(n++));
        }
        System.out.println("End");
    }
}
