package com.green.day10.Ch13;

public class Mission2DimenArray {
    public static void main(String[] args) {
        int[][] score={
                //int[i: 학생][j:과목]
                //국 영 수
                {100,90,80},//영슈
                {90,90,80},//상철
                {80,70,60}//광수
        };


        //영수
        int sumys=0;
        for(int ys:score[0]){
           sumys+=ys;
        }
        System.out.println("영수합계:"+sumys);
        System.out.println("영수평균:"+(sumys/score[0].length));

        int sumsc=0;
        for(int sc:score[1]){
           sumsc+=sc;
        }
        System.out.println("상철합계:"+sumsc);
        System.out.println("상철평균:"+(sumsc/score[1].length));

        int sumks=0;
        for(int ks:score[2]){
           sumks+=ks;
        }
        System.out.println("광수합계:"+sumks);
        System.out.println("광수평균:"+(sumks/score[2].length));

        //국영수 합계 평균
        int student=0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                student+=j;
            }
        }
        int sumkor=0;
        for (int i = 0; i < score.length; i++) {
            sumkor+=score[i][0];
        }
        System.out.println("국어합계:"+sumkor);
        System.out.println("국어평균"+(sumkor/ score.length));
        int sumeng=0;
        for (int i = 0; i < score.length; i++) {
            sumeng+=score[i][1];
        }
        System.out.println("영어합계:"+sumeng);
        System.out.println("영어평균"+(sumeng/ score.length));
        int summat=0;
        for (int i = 0; i < score.length; i++) {
            summat+=score[i][2];
        }
        System.out.println("수학합계:"+summat);
        System.out.println("수학평균"+(summat/ score.length));
        int total=0;
        int sub=0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                total+=score[i][j];


            }
        }
        System.out.println("학급합계:"+total);
        System.out.println("학급평균:"+total/(score.length* score[0].length));
        //0번째 행의 배열수만 봐도 한학생이 치루는 과목수를 알 수 있다.



    }

}
/*
멍청노트

과목을 평균으로 나눌때 학생수로 나눴어야 했는데 굳이굳이 j의 겂우ㅡㄹ
 */