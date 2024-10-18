package com.green.day09.selsp;

public class whlieSum {
    public static void main(String[] args) {
        int n=1;
        int sum=0;

        System.out.println(sum);
        //첨에 더해지면 1

        while (n<5){
            sum+=n++;//(n은 후위연산댐)
        /*
        0+1
        1+2
        3+3
        6+4 그러고 나서 n이 5가된 순간 와일문에서 막힘
         */

        }

        System.out.println(sum);
    }
}
