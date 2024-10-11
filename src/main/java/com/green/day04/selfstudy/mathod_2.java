package com.green.day04.selfstudy;

public class mathod_2 {
    public static void main(String[] args) {

        printHeader();//호출
        //String str printHeader(); 반환값 입력시 오류
        System.out.println("ㅎㅇ");
        printFooter();
    }

    public static void printHeader(){//매개변수와 반환타입이 없으면 비워두고 정의하기
        System.out.println("프로그램 시작");
}
    public static void printFooter(){

        System.out.println("프로그램 종료");//반환타입이 void인 경우 알아서 리턴처리됨
}

}
