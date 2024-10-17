package com.green.day08.Ch13.selsp;

public class 問題1 {
    public static void main(String[] args) {
        int[]arr= new int[10];
        System.out.println(arr[9]);
        for(int i=0;i< arr.length;i++){
            arr[i]=i+1;
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }

    }
}
