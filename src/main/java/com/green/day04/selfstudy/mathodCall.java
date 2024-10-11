package com.green.day04.selfstudy;

public class mathodCall {

    public static void main(String[] args) {

        int n1=5;
        int n2=n1; //n1은 5이다 즉 n2도 5 , n1값을 복사해서 n2에 대입하는 부분 즉 두수는 연관이 없다
        n2=10;// 근데 n2에 10을 대입조짐

        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);

    }
}
