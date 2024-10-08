package com.green.day2.ch04;

public class _11RelationalOp {
    public static void main(String[] args) {
        /*
            관계연산자 (비교연산자) >>결과타입은 boolean(True/False)
         */
        int n1=3,n2=2,n3=7;
        double n5=7.0f;//리터럴 실수는 더블타입이기 때문에 float타입의 실수를 사용하고 싶으면 끝에 f,F를 붙여주어야 한다.

        double n6=7.0;
        //리터럴 실수 뒤에 d,D를 붙여도 노상관
        /*
            float n4=7.0d;
            float n7=n5;
            n4,n7은 자동형변환은 되지 않지만 강제(명시적)형변환은 일어난다




         */
        System.out.printf("%d>=%d:%b\n",n1,n2,(n1>=n2));
        System.out.printf("%d<=%d:%b\n",n1,n2,(n1<=n2));
        System.out.printf("%f<=%d:%b\n",n5,n3,(n5==n3));
        System.out.printf("%f!=%d:%b\n",n5,n3,(n5!=n3));//서로 틀려야 true 가 됨









    }
}
