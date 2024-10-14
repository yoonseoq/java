package com.green.day04.ch06;

public class _1MethodStudy {
    /*
    아래 메소드를 main 메소드라고 한다.
    메소드를 만드는 행위는 '메소드를 정의했다'고 표현
    만든 메소드를 사용하는 행위를 '메소드를 호출했다'고 표현 Call method
    public static은 나중에

    아래 4가지가 주요 메소드 구성요소
    void:리턴타입 :메소드가 호출되고 난 후의 결과값
    main:메소드타입: 메소드명 호출할떄 사용
    (String[] args):파라미터 ,매개변수 : 메소드를 호출시 메인메소드에 보내는 데이터
    {}:구현부:호출되었을 때 실행되는 부분

    (리턴타입+매소드명+파라미터):선언부

     메소드를 두분류로 나누면
     void 메소드 :리턴하는 값이 없다. 결과값이 없다. 실행커서가 호출한 곳으로 돌아간다.
     return(비void) 메소드 :리턴하는 값이 있다. 결과값이 있다

                                     아규먼트 줄임말*/
    public static void main(String[] args) {
        sum(8, 7);   //sum메소드 호출 >> 8이 n1,7이 n2로 대입 void 메소드에 보내는 값은 아규먼트
        sum(18, 7);  //sum메소드 호출 매개변수란 부를때마다 값이 바뀜
        int result=returnSum(5, 7);//12값이 복사가 되어 result로 들어감
        System.out.println("result:"+result);
        System.out.println("result2:"+returnSum(15,17));
        System.out.println("result2:"+32);
    }//메소드를 정의


    //메소드를 만들었으니까 sum이라는 이름의 static 메소드를 정의(파라미터(n1, n2)2개)
    static void sum(int n1, int n2) //선언부 정수값 입력
    {//void는 돌아가는 값이 없다
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    static int returnSum(int n1, int n2) { //똑같은 개수의 메소드는
        return n1 + n2; //돌아가면서 데이터를 들고 간다



        //호출한 자리가 12이됨 ,변수선언할때 쓰이는 거는 return
        //메소드는 함수같은 건가요  메소드는 무적권 return 이란 값이 들어가야함
    }

}