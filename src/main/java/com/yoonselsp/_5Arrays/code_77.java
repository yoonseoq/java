package com.yoonselsp._5Arrays;

public class code_77 {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");

        if(s1==s2){
            System.out.println("Same");
        }else {
            System.out.println("Different");//문자열의 경우 비교식에 ==은 쓰면안댐
        }

        if(s1.equals(s2)){
            System.out.println("Same");
        }else {
            System.out.println("Different");//문자열의 경우 비교식에 equals를 써야함
        }

    }
}
