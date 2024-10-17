package com.green.day2.ch04;

public class _5OverFlow {
    public static void main(String[] args) {
        /*
        5리터컵에 5리터 이상의 물을 넣으면 넘침 이게 오버플로우
        용량이 100인곳에 101이상을 저장하면 오버플로우 현상이 나타남 >> 컴퓨터에서는 넘친양만큼 남음

        byte:-128~127 범위의 값을 저장할 수 있다
         */

        byte var1=127;
        System.out.printf("var1:%d\n",var1);
        byte var2=(byte)129;
        System.out.printf("var2:%d\n",var2);//1만큼 넘쳐서 그만큼 돌아서 -128로됨



    }
}
