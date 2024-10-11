package com.green.day04.selfstudy;

public class mathod {
    public static void main(String[] args) {
        add(1,2);//메서드 호출
        int r = add(1,2);
        System.out.println(r);

    }

    static int add(int a,int b){//메서드 정의
        //반환타입 메서드이름
        return a+b;
    }//정식메서드




}
//static int add(int a,int b) 다른 클래스에 있는 한 public 요함