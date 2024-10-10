package com.green.day3.Mission;

public class Mission11 {
    public static void main(String[] args) {
        int star= (int)(Math.random()*6.0)+3;
        System.out.println(star);

        for(int i=1;i<=star;i++){//행을 반복하는 횟수
            for(int j=1;j<=star;j++){//열수 가로줄
                System.out.print("*"); //i*J번 실행
            }
                System.out.println();//j번 찍고 개행 을 i번 반복

        }
        System.out.println("-------------------------");

        int l=star*star;//4*4
        for (int i=1;i<=l;i++){
            System.out.print("*");
            if(i%star==0){        // star로 i가 나눠떨어지면 개행개시
                System.out.println();
            }
        }






    }
}
