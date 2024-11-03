package com.green.day16.ch26;

public class MemberInner {//굳이 안쓰니까 무시
    public static void main(String[] args) {
        Outer2 o1=new Outer2();
        Outer2 o2=new Outer2();

        Outer2.Member o1m1=o1.new Member();//실무에서 잘 안씀
        Outer2.Member o2m2=o2.new Member();//실무에서 잘 안씀

        o1m1.add(10);
        o2m2.add(30);

        System.out.println(o1m1.get());
        System.out.println(o1.parentGet());
        System.out.println();
        System.out.println(o2m2.get());
        System.out.println(o2.parentGet());
    }
}
class Outer2{
    private int num=0;//클래스에 스태틱이 빠진순간 그냥 사용가능

    class Member{
        void add(int val){
            num+=val;
        }
        int get(){
            return num;
        }
    }

    int parentGet(){
        return num;
    }
}