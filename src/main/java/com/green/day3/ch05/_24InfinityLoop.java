package com.green.day3.ch05;

public class _24InfinityLoop {
    public static void main(String[] args) {
        int n= 1;
        while (true){
            if(((n%6)==0)&&(n%14==0)){
                break;
            }

            n++;
        }
        System.out.printf("n:%d\n",n);
    }
}
