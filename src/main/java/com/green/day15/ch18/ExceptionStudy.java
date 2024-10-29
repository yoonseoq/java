package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {

        String str1 = "123";
        int inVal1 = myParseInt(str1);
        System.out.println("intVal1:" + (inVal1 + 1));

        String str2 = "123a";
        int inVal2 = myParseInt(str2);
        //예외 터트리지 않고 0을 리턴하는 메소드 만들고 싶
        System.out.println("intVal2:" + inVal2);

        //myParseInt 앞에.을 붙이지 않아서 같은 class 안에있는 메소드
        //myParseInt 앞에.을 붙이지 않아서 객체화를 하지 않았다. 즉 static 메소드,
        //리턴타입을 보고 int 라는것을 알 수 있다
        //str 을 보고 myParseInt 가 메소드인걸 앎
        //파라미터는 str 의 타입이 string 이기 때문에 파라미터 타입도 string
    }

    static int myParseInt(String str) {
        try {
            return Integer.parseInt(str);//문자열 타입을 정수화시킴
        } catch (Exception e) {
            return 0;//어디든 리턴을 해야 빨간줄 안뜸
        }
    }
}
