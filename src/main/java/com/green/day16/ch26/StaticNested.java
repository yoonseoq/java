package com.green.day16.ch26;

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(10);
        nst1.add(2);

        Outer.Nested2 nst2=new Outer.Nested2();
        System.out.println(nst2.get());
    }
}

class Outer{
    public static int num;
        //static nested class 클래스 안에 클래스
    static class Nested1{
        void add(int val){
            num+=val;
        }
    }
    static class Nested2{
        int get(){
            return num;
        }
    }
}