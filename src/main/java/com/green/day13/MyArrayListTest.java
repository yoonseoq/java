package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list= new MyArrayList();
        System.out.println(list);//[10,20]
        //미tus. add해도 빨간줄 안 뜨게
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        /*
        10널으면 [] 에 한칸 늘어나고 [10]
         */
        System.out.println(list);//[10]
        list.add(20);
        list.clear();
        System.out.println(list.size());
        /*

        20널으면 [arr.length+1]로 1+1 칸이 생김


        [0,0] 에다가  [0,20] 근대 for문이 돌면서 그 전에값이 복사됨



         */



    }
}
class MyArrayTest2{
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //마지막방에 있는건 리턴
        int removeValue=list.remove();
        System.out.println(list);
        System.out.println(removeValue);
    }
}