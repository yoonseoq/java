package com.green.day06.lol;

public class ADC {
    public static void main(String[] args) {

        int hp=10;
        yumi(hp);//1.옆자리 앉은 유미가 힐을 해주면 피가 차겠지?
        System.out.println("내 피통:"+hp);

        Supporter heal = new Supporter();//3.아군 힐러를 만남
        heal.hp = 50;//4.파티를 맺으면 일단 50까지 참

        yumi(heal);//6.힐러님 저 힐좀요
        System.out.println("서폿이 힐해준 후 피통:"+heal.hp);
    }

    public static void yumi(int hp){

        hp=100; //2.알고보니까 다른판을 하고있는 힐러임. 얘가 체력 100을 회복시켜도 내 피통이 채워지지 않음

    }
    public static void yumi(Supporter heal){

        heal=new Supporter();//7.다른 아군한테 이동

        heal.hp=100;//5.힐러 스킬: 힐 피통 100까지

    }
}
