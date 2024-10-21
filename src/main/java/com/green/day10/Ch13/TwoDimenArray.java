package com.green.day10.Ch13;

public class TwoDimenArray {
    //2차원 배열
    public static void main(String[] args) {

        int[][] arr = new int[3][5];// 2dimension array 배열안에 배열
        int[][] arr3 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        int n=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=n++;//이렇게 하묜 편함
                //arr[i][j]=n+=2;//이렇게 하묜 편함
                //n+=2이렇게하면 2씩증가
                //각행의 열마다 1씩 증가하는 부분
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(arr[0][4]);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf("%d, ",arr[i][j]);
            }
        System.out.println();
        }

        /*
        arr,arr3의 각방에 저장 할 수 있는타입은 int[]이다
         */

        System.out.println("arr.length:" + arr.length);//행개수
        System.out.println("arr3.length:" + arr3.length);//행개수

        //int[] tmp1 = arr[0];//index0번째 행임
        int[] tmp1 = arr3[0];//index0번째 행임
        System.out.println("tmp1[2]:"+tmp1[2]);//arr3의 0번째 행에서 index2번째값
        System.out.println("arr3[0][2]:"+arr3[0][2]);//arr3의 0번째 행에서 index2번째값
        System.out.println(tmp1[2]);//arr3의 0번째 행에서 index2번째값


        int[] tem2={0,10,7,14,0};
        System.out.println(tem2[2]);


        int[][][] arr2 = new int[3][5][2];// 3dimension array 배열안데배열안에배열

        /*
        arr2의 각 방의 타입은 int[][]이다
         */

    }
}
