package com.green.day04.Mission;

public class Mission13_1 {
    public static void main(String[] args) {
        int star =(int)(Math.random()*6.0)+3;
        System.out.println("star="+star);
        for(int i=0;i<star;i++){//1부터 star 까지 반복 (줄담당)
            for(int j=0;j<=i;j++){//i의 숫자대로 가로로 반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
