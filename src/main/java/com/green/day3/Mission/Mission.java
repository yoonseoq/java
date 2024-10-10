package com.green.day3.Mission;

public class Mission {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        /*
            while문을 활용하여 1-99까지의 합 구하기
            1.1에서99까지의 값을 구해야함
            2.만든값을 중첩해서 저장해야함

         */
        while (n<100){
            sum+=(n++);//sum=sum+n 복합식 사용하면 됨
            //n++;//여기에 sout가 들어가는 순간 출력이 무한루프
        }
            System.out.println("result:"+sum);
    }
}
