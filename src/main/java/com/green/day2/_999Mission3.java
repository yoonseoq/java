package com.green.day2;

public class _999Mission3 {
    public static void main(String[] args) {

//        int score= (int) ((Math.random())*101.0);//101.0더블로 계산하면 불필요한 형변환안해도됨
//        System.out.printf("score:%d\n",score);
//
        int score=6;

        if(score>=90){

            System.out.println("A");

        }else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {

            System.out.println("C");
        }else {
            System.out.println("D");

        }


        System.out.println("--End--");

    }
}
