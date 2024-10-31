package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        PrintableVar2 p=s-> System.out.println(s);//이름없는 클래스 만들어서 바로 객체화
        PrintableVar2 p2=(s)-> System.out.println(s);//이렇게 소괄호 있어야함
        //중괄호 생략 가능한 이유는 한줄이기 때문 이다
        //파라미터가 하나면 생략가능
        p.print("ㅋㅋ");
        p.print("（笑（笑））");
        //중괄호생략시 리턴도 생략가능(중괄호 생략시 리턴키워드 작성 불가)
        Calc sumCalc=(n1,n2)->n1+n2;//파라미터 두개있으면 소괄호 생략 불가
        Calc minusCalc=(n1,n2)->n1-n2;
        Calc multifliyCalc=(n1,n2)->n1*n2;
        Calc devideCalc=(n1,n2)->n1/n2;
        System.out.println(sumCalc.calc(2, 3));
        System.out.println(minusCalc.calc(2, 3));
        System.out.println(multifliyCalc.calc(2, 3));
        System.out.println(devideCalc.calc(6,2));
    }
}
@FunctionalInterface//추상메소드가 하나만 있기에 문제가 없게끔
    //하나쓰는이유 람다식 만들려고
interface PrintableVar2{
    void print(String str);
    //파라미터가 있고 리턴타입 보이드인 @FunctionalInterface 는 consumer
    //그냥()가 있는거는 supplier 제공자
    //제네릭 <>이게있어서 타입 정의하기 좋음
}

@FunctionalInterface
interface Calc{
    int calc(int n1, int n2);
//파라미터 두개 받고 리턴타입인것

}