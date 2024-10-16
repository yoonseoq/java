package com.green.day07.Ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "coffee";
        String str2 = "bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4= str1+str2;
        System.out.println(str4);

        String str5= str2.concat(str1);//concat 뒤에 이어붙임
        System.out.println(str5);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("---------------");
        String str6= "abcdefghijklmnopqrstuvwxyz";
                    //0123456789...
        System.out.println(str6.substring(3));
        System.out.println(str6.substring(3,8));//3번부터 시작해서 8바로 전까지
        String str7 = "LExI";
        String str8 = "Lexi";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str7.compareTo("LExI"));//0이면 같다는뜻
        System.out.println(str7.equalsIgnoreCase("LExI"));//대소문자 구분없이 같은지 비교
        /*
        my life is waiting for you
        substring()지정한 숫자번째 부터 끝까지 냄
         */

        int n = 10;
        String str9 = n+"k";
        String str10 = String.valueOf(n);//모든타입을 문자열로 변경
        System.out.println(str9);
        System.out.println(str10);

        String fileNm = "nice_very.nice.jpg";
        System.out.println(".의 위치값:"+fileNm.indexOf("."));//왼쩍에서 오른쪽으러 가장빨리 찾은 인덱스값을 리턴
        System.out.println(".의 위치값:"+fileNm.lastIndexOf("."));//왼쩍에서 오른쪽으러 가장빨리 찾은 인덱스값을 리턴

    }
}
