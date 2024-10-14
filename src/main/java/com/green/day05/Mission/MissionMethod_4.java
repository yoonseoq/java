package com.green.day05.Mission;

public class MissionMethod_4 {
    public static void main(String []args){
        calc(10,3);
    }



    static void calc(int a,int b){
        System.out.printf("%d+%d=%d\n",a,b,a+b);
        System.out.printf("%d-%d=%d\n",a,b,a-b);
        System.out.printf("%d*%d=%d\n",a,b,a*b);
        System.out.printf("%d/%d=%.3f\n",a,b,(double)a/b);//부분적으로 강제형변환 필요
        System.out.printf("%d%%%d=%d",a,b,a%b);
    }
}
