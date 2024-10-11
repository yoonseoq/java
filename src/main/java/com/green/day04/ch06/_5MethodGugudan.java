package com.green.day04.ch06;

public class _5MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);

        gugudanFromTo(2,9);
        gugudanFromTo(1,9);



    }

    static void gugudan(int n){
        for (int i=1;i<=9;i++){
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
        System.out.println();
    }
    static void gugudanFromTo(int n1,int n2){
        for (int i=n1;i<=n2;i++){
//            for(int z=1;z<=9;z++) {
//                System.out.printf("%d x %d = %d\n",i,z,(i*z));
//            }
            gugudan(i);//이렇게 재탕하는 것도 중요함!
            System.out.println();
        }
    }



}
