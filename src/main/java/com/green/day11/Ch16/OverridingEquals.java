package com.green.day11.Ch16;

public class OverridingEquals {
    public static void main(String[] args) {

        String s1 = new String("10");
        String s2 = new String("10");
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);
        Numbox n3 = new Numbox(13);
        System.out.println( "s1.equals(s2):" +(s1==s2));//f주소값 비교이므로 false
        System.out.println("s1.equals(s2):" + (s1.equals(s2)));
        System.out.println("s1.equals(s2):" + (s1.equals(n1)));


        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        //레퍼런스 변수끼리의 ==비교는 주소값비교
        //n2,n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다
        //즉 2개의Numbox객체가 만들어졌다
        //넘버박스 객체가 서로 같은 값을 가지면 트루나오게

        //gg

        System.out.println("n1==n2: " + (n1 == n2));
        System.out.println("n1.equals(n2): " + (n1.equals(n2)));
        System.out.println("n1.equals(n3): " + (n1.equals(n3)));
        System.out.println("n1.equals(n2): " + (n1.equals(s1)));
    }
}

class Numbox {//넘버박스에 들어있는 각 ㄱㅐ체마다 같은지 비교
    //1. 이퀄스는 같은객체에서 같은값인지 물어봄
    private int num;

    Numbox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object){//1 오브젝트 타입으로 들어옴
        if(!(object instanceof Numbox)) {
            return false;
        }
        Numbox nb=(Numbox) object;
        //return num == nb.getNum();
        return this.num==nb.num;
    }
    public boolean equals2(Object object) {
        if (!(object instanceof Numbox)) {
            return false;
        }
        return toString().equals(object.toString());
    }

    int getNum(){
        return num;
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