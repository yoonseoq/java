package com.green.day05.Mission;

public class MissionMethod_5 {
    static void abs(int a,int b){
        int d=a-b;
        System.out.println(d<0?-d:d);
        System.out.println(b>a?b-a:a-b);
    }





    public static void main(String []args){
        abs(1,5);
        abs(11,5);
    }



}
