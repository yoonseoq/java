package com.green.day11.Ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);

        String s1 = new String("10");
        String s2 = new String("10");
        System.out.println("s1.equals(s2)" + (s1.equals(s2)));


        System.out.println("n1" + n1);
        System.out.println("n2" + n2);
        //레퍼런스 변수끼리의 ==비교는 주소값비교
        //n2,n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다
        //즉 2개의Numbox객체가 만들어졌다

        System.out.println("n1==n2" + (n1 == n2));
        System.out.println("n1.equals(n2)" + (n1.equals(n2)));
    }
}

class Numbox {
    private int num;

    Numbox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object){
        return false;
    }



    @Override
    public  String toString(){
        return String.valueOf(num);

    }
        /*
        메소드같기도.何々() 소괄호가 있기때문 (안에 파라미터 있어서?
        객체생성없이 클래스이름 사용해서 스태틱
        리턴타입이 String 이다.
        파라미터는 int타입

        오버라이팅 지우면 이거뜸
        n1com.green.day11.Ch16.Numbox@41629346
        n2com.green.day11.Ch16.Numbox@404b9385
     */


}