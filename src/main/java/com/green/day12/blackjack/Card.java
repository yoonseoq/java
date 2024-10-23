package com.green.day12.blackjack;

public class Card {
    //멤버필드 2개/다이
    private final String pattern;//무늬
    private final String denomination;//A,2~10,J Q K

    //프라이빗 넣는거 setter메소드, 생성자
    //값 빼내는거 getter메소드
    Card(final String pattern,final String denomination){
        //상수 붙이면 속도가 빠름,원본수정도 안됨
        this.pattern=pattern;
        this.denomination=denomination;

    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
    }

}
