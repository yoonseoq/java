package com.yoonselsp._6Method;

public class code_83 {
    public static void main(String[] args) {

        findPower(2,10);

    }

    public static void findPower(int x,int y){
        //매개변수를 받음 그렇지만 반환값이 없다 void

        int result=1;//우선 결과값 1로 초기화
        for (int i = 0; i < y; i++) {

            result*=x;//x^y

        }
        System.out.printf("%d의%d제곱:%d",x,y,result);

    }
}
