package com.green.day08.Ch11;

public class BuildString {
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb= new StringBuilder("123");
        //반복문에서 문자열 합치는 상황이 오면
        sb.append(45678);//이어붙이기

        System.out.println(sb);

        //sb.delete(0,2);//0번째부터 2번째 바로 앞에까지
        System.out.println(sb);
        //모든 문자열 지워버리기
        sb.lastIndexOf("");
        System.out.println(sb.lastIndexOf(""));
        //sb.delete(0,sb.length());
        sb.delete(0,sb.lastIndexOf(""));//되기는 하지만 비추
        System.out.println("sb:"+sb);

        sb.append(345678);
        System.out.println("sb:"+sb);
        //lastIndexOf는 확정된 문자열인 경우

        sb.replace(0,3,"AB");
        String str = sb.toString();//StringBuilder에서 String타입으로 변경

        System.out.println("sb:"+sb);//3번째 바로직전 012까지만 교체하기
        System.out.println("str:"+str);

        StringBuilder sb2 = sb.reverse().replace(0,2,"kk");
        System.out.println("sb:"+sb);
        sb.reverse();
        sb.replace(0,2,"l");
        //체이닝 기법, return this;가 핵심이다
        // 리버스하고 특정한 자릿값을 kk로 대체"."을 적을 수 있는것은 리턴이 가능하다는 의미

        System.out.println("sb:"+sb);
        System.out.println("sb==sb2:"+(sb==sb2));
    }
}
