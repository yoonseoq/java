package com.green.day11.Ch16;

//다양성
public class PolyStudy {
    /*

    다양성을 이해할때 멤벞필드도 이해해야하나?
    은닉화로 직접사용 하지 않기때문에 멤버메소드가 어떻게 동작하는지 이해하면 된다
    고로 아래 세가지ㅏㅁㄴ 이해필

    1.부모타입 변수는  자식객체 주솟값 저장 할 수 있다.
    2.자식타입의 변수는 부모객체 주소값 저장 할 수 안됨

    쌉중요 3. 타입은 호출할 수 있나업ㅅ나(아는 메소드만 호출가능,모르는 메소드는 호출불가)를 구분하고
    호출이 된다묜 객체기준(우리가 원래 알던대로 동작)
    안다 모른다 구분은 해당 메소드를 가지냐 마냐로 구분(상속받은 메소드도 알고 있는메소드)

    레퍼런스 변수끼리의 혀ㅇ뱐환이가느ㅡㅇ한데 상속관계에사민 가능
    부모자식간 형변환 가능 하지만 형제끼리는 안댐
     */

    public static void main(String[] args) {
        Cat cat = new Cat();
        /*
        다른경우
        Animal ani3 = new BullDog();
        왼쪽이 부모타입일 경우 자식의 객체주소값 받을 수 있음

        BullDog b= new Dog();
        b.jump();
         불독은 점프메소드를 가지고 있는데 도그는 가지고 있지 않기 때문에
         호출이 된다며ㄴ 에러가 터지기에
         자바는 애초에 자식타입이 부모객체 주솟값을 담지않도록 함

         ???자식은 메소드가 부모보다 더 늘어날 수 잇찌만 줄어 들 수 없기때문

         강제저장시 런타임 에러뜸


         */


        cat.crying();
        System.out.println("-----------------");
        Animal ani=new Animal();
        Animal ani1 = new Cat();
        //ani 동물을 상복받은 애들이면 안에 내용이 달라도 자식객체한테 부모 메소드 호출가능
        Animal ani2 = new Dog();
        Animal ani3 = new BullDog();
        Animal ani4 = new Bird();
        Dog dog1 = new BullDog();

        /*
        2번검증
        나보다 상위에 있는 객체값 못받음
            BullDog bulldog1= new Dog//쌉불가
            BullDog bulldog2= (Bulldog)ani2;
            ani2에는 dog객체 주소값이 저장되어 있음
            자식타입은 Bulldog에

         */
        //3번검증
        //ani3.jump();
        //ani3 에는 불독객체 주소값이 저장되어 있으나
        //애니멀은 점프 메소드를 모르기 때문에(존재하지 않으므로) 호출못함
        //불독타입으로 객체선언
        //아니면 부모타입에다 점프를 만들어줌
        BullDog bullDog3=(BullDog) dog1;
        BullDog bullDog4=(BullDog) ani3;
        bullDog4.jump();
        System.out.println("-------------------");
        ani3.crying();
        bullDog4.crying();
        ((BullDog) ani3).jump();//명시적 형변환 시킴

        //instanceof:형변환 가능하면 true 불가능하묜 false
        /*
        System.out.println(ani3 instanceof Dog);
                           객체주솟값ㄱ     타입(Class)
         */
        //가능이란 타입과 동일한 객체이거나 자식객체
        //불가능: 가능의 반대

        System.out.println(ani3 instanceof Dog);
        System.out.println(ani3 instanceof BullDog);
        System.out.println(ani4 instanceof BullDog);
        System.out.println(ani4 instanceof Bird);

        Cat cat2= new Cat();
        Dog dog2 = new Dog();
        BullDog bulldog=new BullDog();
        Bird bird = new Bird();

        //동물을 울려주세요
        animalCrying(cat2);
        animalCrying(dog2);
        animalCrying(bulldog);
        animalCrying(bird);



    }
     static void animalCrying(Animal ani){
        ani.crying();

         if(ani instanceof BullDog){

        BullDog bd=(BullDog)ani;
         bd.jump();
         }

        //부모타입이여서 자식객체값 받을 수 있고 오버라이딩 된 메소드를 호출
        //동물객체.메소드 야 동물 울수있어? 다형성 만세
    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다");
    }
    /*
    void jump() {
        System.out.println("동물이 점프");
    }

     */

}

class Cat extends Animal {
    @Override//부모의 메소드를 똑같이 재정의한다
    void crying() {
        System.out.println("애옹애옹");
    }


}

class Dog extends Animal {
    @Override//부모의 메소드를 똑같이 재정의한다
    void crying() {
        System.out.println("댕댕");
    }


}

class BullDog extends Dog {
    //불독이 도그를 상속받으면 애니멀도 간접상속으로 크라잉 가지고 있음
    //부모의 메소드를 똑같이 재정의한다
    void crying() {
        System.out.println("멍");

    }
    //@Override
    void jump() {
        System.out.println("불독이 점프");
    }

}

class Bird extends Animal {
    //부모의 메소드를 똑같이 재정의한다
    void crying() {
        System.out.println("끼룩끼룩");
    }
}