package com.yoonselsp._5Arrays;

import java.util.Arrays;

public class code_70 {
    public static void main(String[] args) {

        //2차원 배열

        int[][] data= new int[3][4];//[행크기][열크기]
        data[0][0]=10;
        data[0][1]=10;
        data[0][2]=10;
        data[0][3]=10;
        data[1][0]=10;
        data[1][1]=10;
        data[1][2]=10;
        data[1][3]=10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();//한 행의 배열이 끝날때마다 개항함
        }
        //나머지 설정안한 값들은 디폴트로 0이 설정된다.

    }
}
