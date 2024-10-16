package com.green.day07.Ch11.Mission;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm="nice_v.ety.Nice.jpg";
        //String ext=?
        System.out.println(fileNm.lastIndexOf("."));
        System.out.println(fileNm.substring(fileNm.lastIndexOf(".")+1));
    }
}
