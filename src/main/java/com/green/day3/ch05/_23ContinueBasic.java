package com.green.day3.ch05;

public class _23ContinueBasic {
    public static void main(String[] args) {
        int n= 0;
        int count=0;

        while ((n++)<100){
            if(((n%5)!=0)||((n%7)!=0)){
                continue;//해당값 무시하고 넘어감
            }
            count++;
            System.out.println("n:"+n);


        }
        System.out.println("count:"+count);


    }
}
