package com.yoonselsp._5Arrays;

public class code_75 {
    public static void main(String[] args) {
        int[][] numbers = {{10,20,30,50},
                        {11,21,31,51},
                        {13,23,33,43}};

        for(int[] num:numbers){//일단 행의 수를 num에다가 복사
            for (int x:num){//그 행의 수만큼 열 값을 x에다가 복사
                System.out.print(x+" ");
            }
            System.out.println();
        }


    }
}
