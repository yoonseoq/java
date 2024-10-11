package com.green.day04.Mission;

public class Mission14_2 {
    public static void main(String[] args) {
        int star =3;//(int)(Math.random()*6.0)+3;
        System.out.println("star:"+star);
        int i;
        int j;

        String s="*";
        String l="_";

        /*
        for문 2개만 쓰기
         */

        for (i=star;i>0;i--){
            for(j=1;j<=star;j++){
                System.out.print(j<i?l:s);
            }
            System.out.println();
        }

        /*for(i=0;i<star;i++){
            for (j=1;j<star-i;j++){
                System.out.print("_");
            }
            for(k=0;k<=star-j;k++){
                System.out.print("*");

            }
            System.out.println();
        }


         */


    }

}
