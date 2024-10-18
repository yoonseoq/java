package com.green.day3.ch05;

public class _24InfinityLoop {
    public static void main(String[] args) {
        int n= 1;
        while (true){
            if(((n%6)==0)&&(n%14==0)){
                break;
            }
        //System.out.printf("n:%d\n",n);
            //여기있는경우 42전까지 수만 계속 출력하고 42가 뜨는순간 바로 out되어버림 41까지만 출력

            n++;
        System.out.printf("n:%d\n",n);//여기는 42가 나오고 break가 걸려도 그전에 n++이 있었어서 42까지 출력됨
        }
        System.out.printf("n:%d\n",n);//반복문 밖을 벗어났기에 42만 출력됨
    }
}
