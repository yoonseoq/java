package com.green.day15.ch21;

public class BoxInBox {
    public static void main(String[] args) {
        String str="I'm so happy.";
        BoxGeneric<String>sBox=new BoxGeneric<>(str);

        BoxGeneric<BoxGeneric<String>>wBox=new BoxGeneric<>(sBox);

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox=new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>>wBox2=zBox.getBox();
        //>>리턴되느ㅏㄴ 주소값은 wBox타이ㅂ이 나옴
        BoxGeneric<String>sBox2=wBox2.getBox();

        String str2=sBox2.getBox();
        System.out.println("wBox == wBox2: "+(wBox==wBox2));
    }
}
