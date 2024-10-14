package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        result=adder(4,5);//파라미터는 2개의 정수
        double result2;
        result2=square(3.5);


        System.out.printf("%d+%d=%d\n",4,5,result);
        System.out.printf("%.1f x %.1f=%.2f\n",3.5,3.5,result2);

    }
    static int adder(int n1,int n2){//매개변수는 정수가 되게끔 int 입력
        return n1+n2;
    }
    static double square(double n){
        return n*n;
    }
}
