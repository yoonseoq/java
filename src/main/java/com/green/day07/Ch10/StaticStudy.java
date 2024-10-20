package com.green.day07.Ch10;

public class StaticStudy {
    public static void main(String[] args) {
        /*
        스태틱이랑 아닌거랑 변수가 무슨차이인가
         */
        StaticNumberBox.n1= 10;
        StaticNumberBox.n2= 15;
        StaticNumberBox.sum(StaticNumberBox.n1,StaticNumberBox.n2);
        // 위에 따로 변수를 선언해도 값은 바뀜 이렇게 매개변수를 이용해 해결하는 메소드는 스태틱으로 하자

        //NonStaticNumberBox.sum(); 이런건 안됩니다

        NonStaticNumberBox nnb1 = new NonStaticNumberBox();
        nnb1.n1=10;
        nnb1.n2=10;
        nnb1.sum();
        System.out.println("----------------");
        Math.random();//Math클라스 안에 있는 random이름의 스태틱 메소드
        //그렇지만 기본생성자 접근레벨이 private이기 때문에 객체화안댐
        StaticNumberBox snb= new StaticNumberBox();
        snb.n3=20;
        snb.n4=70;
        snb.sum();
       // snb.sum2();

        StaticNumberBox.sum(10,12);//22 Static 값은 애초에 각 개체마다 같은값을 저장하기에
        StaticNumberBox.sum(4,41);//22 Static 값은 애초에 각 개체마다 같은값을 저장하기에
        snb.sum();//90
        NonStaticNumberBox nnb2 = new NonStaticNumberBox();
        NonStaticNumberBox.n3=10;
        NonStaticNumberBox.n4=10;
        nnb2.sum();//뭔가 꾸역꾸역 된 느낌

    }
}
class StaticNumberBox{
    static int n1;//모든곳에서 쓰는경우는 파이널 스테틱
    static int n2;
    int n3;
    int n4;


    static void sum(int n1,int n2){
        System.out.println(n1+n2);
        NonStaticNumberBox.hello();//메인메소드에 겍체화 되엇기 때문이다.
        //helli(); static메소드에서 인스턴스 메소드 호출 불가

    }
    void helli(){
        System.out.println("helli");
    }
    void sum(){
        System.out.println(n3+n4);//몸소 객체화 시켜야함
        helli();//같은 클래스 내의 인스턴스는 되나요
    }
}

class NonStaticNumberBox{
    int n1;
    int n2;
    static int n3;
    static int n4;

    void sum(){
        System.out.println(n1+n2);
        hello();//같은클래스의 메소드여서 가능한건가

    }
    void sum2(){
        System.out.println(n3+n4);
    }

    static void hello(){

        System.out.println("hello");
    }
}
