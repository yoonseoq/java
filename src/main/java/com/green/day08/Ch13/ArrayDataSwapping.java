package com.green.day08.Ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int a;
        int arr1[]={};
        a=arr[0];
        arr[0]=arr[2];
        arr[2]=a;

        System.out.println(Arrays.toString(arr));

    }
}
