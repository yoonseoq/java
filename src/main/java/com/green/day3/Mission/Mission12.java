package com.green.day3.Mission;

public class Mission12 {
    public static void main(String[] args) {

        int n=0;
        int sum=0;

        while (true){//무한반복식인데 대신 중간에 break 를 해야한다

            n++;

            if(n%2==1){
                sum+=n;
                if(sum>1000){
                    break;
                }
            }


        }
        System.out.println(n+","+sum);










    }
}
