package com.green.day06.ch09;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle c = new Circle(); //객체생성하면 circle이 변경시킴
        c.setRad(1.5);//써클아 반지름 설정좀 하자
        System.out.println("원의 넓이(1)"+c.getArea());//설정된 반지름 값으로 넓이좀 구해줘
        c.setRad(2.5);//써클아 반지름 설정좀 하자
        System.out.println("원의 넓이(2)"+c.getArea());//설정된 반지름 값으로 넓이좀 구해줘
        c.setRad(-3.3);//써클아 반지름 설정좀 하자
        System.out.println("원의 넓이(3)"+c.getArea());//설정된 반지름 값으로 넓이좀 구해줘
        c.rad=-3.3;//잘못된 값이 입력 될 수 있기에
        System.out.println("원의 넓이(4)"+c.getArea());//설정된 반지름 값으로 넓이좀 구해줘



    }
}
class Circle{
    double rad = 0;//원의 반지름
    final double PI = 3.14; //상수여서 변경안됨

    public void setRad(double r){ //음수값으로 변경 안되게 함
        if(r < 0){
            rad = 0 ;
            return;
        }
        rad = r;
    }

    public double getArea(){ //원의 넓이 값을 리턴
        return (rad * rad) * PI;
    }
}
