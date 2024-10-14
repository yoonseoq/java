package com.green.day05.Mission;

public class Mission_6_2_1 {
    public static void main(String[] args) {
        int n1=10;
        circle(10);//넓이
        cir(10);//둘레
        /*원의 반지름 입력하면 원의 넓이를 계산하여 반환하는 것
         */
    }
    static void circle(int n1){
        System.out.printf("원의 넓이:%d x %d x %.2f = %.2f\n",n1,n1,(double)3.14,(double)(n1*n1*3.14));
    }
    static void cir(int n1){
        System.out.printf("원의 둘레:%d x %d x %.2f = %.2f",n1,2,(double)3.14,(double)(n1*2*3.14));
    }
    static double circle(double n1){
        return n1*n1*3.14;
    }
    static double cir(double n1){
        return n1*2*3.14;
    }
}
