package com.green.day16.ch26;

//익명 클래스
/*
    익명클라스는 interface를 implements 한 클래스를 만들지 않고
    다이렉트로 interface를 implements한 클래스를 객체화할때 사용 할 수 있다
    즉 코드작성을 많이 생략가능
    익명 클래스 작성보다 더 많이 생략할수 있는게 람다식이다
    람다식을 작성 할 수 있는 interface는 오로지 추상메소드 하나만 가지는 경우에만 가능
    그래서 보통 람다식을 사용하는 interface는 @FunctionalInterface 애노테이션이 붙어있디
    이 애노테이션은 2개ㅡ의 추상메소다 있으며 터트린다
 */
public class UseAnonymousInner {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("익명클래스 프린트");
            }
        };//이게되네가 아니라 익명클래스임
        Printable p2 = () -> {
            //() 파라미터가 부분. ->그 식의 시작
            System.out.println("람다프린트");
        };//추측성:생략해도 추측이 가능한 부분
        Printable p3 = () -> System.out.println("명령이 한줄이면 이렇게 중괄호{} 생략 가능");

        p2.print();
        p.print();
        p3.print();
    }
}

//인터페이스ㅡㄴㄴ 가질수 있는게 추상메소드 객체화 안댐
//오로지 추상메소드 하니민 가지고 있는 인터페이스만 람다식을 사용할 수 있다.
@FunctionalInterface
//추상메소드 2개이상 뜨면 빨간줄 근데 람다식 사용한 부분에서 알아서 빨간줄뜸
        //즉 추상메소드 하나만 가질수 있게 함
interface Printable {
    void print();
    //void print2();
}