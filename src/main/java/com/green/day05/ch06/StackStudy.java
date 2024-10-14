package com.green.day05.ch06;

public class StackStudy {//샌드위치 같음
    public static void main(String[] args) {
        System.out.println("--main [start] --");
        methodA();
        System.out.println("--main [end] --");
    }
    static void methodA(){
        System.out.println("----methodA[start]-----");
        methodB();
        System.out.println("----methodA[end]-----");
    }//호출한 곳으로 돌아감

    static void methodB(){
        System.out.println("-----methodB[start]-----");
        System.out.println("-----methodB[end]-----");
    }//호출한 곳으로 돌아감


}
