package com.green.day2.ch04;

public class _13SCE {
    public static void main(String[] args) {

        /*
            %%연산자는 flase확률이 높은 연산자를 왼쪽에 배치 하는게 유리
            ||연산자는 true확률이 높은 연산자를 왼쪽에 배치 하는게 유리
         */
        int n1=0,n2=0;
        boolean result;
        result=((n1+=10)<0)&&((n2+=10)>0);// 왼쪽항이 false가 먼저 판정나면 오른쪽항은 연산조차 안함. false 리턴
        System.out.println("result: "+result);
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

        //n1<0:false이기 때문에 실행되지 X

        int n3=0,n4=0;
        result=((n3+=10)>0)||((n4+=10)>0);//true
        System.out.println("result: "+result);
        System.out.println("n3: "+n3);
        System.out.println("n4: "+n4);
        // . ||도 마찬가지 왼쪽항이 true가 먼저 판정나면 오른쪽항은 연산조차 안함. true 리턴

    }
}
