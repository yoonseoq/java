package com.green.day08.Ch13;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr= {10,15,23,1,8};

        System.out.println(arr[0]);
            int sum=0;

        for(int i=0;i< arr.length;i++){
            //System.out.println(arr[i]);
            sum += arr[i];


        }
        System.out.println(sum);


    }
}
