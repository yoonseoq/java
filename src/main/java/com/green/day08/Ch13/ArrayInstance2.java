package com.green.day08.Ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {
        /*
        arr은 Box저장 개체값
        각 공간에 저장되는
         */

        //Box b0,b1,b2,b3,b4;//b0 b1 b2 등등 각각 공간마다 박스 객체의 주소값만 담을 수 있다 memory address

        Box[] arr= new Box[5];
        System.out.println(arr.length);

        Box b1 = new Box("안녕");//기본생성자 추가해야함
        System.out.println(b1);
        System.out.println(b1.toString());

        arr[0]=b1;
        arr[1]=new Box("하세요.");//다 박스의 객체값
        arr[2]=new Box("반갑습니다.");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

class  Box extends Object{
    private String conts;

    Box(String conts){
        this.conts=conts;

    }
    public String toString(){// {}오버라이딩
        return "1";//찍혔으면 하는것
    }
}