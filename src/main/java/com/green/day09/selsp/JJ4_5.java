package com.green.day09.selsp;

public class JJ4_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }//이걸 while로 바꾼다고?

        //ㄷㅐ충 while로 별찍기
        int i=0;
        while(i<=10){
            int j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
