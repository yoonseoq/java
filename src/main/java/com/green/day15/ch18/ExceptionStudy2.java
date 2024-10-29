package com.green.day15.ch18;

public class ExceptionStudy2 {
    /*
    메소드 호출하는 코드를 작성을 했는대 뻘건쥴이고 마우스를 올려서 메세지를 확인해보니
    Unhandled Exception 이라는 내용이 보이면 해당메소드는 예외를 던지고 던지기 때문에
    호출하는 부분에서 try-catch 로 해결을 해야 한다.(호출부분을 감싸줘야 한)
     */
    public static void main(String[] args) {
        int r= 0;//빨간줄 왜뜸
        try {
            r = div(10,2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //메소드 내용을 바꿀 수 업으면 여기ㅓㅅ try-catch 문을 써야함
        System.out.println("r:"+r);
    }

    public static int div(int n1,int n2)throws Exception {
        //수학적 에러가생기면 호출한곳으로 예외를 던짐
        //예외 던지면 누군가는 해결해야함
        return n1/n2;
    }
/*
    public static int div(int n1,int n2)throws ArithmeticException {
        try {

        return n1/n2;
        }catch (ArithmeticException e){
            return 0;
        }
    }
 */
}
