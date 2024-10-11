package com.green.day04.ch06;

public class _4MethodRelationalOp {
    public static void main(String[] args) {
        int n1=22, n2=22;
        biggerNumber(n1,n2);//더 큰 값은 22입니다  void메소드
        biggerNumber(30,100);

        if(isEquals(n1,n2)){
            System.out.printf("%d와 %d의 값은 같습니다\n",n1,n2);//무적권 return 때려야함 가정법이 들어간 순간 boolean 이다
        }
        System.out.println("お終い");


    }

    static void biggerNumber(int n1,int n2){
        System.out.printf("더 큰 값은 %d입니다\n",(n1>n2?n1:n2));
    }
    static boolean isEquals(int n1,int n2){
        return n1==n2;
    }





}
