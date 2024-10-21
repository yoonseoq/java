package com.green.day10.Ch13;

import java.util.Arrays;

public class
Mission13_1 {
    public static void main(String[] args) {
        /*
        다음 메소드는
         */
        int[][]arr2={
                {1,2,3},
                {4,5,6}
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
       // addOneDArr(arr, 3);//메소드의 재활용성 극대화

        addTwoDArr(arr2,2);//보이드 쓰는 ㅇㅣ유 리턴값을 받지 않아도
        System.out.println(Arrays.deepToString(arr2));//주솟값만 받고 값이 바뀜
        //deep빼먹음 バカ
    }

    public static void addTwoDArr(int[][] arr,int add){
        for (int i = 0; i < arr.length; i++) {//배열의 행
            addOneDArr(arr[i], add);//배열의 열만큼
        }
    }// 薩摩芋



    public static void addOneDArr(int[] arr, int add) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + add;
        }
        //System.out.println(arr);
    }

    public static void addOneDArr(int[] arr) {//이런게 오버로딩!

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //System.out.println(arr);
    }

}
