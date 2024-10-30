package com.green.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {

        BiPredicate<String,Integer>conv=(str,len)->str.length()>len;

        String str1="dd";
        String str2="ddd";

        BiPredicate<String,String>cov2=(s1,s2)->s1.length()==s2.length();


       if (cov2.test(str1,str2)){
           System.out.println("same");
       }else {
           System.out.println("different");
       }

       // BiPredicate<String,String>conv1=(str1,str2)->str1.equals(str2);
        //문자열의 길이가 내가 정한 정수값보다 크면 true,아니면 false
        //두개값 받고 옳김

        System.out.println(conv.test("Robot",3));
        System.out.println(conv.test("Robot",8));
        System.out.println(cov2.test(str1,str2));
        //System.out.println(conv1.test("Robot","Robot"));
        //System.out.println(conv1.test("Robot","Robut"));
    }
    //같은 스코프에서 명칭이 중복되면 에러(보윤씨
}
