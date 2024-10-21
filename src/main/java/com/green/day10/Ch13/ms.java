package com.green.day10.Ch13;

public class ms {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, //영수
                {90, 90, 80}, //상철
                {80, 70, 60}, //광수
        };
        String[] names = {"영수", "상철", "광수"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학"};
        int[] subjectsScore = new int[subjects.length];

        int totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                totalScore += score[i][j];
                namesScore[i] += score[i][j]; //학생별 합계 점수 정리
                subjectsScore[i] += score[i][j]; //과목별 합계 점수 정리
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , names[i], namesScore[i], (float) namesScore[i] / subjects.length);
        }
        for (int i = 0; i < subjectsScore.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , subjects[i], subjectsScore[i], (float) subjectsScore[i] / names.length);
        }
        System.out.println(totalScore);
        System.out.println((float) totalScore/(subjects.length* names.length));
    }
}

