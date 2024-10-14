package com.green.day05.ch06;

public class OnlyExitReturn {
    public static void main(String[] args) {
        divide(4,2);
        divide(6,2);
        divide(6,0);
        /*0으로 나누려고 시도하면 수학적 예외가 발생한다
        예외가 발생되지 않게끔 하는것을 예외처리라고 한다
        -예외가 발생되는 상황을 나오지 않게 한다
        -예외가 발생하는 상황을 try-catch로 해결
        */
    }
    static void divide(int n1,int n2){
        if(n2==0){
            return;
            /*void안의  return은 바로 메소드 종료시킴 에러방지
              메소드를 호출한 곳으로 다시 돌아가버림
             */
        }
        System.out.printf("나눗셈 결과:%d\n",(n1/n2));
    }
}
