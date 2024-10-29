package com.green.day15.ch21;

    //제네릭이 없던 시절의
public class FruitAndBox {
    public static void main(String[] args) {
       // Apple ap=new Apple();
        //Orange org=new Orange();
        AppleBox appleBox=new AppleBox(new Apple());
        //왜 빨간줄? 기본생성자가 아니기에
        // 그래서 과일기본생성자를 소환
        appleBox.getAp();
        System.out.println(appleBox.getAp());
        OrangeBoX orangeBoX=new OrangeBoX(new Orange());
        orangeBoX.getOrange();
        System.out.println(orangeBoX.getOrange());
    }
}

//Object 클라스를 오버라이딩
//String 클라스를 오버라이딩 클라스를 오버라이딩 할 순 없죠
//toString 메소드를 오버라이딩

class Apple{
    public String toString(){
        return "アップル";
    }
}
class Orange{
    public String toString(){
        return "オレンジ";
    }
}
class AppleBox{
    //사과 하나ㅏ만 저장
    private Apple ap;//외부에다 들어온 객체를 생성자에 넣어야 한다
    //프라이빗한 멤버필드에 값넣는방법
    //1.생성자+this.,2.세터

    //생성자 통해서 값 넣어야한다.
    AppleBox(Apple apple){
     this.ap=apple;
    }
    //메소드를 통해 ap값을 외부로 리턴할 수 있다.
     Apple getAp(){
        return ap;
    }
}
class OrangeBoX{
    private Orange orange;

    OrangeBoX(Orange orange){
        this.orange=orange;
    }
    Orange getOrange(){
        return orange;
    }
}