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

        byte var1=127;
        short var2=300;//var1이 자동으로 형변환이 된다
        int var3=var1+var2;

        int var4=100;
        long var5=2*var4;

        int var6=(int)var5;//근데 강제형변환은 가능
        float var7=var5;



    }
}
