package com.green.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
    BoxGeneric<Apple> appleBox=new BoxGeneric(new Apple());
    Apple apple= appleBox.getBox();//Apple 타입만 적용

    BoxGeneric<Orange> orangeBox=new BoxGeneric<>(new Orange());
    Orange orange= orangeBox.getBox();//Orange 타입만 적용

    BoxGeneric<Orange> orangeBox2=new BoxGeneric(new String());

    //new부분에 꺽새를 생략하면 객체는 타입이 제네릭의 타입은  Object 가 되는것 같다.
    //타입에 <Orange>로 형변환을 하는 것으로 예상
    //new 부분에 <>를 작성하는 것이 성능에 도움이 됨

    }
}
class BoxGeneric<T>{
    //아직까지 타입이 정해지지 않음 클래스가 객체화가 될때 타입이 정해짐
    private T fruit;

    BoxGeneric(T fruit){
        this.fruit=fruit;
    }

    T getBox(){
        return this.fruit;
    }
}

