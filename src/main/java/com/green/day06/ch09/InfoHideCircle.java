package com.green.day06.ch09;



public class InfoHideCircle {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.setRad(1.5);
        System.out.println("원의넓이"+c.getArea());

        //c.rad=-3.3;//rad 멤버필드에 접근이 되지 않는다.(읽고 쓰기 불가능)
        c.setRad(-3.3);
        System.out.println(c.getArea());
        System.out.println(c.PI);
    }
}

class Circle2{
    private double rad = 0; //접근 수준 지시자. 프라이빗이 붙으면 내부의 클라스외 외부 스코프에서 접근불가
    final double PI = 3.14;
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
