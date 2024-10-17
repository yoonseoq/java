package com.greenonline.assign;

import java.util.Scanner;

public class GetAAverageProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
        System.out.println("정수를 입력하세요.");
        int integer=scan.nextInt();

        if(integer==0){
            break;
        }

        sum += integer;
        count++;

        }

        if(count>0){
            /*
            카운트가 되어야 평균을 구할 수 있으므로 만약 이 if문을 사용하지 않는다면

             */
            double average = (double) sum/count;
            System.out.printf("합계는 %d입니다. 평균은 %.1f입니다.",sum,average);
        }

        //카운트가 되어야 평균을 구할 수 있으므로
        double average = (double) sum/count;
        System.out.printf("합계는 %d입니다. 평균은 %.1f입니다.",sum,average);












    }
}
