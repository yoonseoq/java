package com.green.day3.ch05;

public class _25ForInFor {
    public static void main(String[] args) {
        /*중접 for 문*/
        for(int i=0;i<5;i++){
            System.out.println("-------------------");

            for(int z=0;z<5;z++){
                System.out.printf("[%d,%d]",i,z);
            }
            System.out.println();//z값이 끝나야  i값이 갱신되고 값도 새로워짐
        }
    }
}
