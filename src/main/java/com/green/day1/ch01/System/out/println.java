package com.green.day1.ch01.System.out;

public class println {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println(3.15);
        System.out.println("3+5="+8);//문자열+정수:정수가 자동형변환이 되어 문자열이 된다
        System.out.println(3.15+"는 실수입니다");//실수+문자열이묜 실수가 자동형변환되어 문자열이 됨
        /*
        문자열과 더하기가 만나면 다른항은 무조건 문자열로 자동형변환이 된다
        연산의 우선순위를 높이려면 ()소괄호를 사용하여 묶으면 된다
         */
        System.out.println("3+5"+"의 연산결과는 8입니다");
        System.out.println(3+5);//3+5연산이 먼저 진행되고 결과값인8이 println매소드에 보내짐
    }
}
