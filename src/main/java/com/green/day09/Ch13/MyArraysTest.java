package com.green.day09.Ch13;

import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        int []arr={2,4,5,9};



        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString(arr));//퍼블릭클래스.하고 호출이면 스태틱
        System.out.println(MyArrays.toString2(arr));//.하고 호출이면 스태틱
        System.out.println(MyArrays.toString3(arr));//.하고 호출이면 스태틱

        int[] arr2=Arrays.copyOf(arr,arr.length);//Arrays는 원래 있던것을 가져온거고
        //MyArrays 이건 우리가 직접 만든거
        /*
            인자를 (배열명,길이)두개 보내야함 근데 하나보냈을때 되도록 함
            길이개수만큼 카피가 됨
        */

        System.out.println(arr==arr2);
        System.out.println(MyArrays.toString(arr2));

        int[] arr4=MyArrays.copyOf(arr,1);
        System.out.println(MyArrays.toString(arr4));

        int[] arr3=MyArrays.copyOf(arr4);//왜 빨간줄 안없어짐 int배열 조건을 맞춰야하기때문
        System.out.println(arr==arr3);
        System.out.println(MyArrays.toString(arr3));



        //똑같이 나가야함
    }
}

