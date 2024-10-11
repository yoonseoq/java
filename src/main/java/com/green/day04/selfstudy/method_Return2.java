package com.green.day04.selfstudy;

public class method_Return2 {
    public static void main(String[] args) {
            checkAge(20);
    }

    static void checkAge(int age){
        if(age<18){
            System.out.println(age+"살 미성년자는 출입금지");
            return;//true일시 바로 메서드 빠져나감
        }
        System.out.println(age+"살 입장하세요");
    }//false면 반환안됨 컴파일오류 즉 누락됨, 리턴문을 만나면 즉시 탈출

 




}
