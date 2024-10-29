package com.green.day15.ch18;

public class Exception12 {
    //public static void main(String[] args) throws Exception{//메인메소드가 던지면 에러임
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("お終い");
    }
    static void method1()throws Exception{
        method2();//서로 던지고 던지고 던졌으면 나를 호출한애한태 던짐
    }
    static void method2() throws Exception{
        throw new Exception("하하");
        //throws 메소드에만 사용하능 한게 아니라 예외를 일부러 발생시키고 싶을때
    }
}
//모르겠다.지피티한테 물어봄