package com.green.day06.ch07;

public class PrimitiveVsReferenceTest2 {
    public static void main(String[] args) {

        int num = 10;
        changeNum(num);
        System.out.println("num:" + num);

        NumberBox2 nb= new NumberBox2();
        //nb.num=10;

        //changeNum(nb);
        System.out.println("nb.num:"+nb.num);

    }

    public static void changeNum(int num) {
        num = 100;
    }

    public static void changeNum(NumberBox2 nb) {


        // nb = new NumberBox2();

        nb.num = 100;
    }
}

class NumberBox2 {
    int num;
}