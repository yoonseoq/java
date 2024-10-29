package com.green.day15.ch18;

public class ExceptionCase {
    public static void main(String[] args) {
        int n1 =10;
        int n2 =0;

        System.out.printf("%d/%d=%d\n",n1,n2,(n1/n2));
        //0으로 나누는것 자체가 에러여서 예외처리 해야함
        System.out.println("お終い");
    }
}
