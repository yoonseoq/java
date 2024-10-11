package com.green.day04.selfstudy;

public class aa {
    public static void main(String[] args) {
        int star = (int)(Math.random()*10)+1;
        System.out.println(star);


        for (int i=0; i<star; i++){
            for (int a=0; a<i; a++){
                System.out.print(" ");
            }
            for (int a=0; a<star-i; a++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
