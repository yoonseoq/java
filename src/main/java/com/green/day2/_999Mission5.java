package com.green.day2;

public class _999Mission5 {
    public static void main(String[] args) {

        int score = (int) ((Math.random()) * 101.0);//101.0더블로 계산하면 불필요한 형변환안해도됨
        System.out.printf("score:%d\n", score);

        /*
            100-98이상A+
            97-94A0
            90-33A-
         */

        if (score >= 90) {
            if ((score >= 98) && (score <= 100)) {
                System.out.println("A+");
            } else if ((score >= 94) && (score <= 97)) {
                System.out.println("A");
            } else {
                System.out.println("A-");
            }
        } else if (score >= 80) {
            if ((score >= 88) && (score <= 89)) {
                System.out.println("B+");
            } else if ((score >= 84) && (score <= 87)) {
                System.out.println("B");
            } else {
                System.out.println("B-");
            }


        } else if (score >= 70) {
            if ((score >= 78) && (score <= 79)) {
                System.out.println("C+");
            } else if ((score >= 74) && (score <= 77)) {
                System.out.println("C");
            } else {
                System.out.println("C-");
            }


        } else {
            System.out.println("D");
        }


    }
}