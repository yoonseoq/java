package com.green.day07.Ch10;

public class ClassVariableAccess {
    public static void main(String[] args) {
        AccessWay aw=new AccessWay();//num:0>1
        System.out.printf("num:%d:\n",aw.num);
        aw.increseCnt();//1>2
        System.out.printf("num:%d:\n",aw.num);
        aw.num++;//2>3
        System.out.printf("num:%d:\n",aw.num);
        AccessWay.num++;//3>4 스태틱을 썻으면 이렇게 하는게 나음
        System.out.printf("num:%d:\n",AccessWay.num);//클래스명.static 변수 또는 메소드 이렇게 사용하는 것이 맞다.
        System.out.printf("num:%d:\n",aw.num);//가능은 하나 static 때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}
class AccessWay{
    static int num = 0;
    AccessWay(){//기본생성자
        increseCnt();//이 메소드 호출
    }
    void increseCnt(){//스태틱이 없는 메소드여도 스태틱 붙은 메소드 호출가능
        // 위에 스태틱이 있어서 오를 수 있다
        //근데 스태틱 메소드에서 일발 멤버필드는 안됨
        num++;
    }
}
