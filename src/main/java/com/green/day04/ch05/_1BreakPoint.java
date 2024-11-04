package com.green.day04.ch05;

public class _1BreakPoint {
    public static void main(String[] args) {

        for(int i=1;i<10;i++){
            for(int z=1;z<10;z++){
                if((i*z)==72){
                    System.out.printf("%d x %d = %d\n",i,z,(i*z));
                    break;//브레이크가 전체 For문을 멈추게 하려는 것
                }
            }
        }
        System.out.println("お終い");

        outer:for(int i=1;i<10;i++){
            for(int z=1;z<10;z++){
                if((i*z)==72){
                    System.out.printf("%d x %d = %d\n",i,z,(i*z));
                    break outer;//브레이크가 전체 For문을 멈추게 하려는 것
                }
            }
        }
        System.out.println("お終い");
    }
}
