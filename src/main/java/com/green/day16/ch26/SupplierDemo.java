package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int) (Math.random() * 50.0);
        //supplier는 오로지 리턴으로 공급만 함
        //0~49사이의 호출가능한
        System.out.println(supRandom.get());

        List<Integer> list = makeIntList(supRandom, supRandom.get());
        System.out.println(list);
        List<Integer> list1 = makeIntList(supRandom, supRandom.get());
        System.out.println(list1);


    }
    /*
      List<Integer> (정수타입의 리스트) 타입이여야 한다
      그리고 Supplier<Integer>타입의 sup,그리고 임의의 정수 ㅜ2
     */
    static public List<Integer> makeIntList(Supplier<Integer> sup, int len) {

        List<Integer> al = new ArrayList<Integer>(len);//정수값을 넣으면 디폴트길이가 고정이 된다
        //새로운 Arraylist 객체주소값
        for (int i = 0; i < len; i++) {
            al.add(sup.get());
        }


        return al;
    }
}
