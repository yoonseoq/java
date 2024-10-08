package com.green.day2;

public class _999Mission2If {
    public static void main(String[] args) {


        int n=122;
        if(n>0){
            if((n%2)==0){
                System.out.printf("%d는 양수이면서 짝수이다\n",n);
            }
        }

        if((n>0)&&(n%2==0)){
            System.out.printf("%d는 양수이면서 짝수이다\n",n);
        }

        System.out.println("--End--");
    }
}
