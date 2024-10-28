package com.green.day12.blackjack;

import com.green.day07.Ch10.SystemOutPrintln;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    /*
    카드 객체 주소값 여러개 저장 할 수 있어야 합니다
    ArrayList 사용할거
    멤버필드 선언 변수명은 카드
     */
    protected final List<Card> cards;//카드가 투 스트링되어서 배열로 나옴
    protected int point;
    public Gamer() {
        cards = new ArrayList();
    }


    public void receiveCard(Card c1) {
        //
        int point= switch (c1.getDenomination()){//받은카드값을 포인트로 전환해서 넣기
            case "A"->1;
            case "J","Q","K"->10;
            default -> Integer.parseInt(c1.getDenomination());//숫자만 들어가는 문자열을 정수로 바꾸고 싶을때
        };

        this.point+=point;//카드가 들어올때마다 점수가 계산이 되어서 포인트에 적립

        String str = "10";//"10"이라는 문자열 호출
        int Val= Integer.parseInt(str);//정수로 바꿈,var변수에 10이 증가한다.
        cards.add(c1);
    }

    public void showYourCards() {
       // CardDeck cd = new CardDeck();
        for (Card c : cards) {
            System.out.println(c);

        }
        System.out.println(cards);
    }

    public List<Card> openCard() {
        return cards;//가지고 있는 카드들을 외부값으로 줌
    }

    public int getPoint() {
        return point;
    }
}
