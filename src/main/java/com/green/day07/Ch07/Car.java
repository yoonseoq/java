package com.green.day07.Ch07;

public class Car {
    private String color;
    private String gearType;//auto.nomal
    private int door;
/*
    this 사용법은 2가지
    1.this. :멤버필드, 멤버메소드 사용, this. 생략가능 할 때가 있다
    2.this()
 */
    public Car(String color, String gearType, int door){//3개를 받는 생성자
        this.color = color;//매게변수명이 멤버필드명과 달랐다면 this.를 생략가능
        this.gearType = gearType;
        this.door = door;

    }

    public Car(){//기존의 빈칸의 소개칸에 넣음
        this("white","auto",4);//생성자를 호출
    }


    public Car(String gearType,int door){//c4의 양식에 맞춘것
        this("white",gearType,door);//색깔은 일단 박제해놓고 나머지 기어타입이랑 문개수 대입

    }
    public void introduce(){
        /*
        this("dd","ddd".12)
        introduce메소드가 호출이 된다는 것은 이미 객체생성이 끝난것
        생성자는 객체 생성시에만 호출 할 수 있기에 객체생성 이후에는 호출 불가이다
         */
        System.out.printf("%s 컬러의 %s 기어의 %d개의 문짝이 있는 자동차\n",
                        color,gearType,door);
    }





}




class CarTest {


    public static void main(String[] args) {
        Car c1 = new Car();
        c1.introduce();
        Car c2 = new Car();
        c2.introduce();
        Car c3 = new Car("red","manual",5);//파라미터가 있는 생성자호출
        c3.introduce();
        Car c4 = new Car("auto",5);//2개의 값을 받는 생성자
        c4.introduce();


    }
}