package com.green.day09.selsp;

public class continue_1 {
    public static void main(String[] args) {
        int n=0;
        int count= 0;

        while((n++)<100){
            if(((n%5)==0)&&((n%7)==0)){
                count++;//개수 나오면 후위연산으로 더해버리기
                System.out.println("n:"+n);//그리고 해당숫자 출력
            }
        }
        System.out.println("count:"+count);//카운트도 출력

    }
}
