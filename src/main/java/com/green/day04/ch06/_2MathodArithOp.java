package com.green.day04.ch06;

public class _2MathodArithOp {
    public static void main(String[] args) {
        int n1= 7;
        int n2= 7;
        substract(7,3);
        System.out.println("result:"+returnSubstract(7,5));
        System.out.println(returnMultifly(4,5));
        multifly(4,6);
        float r=divide(10,3);
        System.out.println(r);

        int r2=modulo(10,4);
        System.out.println(r2);


    }

    static int modulo(int n1, int n2){
        return n1%n2;
    }


    static void substract(int n1,int n2){
        System.out.printf("%d - %d = %d\n",n1,n2,(n1-n2));
    }
    static int returnSubstract(int n1,int n2){
        return n1-n2;
    }
    static void multifly(int n1,int n2){
        System.out.printf("%d x %d = %d\n",n1,n2,(n1*n2));
    }

    static float divide(int n1,int n2){
        return (float) n1/n2;//정수끼리 나눈것을 실수화



    }

    static int returnMultifly(int n1,int n2){
        return n1*n2;
    }
//클래스 내부에 개수제한 없


}
