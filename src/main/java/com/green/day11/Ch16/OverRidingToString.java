package com.green.day11.Ch16;

public class OverRidingToString {
    public static void main(String[] args) {

        Cake c =new Cake();
        System.out.println(c);
        CheeseCake cheeseCake=new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2=cheeseCake;//cheesecake 가 c2에 복사가 되었기 때문
        //실행이 된다면 둘다 똑같다
        System.out.println(c2);
    }
}

class Cake{
    @Override//왜 이거 붙이면 좋울까? 실수방지 오타생기면 바로 빨간줄생긴다.
    public String toString(){
        return "My birthday cake";
    }

    final void blowCandle(){//final을 붙이면 오버라이딩 금지
        System.out.println("초를 분다");
    }
}
//클래스 앞에 final키워드가 있으면 상속금지
final class CheeseCake extends Cake{//그 어떤 클래스도 치즈케이크 ㅅㅏㅇ속못함
    @Override
    public String toString(){

        return "My birthday cheese cake";
    }
    /*
    자식에서 blowCandle 오버라이딩 할 수 없다. 부모메소드에 final키워드가 있기때문
    void blowCandle(){

    }

     */
}
//class chocoCheeseCake extends CheeseCake{}상속받았다간 빨간줄ㄸ므