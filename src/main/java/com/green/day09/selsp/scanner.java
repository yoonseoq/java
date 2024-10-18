package com.green.day09.selsp;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//스캐너란 곳에서 객체생성
        System.out.println("숫자를 입력하세요");
        int input = scan.nextInt();//다음에 칠 내용
        //System.out.printf("input:%d\n",input);

        //홀짝 구분해보기
        System.out.println(input+":"+(input%2!=0?"홀":"짝"));
    }
}
