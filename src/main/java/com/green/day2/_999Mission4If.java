package com.green.day2;

import java.util.Scanner;

public class _999Mission4If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세용>>");
        int input=scan.nextInt();
        System.out.printf("input:%d\n",input);

        System.out.println(input+"은(는) "+ (input%2==0?'짝':'홀')+"수입니다");

        char result =(input%2==0?'짝':'홀');
        System.out.printf("%d은(는) %c수입니다\n",input,result);//%character type '홑따옴표'사용한 경우


        String result2 =(input%2==0?"짝":"홀");//대문자로 시작하면 레퍼런스 변수
        System.out.printf("%d은(는) %s수입니다\n",input,result2);//%character type '홑따옴표'사용한 경우

        System.out.println("--Rmx--");
    }
}
