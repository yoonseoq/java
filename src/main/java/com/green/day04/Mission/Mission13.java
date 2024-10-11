package com.green.day04.Mission;

public class Mission13 {
    public static void main(String[] args) {
        int star =(int)(Math.random()*6.0)+3;
        System.out.println("star="+star);
        for(int i=1;i<=star;i++){//1부터 star 까지 반복
            for(int j=1;j<=i;j++){//i의 숫자대로 가로로 반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
