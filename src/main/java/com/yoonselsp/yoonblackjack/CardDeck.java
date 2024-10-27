package com.yoonselsp.yoonblackjack;

public class CardDeck {
    //Card의 객체주소값 52개를 저장 할 수 있어야 한다.
    private final Card[] cards;//카드 객체 주소값
    private final String[] patterns;

    private int selectedIdx=0;
    //외부에 줘야 할 카드 인덱스 값이다. 카드가 빠져나가묜 null이 된다

    public CardDeck(){
        cards = new Card[52];//카드배열은 52개의 인덱스가 있다
        patterns = new String[]{"Diamond","Heart","Spade","Clubs"};

        int idx=0;//인덱스값
        for (int i = 0; i < patterns.length; i++) {//일단 무늬방 4개에 각가의 방에 13개의 숫자가 있다
            String pattern=patterns[i];
            for (int j = 1; j <= 13; j++) {//1~13까지 숫자
                String denomination=getDenomination(j);//getDenomination 메소드 호출
                cards[idx++]=new Card(pattern,denomination);
            }
        }
        shuffle();//배열이 다 되었으면 한번 섞어보자
    }
    //자 이제 덱을 섞어보자
    private void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rIdx=(int)(Math.random()*cards.length);//랜덤인덱스
            Card tmp=cards[i];//해당 인덱스의 값을 임의의 카드타입의 배열  tmp로 옮긴다.
            cards[i]=cards[rIdx];//랜덤 인덱스 값을 해당 인덱스에 넣어준다
            cards[rIdx]=tmp;


        }
    }
    public String getDenomination(int n){
     if(n<1||n>13){
         throw new IllegalArgumentException("Invalid denomination: " + n);
     }
     switch (n){
         case 1:return "A";
         case 11:return "J";
         case 12:return "Q";
         case 13:return "K";
         default:return String.valueOf(n);//String.valueOf(n) 기존의 숫자열 값을 문자열화 시킨다
     }
    }
    public Card draw(){
        Card selectedCard=cards[selectedIdx];
        cards[selectedIdx]=null;
        return selectedCard;//뽑은카드는 줘버린다.
    }
    public void checkCards(){
        for(Card c:cards){
            System.out.println(c);
        }
    }
}
