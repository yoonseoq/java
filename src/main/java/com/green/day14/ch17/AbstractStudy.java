package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*
    class 키워드 앞에ㅔ abstract 키워들 ㄹ붙이면 추상클래스가 된다.
    추상클래스가 되면 객체화 불가능. 오로자ㅣ 부모역할만 한다(단독으로 의미가 없더)
   그래서 추상클래스를 상속받는 클래스가 있기마련

   class 앞에 abstract
  를 붙이는ㄴ ㄱ것으 ㄴ선택사항이나 만약 추상메소들 가진다면 선택이 아니라 필수

     클래스간의 공통적인 부분을 부모에 작성을 해서 상속받도록 하기 위한 것
     그리고 추상메소드를 구현해야 하는 강제성이 존재한다.
     추상메소드 구현은  implements, 구현한다고 표현(구현부를 만드는 행위)



     추상메소드 정의 (선언부만 있고 구현부가 없는 메소드)
     그리고 abstract 키워드를 붙인다
     */

    public abstract void sum();

    //추상클래스도 구현부가 있는 메소드 가짐
    public void multiply(int n1,int n2){
        System.out.println(n1*n2);
    }
}

abstract class ImplementsStudy2 extends AbstractStudy{

}//빨간줄 추상메소드를 구현 또는 오버라이딩 안해



 class ImplementsStudy extends AbstractStudy{
    //꼭 부모의 추상메소드를 구현해야한다
    @Override//메소드 재탕하려면 쓰는게 좋음
     public void sum(){
        //분명히 내용이 있을 것이다.
        System.out.println("숫자더했다");
    }
 }

 class  AbstractStudyTest{
     public static void main(String[] args) {
         //AbstractStudy as = new AbstractStudy();// 추상클래스여서 객체화 불가능
         AbstractStudy as2 = new ImplementsStudy();// 추상클래스여서 객체화 불가능
        as2.sum();//AbstractStudy는 sum메소드를 알고 있어서 고로 호출이 가능하다
     }
 }