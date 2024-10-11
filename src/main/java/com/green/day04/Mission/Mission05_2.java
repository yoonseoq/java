package com.green.day04.Mission;

public class Mission05_2 {
    public static void main(String[] args) {
        for (int i=0;i<=4;i++){
            for(int z=0;z<=9;z++){
                if((i+z)==9){
                   // System.out.printf("%d + %d = %d",i,z,(i+z));
                    System.out.printf("  %d %d\n",i,z);
                    System.out.printf("+ %d %d\n",z,i);
                    System.out.println("________");
                    System.out.printf("  %d %d\n",(z+i),(z+i));


                }
            }
            System.out.println();
        }
    }
}
