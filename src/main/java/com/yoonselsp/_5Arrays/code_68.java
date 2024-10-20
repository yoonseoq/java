package com.yoonselsp._5Arrays;

import java.util.Arrays;

public class code_68 {
    public static void main(String[] args) {
        //배열에 배열 대입하기

        int[] data1 = {1, 2, 3, 4, 5};
        int[] data2;

        data2 = data1;//data1 값을 data2값을 복사

        System.out.println("data1:"+data1);
        System.out.println("data2:"+data2);//똑같이 주소가 옮겨간것을 볼 수 있다

        data1[1]=5000;
        //여기에서 data1 의 index[1]값에 5000을 대입하묜 어캐될까요

        System.out.println("data1:"+ Arrays.toString(data1));//data1:[1, 5000, 3, 4, 5] 즉 index1 값만 5000으로 바뀜
        System.out.println("data2:"+ Arrays.toString(data2));
    }
}
