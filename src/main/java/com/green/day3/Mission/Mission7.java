package com.green.day3.Mission;

public class Mission7 {
    public static void main(String[] args) {

        int i=1;
        int odd=0;

        while (odd<1000){
           odd+=i;
           if (odd>=1000){
               break;
           }
           i+=2;




        }
        System.out.println(i+","+odd);










    }
}
