package com.green.day1.ch02;

public class _0UseVariable {
    public static void main(String[] args) {
        //변수
        int num1;//변수선언,num1이라는 변수명을 가진 정수형을 선언
        //int 데이터타입(이 변수에 들어갈수 있는 데이터를 한정/제한)
        //num1 변수명(사용 할 때 쓰는이름)
        //데이터 주입시 대입연산자 사용

        num1=10;//'='은 대입연산자이므로 우측항 값을 복사하여 좌측항에 대입
                //왼쪽항은 저장가능해야함
                //변수선언 후 값 대입은 초기화
        int num2=20;//선언 및 초기화를 동시에
        int num3=num1+num2;
        //int num3은 두개 합한값
        System.out.printf("num1:%d,num2:%d,num3:%d\n"
                 ,num1,num2,num3);//이 메커니즘이 가독성이 좋음

        /*
        변수 사용 위해서는 선언을 해야함
        선언시 타입이 명시되는데 해당 데이터타입만 저장 가능하여야 한다
        (다른타입의 데이터는 저장불가,type 언어의 특징 신뢰)

        <변수사용이유>
        0.데이터저장
        1.여러군데에서 사용 할 때 참조할수 있어야한다
        값이 변경되었을때 변수값만 사용하면 그만
         */
    }
}
