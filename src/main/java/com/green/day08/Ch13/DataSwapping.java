package com.green.day08.Ch13;

public class DataSwapping {
    public static void main(String[] args) {
        //n1 n2서로 자리 바꾸기

        int n1=10, n2=20;

        int temp;//여기에다 잠시 값을 맡겨놨다가 다시 돌려줌

        temp = n1;

        n1=n2;

        n2=temp;

        System.out.printf("n1: %d,n2:%d\n",n1,n2);

    }
}
