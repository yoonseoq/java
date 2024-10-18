package com.green.day3.ch05;

public class _21DoWhileBasic {
    public static void main(String[] args) {
       /*
       while문은 ()안의 결과가 true인지 체크먼저함
       체크 후 true면 반복시작

       do-while문은 실행 한번 먼저하고 ()안의 결과가 true인지 체크
       체크 후 true면 반복 시작
        */


        int n=7;

        do{
            System.out.println("I love Java"+(n++));
        }while (n<5);//일단 7출력하고 조건에 안맞으니 바로 끝나버림
        System.out.println("----");

        int n2=5;
        do{
            System.out.println("I like Java"+(n2--));
        }while (n2>0);





    }
}
