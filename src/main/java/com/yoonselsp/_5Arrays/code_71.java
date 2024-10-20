package com.yoonselsp._5Arrays;

public class code_71 {
    public static void main(String[] args) {
        int[][] data= new int[3][];//행의 길이만 3으로 명시함. 그러면 열의 길이는 default로 0 초기화됨.

        data[0]=new int[4];
        data[1]=new int[5];
        data[2]=new int[3];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {//각 행마다 열의 길이
                System.out.print(data[i][j]);
            }
            System.out.println();

        }


    }
}
