package com.yoonselsp._5Arrays;

public class code_72 {
    public static void main(String[] args) {

    /*
    for-each 스타일의 반복문
    for(자료형 변수:배열){반복 처리할 문장}
     */
        int[] data = {23, 4, 54, 7, 8};

        for (int x : data) {  //배열 data에서 원소를 하나씩 x에다가 가져와서 저장한다

            System.out.print(" "+x);
        }
    }


}
