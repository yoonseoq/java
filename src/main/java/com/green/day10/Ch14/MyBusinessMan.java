package com.green.day10.Ch14;
//상속이 어떻게 동작하는지
public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1= new BusinessMan("YOON","Hybrid ELD","Staff Eng.");
        System.out.println(man1.getName());//이름이 잘 입력 되었는지 확인
        /*
        빨간줄뜨는 이유는 기본생성자가 없어서
        해결방법

         */
        man1.tellYourSelf();
        //BusinessMan클래스에는 tellYourself메소드가 없지만 호출할수 있다
        //Man 클래스로부터 상속받았기 때문이다

        System.out.println(man1.toString());
        //같은 이유로 Object 클래스로부터 상속받았기 때문에 toString을 호출가능
        man1.jump();
        man1.whatIsDoing();
        //man1.super.jump(); 외부에서
    }
}
class Man{
    /*
    상속키워드랑 생략하면 extends Object가 자동으로 붙는다. 모든클래스의 최상위 부모이다
    */
    private String name;

    public Man(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void tellYourSelf(){
        System.out.printf("제이름은 %s입니다.\n",name);
    }

    public void jump() {
        System.out.printf("%s가 점프\n",name);
    }
}
class BusinessMan extends Man{//상속받고 싶은 클래스옆에 extend만듬
    private String company;
    private String position;

    public BusinessMan(String name,String company,String position){
        super(name);
        /*
        super소괄호를 생략하묜 자동으로 super();이 내용이 추가됨
        super소괄호를 생성자의 가장 위에 작성이 되어야 한다(주의!)

        왜 빨간줄 뜰까요 Man이라는 기본생성자가 없어서

        해결법.
         1.부모에게 기본 생성자를 만들어준다,
         2.있는생성자 호출 (수동으로 작성)

        this. 멤버필드(전역변수)멤버메소드 부를때
        this() 생성자 호출
        */

        this.company=company;
        this.position=position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }
    //오버라이딩:부모가 가진 메소드를 사용하는것이 아니라 내가 재정의한 메소들 사용하는 기법
    public void jump() {
        super.jump();//super.을 생략하묜 나자신을 재귀호출하기에 무한루프가 된다
        System.out.printf("%s에 다니는%s가 점프\n",company,getName());
        //name 은 프라이빗이기 때문에 바로접근불가
        //public 으로부터 상속받은 getName 메소드를 호출하여 이ㅇ름값을 얻는다
    }

    public void whatIsDoing(){

        jump();
        super.jump();//부모가 가진 메소드를 호출하고 싶으면 super. 을 사용하면 된다
    }
}
