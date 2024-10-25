package com.green.day14.ch17;

/*
    인터페이스(Imterface):이질적인 플랫폼 간에 통신을 할 수 있는 역할을해주는 것을 인터페이스라고 한다_
    사람이 컴퓨터를 다룰때 키보드 마우스 사용
    게임화면애서 나오는 버튼이랑 hp,mp 라고 보이는 부분을 인터페이스라고 한다

    자바의 인터페이스: 추상 메소드와 스태틱 멤버필드만 가질 수 있는 존제
    , 인터페이스의 이름은 보통 형용사이다(~~을 할 수 있는).

 */
public class PrintableInterface {
    public static void main(String[] args) {
        //Printable p1=new Printable();
        Printable p2=new PrintableImpl();//부모타입은 자식객체 메소드받을 수 있다
        p2.print("dddd");
        System.out.println(p2.NUM);
        System.out.println(Printable.NUM);
        //Printable.NUM=10;
    }
}
//인터페이스를 만들면 생략하면 무조건 들어가는 키워드 있다,
/*
interface Printable {
  public static int num = 0;//멈버필드 앞에선 public static이 무조건 추가
  public abstract void print(String doc);//메섣,앞에선 public abstract 무적권 추가


    void print(String doc);
}
 */
interface Printable {
    int NUM = 10;
    void print(String doc);//이거때문에 인터페이스 쓴다.
}
class PrintableImpl implements Printable{
    @Override
    public void print(String doc) {
        System.out.println(doc);
        System.out.println(NUM);
    }//인터페이스를 구분한것을 안다. 빨간줄 뜨면 마우스 갖다대서 구현시킴

}