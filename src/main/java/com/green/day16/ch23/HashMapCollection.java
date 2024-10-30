package com.green.day16.ch23;

import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>(); //상속관계
        //<key,value>
        map.put("홍길동","시계");
        map.put("권혜지","자바책");
        map.put("이정민","빈깡통");
        map.put("홍길동","ㅋㅋㅋㅋㅋㅋ");

        System.out.println(map.keySet());

        String v=map.get("홍길동");
        System.out.println("v:"+v);
        System.out.println(map.get("권혜지"));//혜지씨의 value 값을 구하기
        System.out.println(map.get(1));
    }
    //반복문 메소드 코드해석하고 쓸줄 알아야 한다.
}
