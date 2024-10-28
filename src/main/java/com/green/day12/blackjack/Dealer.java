package com.green.day12.blackjack;

public class Dealer extends Gamer{
    public  void needMoreCard(CardDeck cd) {
        //16점 이하면 카드 하나 더 받는다.


        if(point<=16){

            receiveCard(cd.draw());
        }
    }
}
