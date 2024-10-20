package com.yoonselsp._5Arrays;

public class code_73 {
    public static void main(String[] args) {

        double[] score={94.100,96.8,87.9,95,89.2};
        double total=0.0;//우선 총 점수를 를 0.0으로 초기화함
        double average;//평균값

        for(double s : score){//배열에 있는 각 값을 s 라는 double 변수에 에다가 복사
            total+=s;
            System.out.print(s+" ");

        }
        System.out.println();
        average=total/ score.length;//총 점수에다가 배열길이(과목수)를 나눔
        System.out.println("Average:"+average
        );
    }
}
