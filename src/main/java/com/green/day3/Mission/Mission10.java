package com.green.day3.Mission;

public class Mission10 {
    public static void main(String[] args) {
        int star= (int)(Math.random()*6.0)+3;
        System.out.println(star);

        for(int i=1;i<=star;i++){//행을 반복하는 횟수
            for(int j=1;j<=star;j++){//열수
                System.out.print("*");
            }
                System.out.println();//개행

        }






    }
}
