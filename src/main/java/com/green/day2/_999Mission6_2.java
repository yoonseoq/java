package com.green.day2;

import java.util.Scanner;

public class _999Mission6_2 {
    public static void main(String[] args) {
//
//        남성172
//        여성159
//        평균

        Scanner scan= new Scanner(System.in);
        System.out.print("성별을 입력하세요.(여/남)");
        String gender=scan.next();
        System.out.print("키를 정수값으로 입력해주세요.(cm)");
        int height =scan.nextInt();

        System.out.printf("성별:%s,키:%d\n",gender,height);

                if(((height>172)&&(gender.equals("남")))||((height>159)&&(gender.equals("여")))){
                    System.out.println("평균 보다큽니다^^");
                } else if (((height==172)&&(gender.equals("남")))||((height==159)||(gender.equals("여")))) {
                    System.out.println("평균입니다^^");
                }else {
                    System.out.println("평균미만이네요");


        }



    }
}