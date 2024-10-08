package com.green.day2.ch05;

public class _15IEBasic {
    public static void main(String[] args) {
        int n1=5,n2=7;
        /*
        if문 분기문>> 갈림길을 만들 수 있다
        상황에 따라 적절히 실행되었으면 할 때

         */

        if(n1<n2){//if (true)가 되었을 때만 중괄호 코드들이 실행됨
            System.out.printf("%d<%d is %b\n",n1,n2,(n1<n2));//boolean
        }

        if(n1>n2){//if (false)가 되었을 때는 코드들이 실행 안댐
            System.out.printf("%d<%d is %b\n",n1,n2,(n1>n2));//boolean
        }

        System.out.println("--------------------");

        //if-else 문은 둘중 하나만 실행이 된다
        //if(true) if(){}안의 내용이 실행됨
        //else(false)일 경우 else(){}안의 내용이 실행됨

        if(n1==n2){
            System.out.printf("%d==%d is true\n",n1,n2);//boolean
        }else{
            System.out.printf("%d==%d is false\n",n1,n2);//boolean
        }


    }
}
