package com.green.day07.Ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum=10;
        InstCnt ic1 = new InstCnt();
        InstCnt ic2 = new InstCnt();
        InstCnt.instNum=5;
        InstCnt ic3 = new InstCnt();
    }
}
class InstCnt {
    static int instNum = 0;//스태틱이 붙으면 한공간
    int value;//각각의 부분
    InstCnt(){//기본 생성자: 파라미터가 하나도 없음
        instNum++;
        value++;
        System.out.println("인스턴스 생성:"+InstCnt.instNum);
        System.out.println("Value:"+value);
    }
}