package com.green.day2.ch05;

import java.util.Scanner;

public class _19SwitchStudy {
    public static void main(String[] args) {
        String name= new String("홍길동");
        String name2= new String("홍길동");

        System.out.printf("name:%s\n",name);
        System.out.printf("name2:%s\n",name2);
        System.out.printf("name.equals(name2):%b\n",name.equals(name2));//문자열일경우 .equals()사용

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하시오>>");
        String input= scan.next();
        if("abc".equals(input)){
            System.out.println("def");
        }

        switch (input){
            case "abc":
                System.out.println("switch-def");
                break;
        }

        System.out.println("---끝---");
    }
}
