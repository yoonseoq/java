package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체주소값 52개를 저장 할 수 있어야 한다
    private final Card[] cards ;//전부 카드객체주소값
    private final String[] patterns;
    private final  String[] denomination;

    private int selectedIdx=0;//외부에 줘야 할 카드의 index의값 주고나면 null


    public CardDeck(){
        cards = new Card[52];
        patterns=new String[]{"Diamond","Heart","Spade","Clubs"};
        denomination=new  String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //카드에 52개 칸이있어서
//각방 접근위해선 for문 사용

        int idx=0;//순차적으로 도는. 한번쓸때마다 1씩 올라감
        for (int i = 0; i < patterns.length; i++) {
            String patt=patterns[i];
            for (int j = 1; j <= denomination.length; j++) {
                String denom=getDenomination(j);
                cards[idx]=new Card(patt,denom);
            idx++;
            }

        }//왜 실행이 안되지

        for (int i = 0; i < cards.length; i++) {
            int rIdx=(int)(Math.random()*cards.length);
            Card rd  = cards[i];//카드타입이기때문
            cards[i]= cards[rIdx];
            cards[rIdx]=rd;



        }



       /* for(Card cd: cards){ //카드들 출력
            System.out.println(cd);

        }
        */
        //카드 다 꺼내기

        //미션1"",""값을 가지고 있는 카드객체를


/*
        for (int i = 0; i < cards.length; i++) {
            cards[i]=new Card("a","B");
            //반복문 안에 만들어져야 서로 다른객체 만드렁짐

        }
 */
        for (int i = 0; i < denomination.length; i++) {
            denomination[i]=getDenomination(i+1);
        }


        //enhande
        //enhancedfor로 주소값을 전부 출력

    }
    private void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random()*cards.length);
            Card cd= cards[i];
            cards[i]=cards[rIdx];
            cards[rIdx]=cd;

        }
    }

    public String getDenomination(int n){
//예외를 해결
        if(n<1||n>13){
            return "";
        }

        switch (n){
            case 1:
                return "A";
            case 11:
                return "J";
                case (12):
                return "Q";
                case (13):
                return "K";
            default:return String.valueOf(n);
        }//나머지숫자는 위에처럼 보내버리기
    }
    public String getDenomination2(int n){
        //혹시나 리턴이 안되는 상황이 생기면 빨간줄
    return null;
    }
    //주소값 하나씩 리턴, 리턴 주소값 지워야함
    public Card draw(){
        Card selectedCard= cards[selectedIdx];//외부에 줘야 할 카드의 index의값, 주고나면 지워야함
        cards[selectedIdx]=null;
        selectedIdx++;
        return selectedCard;
    }
    public void checkCard(){
       for (Card c: cards)
        System.out.println(c);
    }
}

//카드객체주소값 보내기 toString오버라이딩 카드 클래스에다
