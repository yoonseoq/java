package com.green.day2;

public class _999Mission5_2 {
    public static void main(String[] args) {

        int score = (int) ((Math.random()) * 101.0);//101.0더블로 계산하면 불필요한 형변환안해도됨
        System.out.printf("score:%d\n", score);

        /*
            100-98이상A+
            97-94A0
            90-33A-
         */

        String grade="D", opt ="";//String 이면""아예 빈칸 허용
        int gradeScore= score/10;
        switch (gradeScore){
            case 9,10:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
        }

        int optScore=score%10;
        if (gradeScore>6){if(optScore>=8||gradeScore==100){
            opt="+";
        } else if (optScore>=4) {
            opt="0";
        }else {
            opt="-";
        }
        }


        System.out.printf("%s%s\n",grade,opt);

    }
}