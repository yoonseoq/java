package com.green.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이입력:");
        try {
            int age = readAge();//왜 빨간줄
            System.out.printf("입력된 나이: %d\n",age);
        } catch (ReadAgeException e) {//던진 예외를 캐치가 잡음
            System.out.println(e.getMessage());//유효하지 않다 어저구
        }
    }
    //던지는 메소드를 해결하고 싶으면 try-catch문으로 감싸기

    public static int readAge() throws ReadAgeException{
        Scanner scan = new Scanner(System.in);
        int age= scan.nextInt();
        if(age<0){//나이가 0보다 작으면 예외
            scan.close();
            throw new ReadAgeException();
        }
        System.out.println(">>if문 이후");
        scan.close();
        return age;
    }
}
class ReadAgeException extends Exception{
ReadAgeException(){
    super("유효하지 않은 나이가 입력되었습니다");
    //부모클래스 생성자 호출
    //super는 부모의 주소값 가지고 있음
}
}