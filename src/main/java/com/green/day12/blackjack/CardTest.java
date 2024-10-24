package com.green.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //카드덱타입의 변수선언과 동시에 초기화.카드덱 객체 주소값만 넣을 수 있다
        System.out.println(cd.getDenomination(11));
        Card c = cd.draw();//카드덱클라스 안에 객체주소값 담겨 있는것
        //카드객체 주소값도 되어야함 스테틱이냐 아니냐. 객체화되엇지 때문에 아님
        //카드값을 줄때마다 지움
        cd.checkCard();
    }
    //전부 빈 문자열이지만 다 다른객체
}

/*
52개의카드 주소값이 만들어짐. 주소복사하묜 얕은복사가 되어서  draw할때마다 내 주소값에서 지워하함
몇번쨰가드 줘야하느느걸 알고 처리,
 그냥 for문을 돌면서 null체크하고 null아닌거 찾아서 줘버리고 null처리
 일일이 뒤저서
 */
class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.recieveCard(c1);
        gamer.recieveCard(cd.draw());
        gamer.recieveCard(cd.draw());
        System.out.println("---------------");
        gamer.showYourCards();

        List<Card> list = gamer.openCard();
    }

}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.recieveCard(cd.draw());
        dealer.recieveCard(cd.draw());
        dealer.recieveCard(cd.draw());
        dealer.showYourCards();
    }
}