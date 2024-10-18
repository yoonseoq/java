package com.green.day09.selsp;

public class continue_2 {
    public static void main(String[] args) {
        int n = 0;

        while ((n++)<100){
            if(((n%5)==0)&&((n%7)==0)){
                continue;//5와7의 공통배수가 나오면 무시하고 패스해버리기
                 }
            System.out.println("n:"+n);
        }
    }
}
