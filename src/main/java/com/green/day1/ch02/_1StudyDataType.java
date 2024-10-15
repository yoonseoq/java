package com.green.day1.ch02;

public class _1StudyDataType {
    public static void main(String[] args) {
        /*
            자료형: 정수형,실수형,불린형,문자형>> primitive  type(기본타입)

            특징: 타입이름이 소문자로 되어있음 총8개
                기본타입을 제외한 나머지는 reference type (참조타입)이다.




            #정수형
              - Byte(1), Short(2), int(4), long(8)

            #실수형: float(4), double(8)
            #불린형: boolean(1)
            #문자형: char(2)

         - Byte(1)> Short(2)> int(4)> long(8)> float(4)> double(8) 방향으로 자동형변환
                                            <<<반대방향으로는 형변환이 안됨
         */

         /*
        주소값 설정한 것이 변수에 데이터가 저장됨.
        객체를 이용하고 싶으면 특정메모리에 객체의 주소값을 저장
        new는 객체화 하고 싶은 클래스를 만들때 사용, 객체생성

        (Primitive Type)기본타입을 제외한 모든 변수는 참조변수(Reference Type)이다.
        참조변수는 객체의 주소값을 입력
        Kcal(클래스명) abc(변수명); >>abc는 Kcal의 객체 주소값만 저장 할 수 있다
        참조변수끼리 ==비교는 주소값이 같은지 비교한다

        "BankAccount ba" 대문자인 이유는 창조타입이기 때문이다
        reference type (참조타입) 객체의 주소값을 저장

        객체를 이용할 때에는 "주소값."으로 이용한다.
         */

        byte var1=127;
        short var2=300;//var1이 자동으로 형변환이 된다
        int var3=var1+var2;

        int var4=100;
        long var5=2*var4;

        int var6=(int)var5;//근데 강제형변환은 가능
        float var7=var5;



    }
}
