package com.green.day12.blackjack;

public class Rule {
private final int MAX_POINT=21;
    public void getWinner(Dealer dealer,Gamer gamer){
        /*각 게이머 딜러의 점수를 엍어야 한다ㅡ,
        그리고 값 비ㅣ교해서 누가 이겼는지 출력
        비겻다 누가 이겼다
        비긴경우. 둘의값이 같을 경우, 둘다 21을 넘은경우

         */
    int pointg= gamer.getPoint();
    int pointd= dealer.getPoint();
        System.out.println(pointg);
        System.out.println(pointd);
        //비기는 케이스를 미리 거름
        //그리고 남은거는 둘중 하나가 21을 넘은경우 혹은 둘다 21을 안넘은경우
        if ((pointd==pointg)||(pointd>MAX_POINT&&pointg>MAX_POINT)){
            System.out.println("draw");
        }
        //딜러가 이긴경우의 수:
        // 21을 넘지 않으ㅡ면서 게이머보다 점수가 많은 경우인데 딜러가 점수 더 높음
        //그리고 게이머가 21을 넘은 경우
        //아니면 게이머 승
        else if ((pointd<=MAX_POINT&&pointd>pointg)||pointg>MAX_POINT) {
            System.out.println("dealer win");
        }else {
            System.out.println("gamer win");
        }


    }
}
