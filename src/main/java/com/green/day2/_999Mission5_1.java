package com.green.day2;

public class _999Mission5_1 {
    public static void main(String[] args) {

        int score = (int) ((Math.random()) * 101.0);//101.0더블로 계산하면 불필요한 형변환안해도됨
        System.out.printf("score:%d\n", score);

        /*
            100-98이상A+
            97-94A0
            90-33A-
         */

        char grade='D', opt ='0';//String 이면""아예 빈칸 허용

        if (score >= 90) {
            grade='A';
            if ((score >= 98)||(score==100)){
                opt ='+';
            } else if (score < 94) {
                opt ='-';
            }
        } else if(score >= 80) {
            grade='B';
            if (score >= 88){
                opt ='+';
            } else if (score < 84) {
                opt ='-';
            }
        } else if (score >= 70) {
            grade='C';
            if (score >= 78){
                opt ='+';
            } else if (score < 74) {
                opt ='-';
            }

        } else{
            opt=' ';
        }

        System.out.printf("%c%c\n",grade,opt);

    }
}