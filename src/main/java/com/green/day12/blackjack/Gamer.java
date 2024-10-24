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
    private final List<Card> cards;//카드가 투 스트링되어서 배열로 나옴
    private int point;
    public Gamer() {
        cards = new ArrayList();
    }


    public void recieveCard(Card c1) {
        //
        int point= switch (c1.getDenomination()){//받은카드값을 포인트로 전환해서 넣기
            case "A"->1;
            case "j","Q","K"->1;
            default -> Integer.parseInt(c1.getDenomination());
        };

        String str = "10";
        int Val= Integer.parseInt(str);//var변수에 10이 증가한다.
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


}
