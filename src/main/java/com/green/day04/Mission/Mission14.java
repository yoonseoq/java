package com.green.day04.Mission;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        System.out.println("star:"+star);
        int i;
        int j;
        int k;
//star-5
        for(i=0;i<star;i++){//01234
            for (j=1;j<star-i;j++){//5-i=5 i=0인 가정하에 j는 5임 근데 j가 다 점령하면 안됨 01234
                //그래서 j=1그리고 j<5 이면 j는 1234 까지됨 즉 4번 반복
                System.out.print("_");
            }
            for(k=0;k<=star-j;k++){//그리고 j가 5이면 k는 0이다 근데 k=0으로 시작하고 k<=0인 조건이면
                // *는 적어도 한번은 발동되어야 한다 최댓값 K<=5인경우 012345
                System.out.print("*");

            }
            System.out.println();
        }



    }

}
