package com.green.day15.ch18;

public class ExceptionCase2 {
    /*
    try-catch문(예외처리)
    try 문에 에러가 날 가능성이 있는 코드를 위치한다
    만약에 예외가 발생이 된다면 catch부분이 실행이 된다.
    예외가 발생되지 않는다면 catch부분이 실행되지 않는다
    if문과 유사
     */
    public static void main(String[] args) {
        int n1 =10;
        int n2 =2;
        //0으로 나누는것 자체가 에러여서 예외처리 해야함
        try {//만약 예외처리 안되면 이게 실행됨
        System.out.printf("%d/%d=%d\n",n1,n2,(n1/n2));
        }catch (ArithmeticException e){//이 수학적예외가 발생될때만 작동한다

            e.printStackTrace();//try+catch문이 없으묜 콘솔에서 봤을내용 보여줌
            System.out.println(e.getMessage());//왜 에러가 발생했는지 원인 알려줌

        }
        System.out.println("お終い");
    }
}
