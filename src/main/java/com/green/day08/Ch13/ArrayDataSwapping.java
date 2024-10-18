package com.green.day08.Ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10,20,30};//같은 데이터타입을 붙여서
        int a; //저장공간 미리 만들어 놓기


        a=arr[0];//0번째 미리 넣어두고 비워둠
        arr[0]=arr[2];//2번째0번째로 옮김
        arr[2]=a;//a에 맡겨ㄱ둔거 다시 2번째로 옮김

        System.out.println(Arrays.toString(arr));
        //toString 클래스.메소드
    }
}
