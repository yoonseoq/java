package com.green.day09.Ch13;

public class EnhancedFor {
    //향상된 for문
    public static void main(String[] args) {
        int[] arr ={1,2,5,7};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");

        for(int item: arr){
            System.out.println(item);
        }
        /*
        system.out,pritnln()

        시퀀스가 있는 콜렉션에서 사용 가능하다
        0,1,2번방 같은 순차적으로 값을 읽어오고 쓰는 콜렉션에서는 사용가능
        Array, ArrayList 에서 사용가능

        보통 값을 읽어올때 사용
        enhance for문은 아래처럼 동작한다
        자도응로 마지막 인댁스 값까지 반복한다



        int item=arr[0];
        System.out,println(item);
        int item=arr[1];

        System.out,println(item);
        int item=arr[2];

        System.out,println(item);
         */
    }
}
