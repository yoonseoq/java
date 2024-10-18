package com.green.day09.Ch13;

public class VariableArgument {
    //가변인수 가변인자
    public static void main(String[] args) {
        sum(10,22);//3
        /*
        메소드 호출 아규먼트에 정수값 2개 보내고 있음
        void 메소드 혼자있음
        클래스 메소드 VS 인스턴스 메소드: 객체생성 부분이 없기 때문에 클래스 메소드
         */
        sum(10,22,333);
        sumVar(1);//[1]
        sumVar(1,2);//[1,2]
        sumVar(1,2,3);//[1,2,3]
        sumVar(1,2,3,4);

        //같은 타입의 값을 무한대로 받을 수 있는것을 가변인자 라고 한다
    }
    static void sumVar(int... values){
        int sum1=0;
        /*
            아까 for(int i=0;i<=values.length;i++) 를 입력해서 오류가 났다
            i<=values.length길이체크 중요함
         */
        for(int i=0;i<values.length;i++){
            sum1 += values[i];
            //values 자체가 배열이 된다.

        }
        System.out.println(sum1);

    }

    static void sum(int n1,int n2){
        //System.out.println(n1+n2);
        sum(n1,n2,0);//오버로딩도 가능
    }
    static void sum(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
}

