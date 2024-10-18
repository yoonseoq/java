package com.green.day09.Ch13;

public class Mission13_1 {
        /*
        int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값;
        최솟갑을 찾아서 반환하는 메소드들로 각각 다음의 형대로 정의하자

        public static int minValue(int[] arr)//최솟값반환
        public static int maxValue(int[] arr)//최댓값반환
         */
    public static void main(String[] args) {
        int[] arr={43,48,45,56,66};
        int min=minValue(arr);
        int mav=maxValue(arr);
    }
public static int minValue(int[] arr){
    int min=arr[0];
    for (int i = 1; i <arr.length; i++) {
        if(min>arr[i]){
            min=arr[i];
        }
    }
    return min;
}
public static int maxValue(int[] arr){
    int max =arr[0];
    for (int item:arr){
        if(max<item){
            max=item;
        }
    }
    return max;
}
}
