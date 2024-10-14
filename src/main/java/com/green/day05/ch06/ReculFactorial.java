package com.green.day05.ch06;

public class ReculFactorial {
    public static void main(String[] args) {
        //5!=5*4*3*2*1
        //6!=6*5*4*3*2*1
        //반복문 없이 생성가능한것\
        System.out.println(factorial(6));
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));
        System.out.println(factorial(1));
        factorial(4);
        /*
        f(3)>>3*f(2)
           f(2)>>2*f(1)
              f(1)>>return
         */

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;//계속 -해서 1이되는순간 호출한 곳으로 리턴
        } else {
            return n * factorial(n - 1);
        }
    }
}
