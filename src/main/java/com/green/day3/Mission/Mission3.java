package com.green.day3.Mission;

public class Mission3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 중에서 2와7의배수를 모두 출력 후 다 더하기



         */
        int n=1;
        int sum=0;



        while (n<=1000){
            if((n%2==0)&&(n%7==0)) {
                System.out.println(n);
                sum+=(n++);
            }
            n++;


        }

        System.out.println("result:"+sum);



    }
}
