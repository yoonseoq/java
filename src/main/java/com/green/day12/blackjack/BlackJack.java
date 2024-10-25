package com.green.day12.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("--=========game start");
        CardDeck cd= new CardDeck();
        Rule rule= new Rule();
        Gamer gamer=new Gamer();
        Dealer dealer=new Dealer();
        Scanner scan=new Scanner(System.in);
        //번갈아 가면서 게이머와 딜러가 2장의 카드를 받을 수 있게
        //System.out.println(cd.draw()); 이 작업은 또 카드주는거 호출해서 카드한장을 버리게함

        for (int i = 0; i < 2; i++) {
       //2번씩 반복
        dealer.recieveCard(cd.draw());
        gamer.recieveCard(cd.draw());
        }



        //근데 딜러포인트가 16점 이하면 카드 한장 더 받음
        dealer.needMoreCard(cd);
       while (true){
           System.out.println("-------------------------");
           gamer.showYourCards();
           System.out.print("카드줄까>? (싫으면:n)");
           String input= scan.nextLine();
           //input문자열에 있는 값이 0이면 반복문 종료
           if("n".equalsIgnoreCase(input)){
               break;
           }
           //게이머가 카드한장 더 받음
           gamer.recieveCard(cd.draw());
       }
        System.out.println("딜러카드공개");
       dealer.showYourCards();
       rule.getWinner(dealer,gamer);

        System.out.println("겜오버");














    }
}
