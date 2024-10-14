package com.green.day05.ch06;

public class Method2Param {
    public static void main(String[] args) {
        double myHeight=169.0;
        hiEveryone(12,12.5);
        hiEveryone(12,myHeight);

        byEveryone();

    }

    static void hiEveryone(int age ,double height){
        System.out.printf("제나이는 %d이고\n, 키는%.1f입니다\n",age,height);//double값은 무적권 %f
    }
    static void byEveryone(){
        System.out.printf("다음에 뵙겠습니다\n");
    }



}
