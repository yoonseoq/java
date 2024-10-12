package com.green.day04.selfstudy;

public class Overloading {

    public static void main(String[] args) {
        System.out.println("1:"+add(1,2));
        System.out.println("2:"+add(1,5,8));
        System.out.println();

    }

    public static int add(int a,int b){
        System.out.println("1 번 호출");
        return a+b;
    }
    public static int add(int a,int b,int c){
        System.out.println("2 번 호출");
        return a+b+c;
    }


}
