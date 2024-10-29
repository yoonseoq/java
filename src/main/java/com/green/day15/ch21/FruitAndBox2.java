package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox =new FruitBox(new Apple());
        //객체생성되자마자 멤버필드에 과일값이 저장되엇으면 해서
        FruitBox orangeBox =new FruitBox(new Orange());
        Apple apple=(Apple) appleBox.getFruit();

        FruitBox orangeBox2=new FruitBox("오렌지");
        Orange orange2=(Orange)orangeBox2.getFruit();
        //오브젝트타입으로 받고 던지는데 오렌지와 스트링은 같은타입이 아니여서 에러가 터짐
        //왜 에러가 발생하죠
        System.out.println("End");
    }
}
//default:private + 같은 패키치면 접근 가능
//생성자를 쓰는이유는 멤버필드 값을 초기화 하기 위함
class FruitBox{
    private Object fruit;

    FruitBox(Object fruit ){
        this.fruit=fruit;
    }
    Object getFruit(){
        return fruit;//리턴타입은 멤버필드 그대로 보내주면댐
    }

}


