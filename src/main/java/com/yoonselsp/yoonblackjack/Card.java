package com.yoonselsp.yoonblackjack;

public class Card {
    /*
    카드에 대한 멤버필드는 두개이다. 고정값인 패턴과 숫자.
     */
    private final String pattern;//무늬
    private final String denomination;//무늬
    /*
    프라이빗 값을 넣을 떄 setter메소드나 생성자ㄹ,ㄹ 사용
    값을 빼낼떄는 getter메소드를 사용한다
     */
    Card(final String pattern,final String denomination){
        this.pattern=pattern;
        this.denomination=denomination;
    }

    public String getPattern(){
        return pattern;
    }
    public String getDenomination(){
        return denomination;
    }
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
        //카드 출력할때 문양(숫자) 형식으로 함
    }

}
