package com.green.day07.Ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum=10;//클래스명.스태틱 다음의 멤버필드
        InstCnt ic1 = new InstCnt();//별개
        InstCnt ic2 = new InstCnt();//별개
        InstCnt.instNum=5;
        InstCnt ic3 = new InstCnt();//별개
    }
}
class InstCnt {
    static int instNum = 0;//스태틱이 붙으면 한공간
    int value;//각각의 부분 value는 생성될때마다 자신의 값을 가짐



    InstCnt(){//기본 생성자: 파라미터가 하나도 없음. 앞에 리턴타입이 없다. 클래스랑 이름이 같다
        instNum++;
        value++;
        System.out.println("인스턴스 생성:"+InstCnt.instNum);      //객체셍성시 실행되는 것들  조 용 히 해
        System.out.println("Value:"+value);
    }
}