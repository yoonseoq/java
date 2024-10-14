package com.green.day05.ch06;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        System.out.println();
        hiEveryone(12);
        System.out.println();
        hiEveryone(13);
        System.out.println();
        System.out.println("프로그램 끝");


    }
    static void hiEveryone(int i){

        System.out.printf("좋은 아침입니다. 저는 %d 세입니다.",i);

    }




}

