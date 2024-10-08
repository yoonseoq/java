package com.green.day2.ch04;

public class _12LogicalOp {
    public static void main(String[] args) {
        /*
            논리연산자:&&,||,!
         */
        int n1=11,n2=22;
        boolean result;

        result=(1<n1)&&(n1<100);//true,(1~100)1초과 100미만인지
        System.out.printf("%d은 1초과 100미만인가? %b\n",n1, result);

        result=((n2%2)==0)||((n2%3)==0);//true 일 가능성이 있는것을 앞쪽에 배치하는 것이 좋다
        System.out.printf("%d는 2 또는 3의 배수인가? %b\n",n2, result);

        result=!(n1!=0);//반대의반대=사실
        System.out.println(result);
        System.out.printf("%d는 0인가? %b\n",n1, result);
        System.out.printf("%d는 0인가? %b\n",n1, n1==0);


    }
}
