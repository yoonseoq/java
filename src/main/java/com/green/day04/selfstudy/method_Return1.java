package com.green.day04.selfstudy;

public class method_Return1 {
    public static void main(String[] args) {
       boolean result=odd(4);
        System.out.println(result);
    }

    static boolean odd(int i){
        if(i%2==1){
            return true;
        }else {
            return false;
        }
    }//false면 반환안됨 컴파일오류 즉 누락됨, 리턴문을 만나면 즉시 탈출






}
