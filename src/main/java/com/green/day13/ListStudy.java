package com.green.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {
    /*
    사용방법

    List: Interface 인터페이스
    인터페이스느느부모역ㅇ할만 해서 객체화가 불가능하다.
    리스트를 상속받은 Class(LinkedList,ArrayList)가 있다.
    둘의 class는 결과는 똑같은데 처리방식이 다르다
    LinkedList는 Node방식으로 데이터를 다루고
    Array리스트는 Array배열 방식으로 데이터를 다룬다
    LinkedList는 수정이 잦으면 유리하고
    ArrayList는 읽기위주의 작업이 많으면 유리하다

    List 변수명 = new ArrayList():
    List 변수명 = new LinkedList():
    이렇게 작성 가능하다
    나를 상속받은 누군가가 있다
     */








    public static void main(String[] args) {
        List list =new ArrayList();//알트엔터 누르면 임포트툄,toString값이 오버라이딩 되어있다
        list.add(10);//0번방에 들어감
        list.add(20);//1번방에 들어감

        ArrayList list1=(ArrayList)list;//부모타입을 자식타입으로 명시적 형변환해야함
        list1.add(30);//2번방에 들어감
        list1.add("ㅋ");//3번방에 들어감
        //정수만 넣다가 String 타입을 넣었는데
        // 왜 됨? 오브젝트 타입은 아무거나 다 들어감

        int[] arr= new int[3];

        Object[] arr2= new Object[4];
        arr2[0]=10;
        arr2[1]="ㅉ";

        //int val0 = list.get(0);//인트 여야 하는데 오브젝트라서 형변환 해야함
        int val0 = (int)list.get(0);//인트 여야 하는데 오브젝트라서 형변환 해야함
        String val3 = (String)list.get(3);//인트 여야 하는데 오브젝트라서 형변환 해야함

        //String val2 = (String)list.get(2);
        // 오류터진 이유는 문자열 타입이 아니라 정수 타입이였기 때문

        System.out.println("val0:"+val0);//int 타입으로 했기에 정수타입이 됨
        System.out.println("val3:"+val3);//int 타입으로 했기에 정수타입이 됨

        /*
        System.out.println(arr2);//>>[Ljava.lang.Object;@4c873330 왜 이게 뜰까여
         오ㅐ냐하면 스트링 안해서
        */
        //빼내기
        System.out.println(Arrays.toString(arr2));//>>[Ljava.lang.Object;@4c873330 왜 이게 뜰까여

        list.get(0);




        System.out.println(list);
        System.out.println(list1);


    }
}
