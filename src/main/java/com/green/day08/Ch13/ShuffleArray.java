package com.green.day08.Ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum;
        //배열은 무조건 이렇게 세팅
        for(int i=0;i<arr.length;i++){//i값 증가는 여기에 맡겨야함
            arr[i]=i+1;

            //난 왜 계속 arr[i]+=1;

        int rIdx=arr[(int)(Math.random()*arr.length)];
        int temp = arr[i];
        arr[i]=arr[rIdx];
        arr[rIdx]=temp;



        //System.out.println(rIdx);
        }

        //0번방부터 19번방까지 있음


        //arr[2]=10;//없는 방을 찾으면 에러뜸

        //1~20 순차적으로 값을 넣자
        System.out.println(Arrays.toString(arr));
    }
}
