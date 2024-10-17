package com.green.day07.Ch11.Mission;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm="nice_v.ety.Nice.jpg";
        /*
        점의 위치값으로 리터럴 사용 금지
         */
        //String ext=?
        System.out.println(fileNm.lastIndexOf("."));//자릿값 구하기
        //System.out.println(fileNm.substring(fileNm.lastIndexOf(".")+1));//자릿값 뒤에부터 끝까지
        System.out.println(fileNm.substring(fileNm.lastIndexOf("j")));//자릿값 뒤에부터 끝까지
    }
}
