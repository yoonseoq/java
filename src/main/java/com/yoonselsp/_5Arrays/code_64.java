package com.yoonselsp._5Arrays;

public class code_64 {
    public static void main(String[] args) {

        int[] score;//배열명 스코어 설정
        score = new int[5];//스코어 배열의 공간을 5개로 설정하기

        /*
        int[] score1= new int[5];//이런식으로도 작성 가능하다
        int score2[] = new int[5];//이렇게도 가능하긴 함
         */

        int[] score3= {90,98,89,89,80};//이렇게 해도 쉽구요
        //배열선언 겸     초기화

        for (int i = 0; i < score3.length; i++) {
            System.out.printf("score3[%d]=%d\t",i,score3[i]);

        }
    }
}
