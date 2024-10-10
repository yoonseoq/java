package com.green.day3.ch05;

public class _22BraekBasic {
    public static void main(String[] args) {
        int n=1;
        boolean search=false;

        while (n<100){
            System.out.println(n);
            if(((n%5)==0)&&((n%7)==0)){
                search= true;
                break;// true보면 바로 빠져나옴
            }
            n++;
        }
        if(search){
            System.out.printf("찾는 정수:%d\n",n);
        }else {
            System.out.println("못 찾음");
        }







    }






}
