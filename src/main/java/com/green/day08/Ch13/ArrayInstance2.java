package com.green.day08.Ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {
        /*
        arr은 Box저장 개체값
        각 공간에 저장되는
         */

        //생성자는 클라스랑 이름이 같아야 하고 리턴타입이 없어야한다

        //Box b0,b1,b2,b3,b4;//b0 b1 b2 등등 각각 공간마다 박스 객체의 주소값만 담을 수 있다 memory address

        Box1[] arr= new Box1[5];//큰박스
        // 일단 박스 공간 5개 박스배열 개체주소값
        System.out.println(arr.length);

        Box1 b1 = new Box1("안녕");// 큰박스 안에 작은박스 기본생성자 추가해야함
        System.out.println(b1);
        System.out.println(b1.toString());

        arr[0]=b1;// 별개로 입력을 안함 즉 디폴트값인 "안녕" 이 콘솔에 입력됨
        arr[1]=new Box1("하세요.");//다 박스의 객체값
        arr[2]=new Box1("반갑습니다.");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

class  Box1 extends Object{
    private String conts;

    Box1(String conts){
        this.conts=conts;
    }
        //여기서 this.란 생성자 생성자는 클래스명과 같아야함 리턴타입이 없어야 한다
    /*
  public String toString(){// {}오버라이딩
       return conts;//찍혔으면 하는것
   }
   */

   public String toString(){// {}오버라이딩
       return "1";//찍혔으면 하는것
   }
}