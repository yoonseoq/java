package com.green.day04.ch06;

public class _3MathodLogicalOp {
    public static void main(String[] args) {
        int n1=60;
        boolean b= logicalOp1(n1);
        System.out.println("b:"+b);
        boolean b2= logicalOp2(n1);
        System.out.println("b2:"+b2);

    }

    static boolean logicalOp1(int n){
        return (n>=1&&n<=100);
    }
    static boolean logicalOp2(int n1){
        return ((n1%2==0)&&(n1%3==0));
    }




}
