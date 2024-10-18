package com.green.day08.Ch13;

public class ArrayDeepCopy {
    public static void main(String[] args) {

        int[] arr= {10,15,23,1,8};
        int[] copyArr=new int[arr.length];
        // arr과 같은 크기의 배열 만들기 그렇지만 데이터가 다르기에

        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[i];//일일이 복사시켜줌
            /*
            딥카피는 아예 똑같이 만들어 버림
            변경값이 위의 배열에 영향을 주는 가?
            네. 왜냐하면 arr이랑 copyArr이 이미 메인메소드에 선언되었기 때문
             */
        }

        System.out.println("arr==copyArr:"+(arr==copyArr));// 딥카피한거 일단 비교
        //참조변수(레퍼런스타입)끼리의 ==비교는 동일성(같은 주소값)을 묻는다

        int[] arr2=copyArr;//얕은복사(주소값 복사)
        System.out.println("arr==copyArr:"+(arr2==copyArr));

        //참조변수끼리의 비교는 동일성(같은 주소값)을 묻는다

        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]: %d\n",i, arr[i]);
        }
        for(int i=0;i<arr.length;i++){

            System.out.printf("copyArr[%d]: %d\n",i, copyArr[i]);

        }










    }
}
