package com.green.day06.ch07;

public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {


        int num=10;//지역변수
        changeNum(num);
        System.out.println(num);
        /*
        메인 메소드에 있는  num변수와 changenum메소드에 있는 num매개변수 (m-num)은 다른공간이다. 메인 num이 가지고 있는 값을 복사하여
        m-num값에 저장
        m-num값을 변경한다고 해서 메인 num값이 변하질 않는다
         */


        NumberBox2 nb= new NumberBox2();//new 객체화. nb는 저장할수 있는 값 메인메소드가 살아있을때 사용 스코트가 다르다
        //NumberBox2()값이 저장되어 nb에 복사됨
        nb.num=10;//num값이 0인데 10으로 변경

        Integer num2=nb.num;
        //멤버필드는 private해놔서 안뜸 멤버필드는 상수일때 뜬다
       // changeNum(nb);//nb는 정수값이 아니다 NumberBox저장값을 불러올 수 있는부분?
        changeNum(nb);//100입렫된 값으로 바뀜
        System.out.println(num);
        System.out.println(num2);
        System.out.println("nb.num:"+nb.num);//changeNum(nb)호출 안하면 10

    }
    public static void changeNum(int num) {//같은 num이더라도 서로 다른값
        num=100; //호출하고 바로 죽어버려서 값은 여전히 10
    }
    /*
    메인 메소드에 있는 nb와 changeNum메소드에 있는 nb매개변수는 다른 공간이다. 다만 같은값을 가지고 있어서 그로인해 같은객체어 접근가능
    m-nb를 통해 객체의 num값을 변경을 했다면 main-nb를 통해 접근했을때 변경된 값을 얻게 된다
    */

    public static void changeNum(NumberBox2 nb) {//changeNum(nb)의 nb가뵤 복사

        //nb=new NumberBox2();//왜 10일까요;;

        nb.num=100;//원래 10인데  nb.num값으로 가서 100을 바꾸라고 대입 그후 죽어버리고 리턴키워드 만남//
    }
}

/*

  tlqkf!!!!!!!!

 */


class  NumberBox{
    int num;//기본값 0이 세팅됨
}