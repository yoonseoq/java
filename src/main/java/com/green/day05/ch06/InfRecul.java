package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi~~!");
        if(cnt==1){//숫자가 특정값이 되면 종료됨
            return;
        }
        //showHi(cnt--); 안됨 이건
        //(--cnt);
        //showHi(cnt-1);//이거 굳이 안해도됨ㅋ
    }
}
//shoe Hi 3 >> Hi
// -1하고 다시호출 >2> Hi
//-1>>호출 Hi>> 1이되어버림 1이 되는순간 종료!
