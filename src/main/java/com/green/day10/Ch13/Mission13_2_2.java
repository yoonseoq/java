package com.green.day10.Ch13;

import java.util.Arrays;

public class Mission13_2_2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}};//한칸씩 뒤로 물리게

        System.out.println(Arrays.toString(arr));
        changeA(arr);
        System.out.println(Arrays.deepToString(arr));
        arrayChangeOrder(arr);
        System.out.println(Arrays.deepToString(arr));
        /*
        1 2 3
        4 5 6
        7 8 9 가벼운 복사로 옮기고 옮기고

        i>2
        2>3
        3>1
         */
    }
    /*
    신발 진짜
     */


    public static void changeA(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int[] a,a1;
             a = arr[0];
             arr[0]=arr[2];
             a1=arr[1];
             arr[1]=a;
             arr[2]=a1;
        }

    }
    public static void arrayChangeOrder(int[][] arr){
        int lastIdx = arr.length-1;//제일 끝에값 배열길이에서 -1하면 lastindex알수있음
        int[] last=arr[lastIdx];//arr[4]에 있는 주소값을 잠깐 임시배열방에다가 옮김
        for (int i = lastIdx; i >0; i--) {//i=4 3 2 1 이렇게 돌아감

            arr[i]=arr[i-1];

            /*
            arr[4]=arr[3];
            arr[3]=arr[2];
            arr[2]=arr[1];
            arr[1]=arr[0];
             */

        }
        arr[0]=last;//제일 마지막에 배열
    }
}
