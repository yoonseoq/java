package com.green.day09.selsp;

public class doWhile {
    public static void main(String[] args) {
        /*
        1-100까지 출력
        100-1까지 출력
         */

        int n=1,n2=100;

        do{
            System.out.println(n++);
        }while (n<=100);
        System.out.println("---------------------");
        while (n2>0){
            System.out.println(n2--);
        }
    }
}
