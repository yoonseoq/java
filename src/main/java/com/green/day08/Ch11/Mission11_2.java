package com.green.day08.Ch11;

public class Mission11_2 {
    public static void main(String[] args) {
        /*
        다음 주민등록번호
         */

        StringBuilder sb = new StringBuilder("990925-1012099");//스트링빌더  객체화하고 불러오기
        int dashIdx = sb.indexOf("-");
        System.out.println(dashIdx);
        sb.replace(dashIdx,dashIdx+1," ");
        System.out.println(sb);//여기까지 쌤 방법
        //System.out.println(sb);
        String str= sb.toString();//스트링 빌더를 스트링 형식으로 바꾸기
        String strResult = str.replace("-"," ");//스트링의 내부"-"를 " "로 바꾸기
        System.out.println(strResult);


    }
}
