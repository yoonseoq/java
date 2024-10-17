package com.green.day08.Ch13;

public class ArrayLimit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
        arr[i]=10(i+1)
         */
        arr[2]=10;
        for(int i=0; i<arr.length; i++){
            arr[i] = 10 * (i+1);
                System.out.printf("arr[%d]:%d\n",i,arr[i]);
        }
//        for(int i=0; i<arr.length; i++){
//
//                System.out.printf("arr[%d]:%d\n",i,arr[i]);
//        }
    }
}
