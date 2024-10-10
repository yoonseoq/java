package com.green.day2;

import java.util.Scanner;

public class _999Mission6_3 {
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

                int standHeight = 172;
                switch (gender){//만약 여자로 바뀔경우
                    case "여":
                        standHeight=159;
                }
                if(standHeight<height){
                    System.out.println("당신은 평균보다 큽니다");
                } else if (standHeight==height) {
                    System.out.println("당신은 평균입니다!");
                }else {
                    System.out.println("당신은 평균보다 작습니다.");
                }

    }



    }
