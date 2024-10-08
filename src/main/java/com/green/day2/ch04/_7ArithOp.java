package com.green.day2.ch04;

public class _7ArithOp {
    public static void main(String[] args) {
        int n1=7;
        int n2=3;

        System.out.printf("%d+%d=%d\n",n1,n2,(n1+n2));
        System.out.printf("%d-%d=%d\n",n1,n2,(n1-n2));
        System.out.printf("%d*%d=%d\n",n1,n2,(n1*n2));
        System.out.printf("%d/%d=%d\n",n1,n2,(n1/n2));
        System.out.printf("%d %% %d=%d\n",n1,n2,(n1%n2));
        /*
            %%2개 쓴 이유는 prointf 라서
            %:mod 홀짝이나 배수 구할때도 사용
            2로 나눌때 0이면 짝수 1남으면 홀수
            5로 나눌때 0이면 5의배수 맞음
        */


    }
}
