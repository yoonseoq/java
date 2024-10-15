package com.green.day06.ch09;

public class GettersSettersExam {
    public static void main(String[] args) {

        Student s1 = new Student();//s1객체
        s1.setName("홍길동");
        //s1.name="홍길동";

        Student s2 = new Student();//s2객체
        s2.setName("신사임당");
        //s2.name="신사임당";

        System.out.println(s1.getName());

    }
}

class Student{
    private String name;//멤버필드들  name age height
    private int age;
    private float height;

    //this. 는 상수이고 나 자신의 주소값이 저장된 공간
    //name-setter

    public void setName(String name){
        this.name = name;// 호출이 끝나고 ㅁ나면 죽어버림





    }
    //name-getter

    public String getName(){//파라미터 필요없
        return name;//저장된 값을 돌려준다
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight(){
        return height;
    }
}//오늘내용 정리하자면