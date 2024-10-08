package com.green.day2.ch04;

public class _10CompAssignOp {
    public static void main(String[] args) {
        /*
        복합 대입 연산자
         */
        int n1=10;
        //n1에다가 +2를 하고 싶으면

        n1=n1+2;//오른쪽 값을 왼쪽으로 대입
        System.out.printf("n1:%d\n",n1);

        int n2=10;
        n2+=2;//복합대입연산자
        System.out.printf("n2:%d\n",n2);

        int n3=5;
        n3=n3*3;
        System.out.printf("n3:%d\n",n3);

        int n4=5;
        n4*=3;
        System.out.printf("n4:%d\n",n4);

    }
}
