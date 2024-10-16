package com.green.day07.Ch11;

public class MethodOverLoading {
    /*
    오버로딩은 메소드에서만 적용된다
    오버로딩은 같은 이름의 메소드를 여러개 정의 할 수 있는 기법딩
    매개변수의 종류 및타입이 다르다면 가능
    (같은 이름의 다른 메소드와 매개변수 구분이 된다면)

     매개변수명과 리턴타입은 전혀 상관이 없다
     오로지 매개변수타입의 갯수와 순서

    생성자도 메소드의 한 종류이기 때문에 오버로딩이 가능하다

     이름이 클래스랑 같아야하고
     반환형아 없어야함


     */

    public   MethodOverLoading(){} //void 들어간순간 메소드가됨
    public MethodOverLoading(int n1){}
    public MethodOverLoading(int n1,int n2){}
    public MethodOverLoading(long n1,int n2){}

    public void sum(int n1){}
    public void sum(int n1,int n2){}
    public void sum(long n1,int n2){}
    public void sum(String str,int n2){}
    public void sum(int n1,String str){}
    //public string sum(int n1,int n2){return "String"}//리턴타입으로는 구분이 되면 오버로딩이 가능
    //public void sum(int n1,int n2){}//매개변수명으로 구분 않음
}

class Test{
    public static void main(String[] args) {
        MethodOverLoading d= new MethodOverLoading(); //자개별생성자 생성 가능
    }
}