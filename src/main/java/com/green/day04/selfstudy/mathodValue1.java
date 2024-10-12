package com.green.day04.selfstudy;

public class mathodValue1 {//大事な奴
    public static void main(String[] args){
        int num=5;
        System.out.println("1.bafore call change number"+num);
        changeNumber(num);//num1값을 읽고 num2에 복사
        System.out.println("4.after call change number"+num);//왜5일까?
        /*
        자바는 항상 변수값을 복사함 num2의 값을 바꾸더라도 num1값에다 영향을 주지 않는다
         */
        /*
        각각의 메서드 안에서 사용되는 함수는 서로 분리된 함수이다.
        메인의 변수랑 체인지 넘버의 변수랑 아예 다르다.
         */
    }
    public static void changeNumber(int num){
        System.out.println("2.before call change number"+num);
        num= num*2;
        System.out.println("3.after call change number"+num);//*2는 여기만 적용됨

    }
}
