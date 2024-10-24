package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        /*
        Generic 제네릭
        제네릭을 사용하묜 실행시에 타입이 결정된다, 제네릭을 사용된클라스에 타입을 결정하지 않으묜
        타입은 오브젝트가 된다
         */
        List<Integer> list=new ArrayList();//정수만 넣을수 있게 미리박제
        //list.add(""); 그래서 문자열 못넣음
        //아래 세가지중 맘에드는거 사용 ㄱ
        List<Integer> list1=new ArrayList();//정수만 넣을수 있게 미리박제
        List<Integer> list2=new ArrayList<>();//정수만 넣을수 있게 미리박제
        List<Integer> list3=new ArrayList<Integer>();//정수만 넣을수 있게 미리박제
        //
        list.add(10);
        list.add(20);
        list.add(30);

        int n1=list.get(0);//형변환 안해도 된다. 아이고 달다
        list.add(1,30);//1번방에 30을 넣고 기존에 있던칸은 뒤로 한칸씩 밀려나감

        System.out.println(list);
        System.out.println(list.size());//배열길이 알 수 있다.

        list.remove(2);//인텍스 값만입력해서 삭제함

        System.out.println(list);//삭제 한 후 배열값
        System.out.println(list.size());

        list.lastIndexOf(30);
        //30을 가지고 있는 인덱스칸 중 가장 오른쪽인 부분 찾기
        list.lastIndexOf(30);
        System.out.println("list.lastIndexOf(30);"+list.lastIndexOf(30));

        list.clear();//다 비워버리기
        System.out.println(list);
        System.out.println(list.size());

        list.lastIndexOf(30);
        System.out.println("list.lastIndexOf(30);"+list.lastIndexOf(30));
        //아예 없는거면 -1이 나옴
    }
}
