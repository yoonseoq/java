

package com.green.day07.Ch07;

public class Car2 {
    private String color;      // 색상
    private String gearType;   // 기어 타입 (auto, manual)
    private int door;          // 문 개수

    /*
     * this 사용법은 2가지
     * 1. this. : 멤버 필드와 멤버 메서드를 사용할 때 사용, 생략 가능한 경우도 있음
     * 2. this() : 다른 생성자를 호출할 때 사용
     */

    public void introduce() {
        System.out.printf("%s 컬러의 %s 기어의 %d개의 문짝이 있는 자동차\n", color, gearType, door);
    }

    public Car2() { // 기본 생성자
        this("white", "auto", 4); // 파라미터가 있는 생성자를 호출하는 this()
    }

    public Car2(String color, String gearType, int door) { // 파라미터가 있는 생성자
        this.color = color; // 파라미터 이름과 멤버 필드 이름이 같으므로 this 사용
        this.gearType = gearType;
        this.door = door;
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.introduce(); // white 컬러의 auto 기어의 4개의 문짝이 있는 자동차 출력

        Car2 c2 = new Car2();
        c2.introduce(); // 동일한 출력 (기본 생성자 호출)

        Car2 c3 = new Car2("red", "manual", 5); // 파라미터가 있는 생성자 호출
        c3.introduce(); // red 컬러의 manual 기어의 5개의 문짝이 있는 자동차 출력
    }
}
