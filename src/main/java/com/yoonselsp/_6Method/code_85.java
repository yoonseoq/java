package com.yoonselsp._6Method;

import java.util.Scanner;

public class code_85 {
    public static void main(String[] args) {

        Scanner scin = new Scanner(System.in);
        System.out.print("Enter two integers :");
        int a=scin.nextInt();//scin 참조변수
        int b=scin.nextInt();
        int c=add(a,b);
        System.out.println(a+"+"+b+"="+c);
        scin.close();


    }

    static int add(int x,int y){
        int result;
        result = x+y;
        return result;//void가 없으면 항상return 해야함
    }
}
