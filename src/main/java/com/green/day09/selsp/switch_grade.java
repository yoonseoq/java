package com.green.day09.selsp;

public class switch_grade {
    public static void main(String[] args) {
        int sc = (int)(Math.random()*101);
        System.out.printf("score:%d\n",sc);

         /*
            100-98이상A+
            97-94A0
            90-33A-
         */
        String grade="D",otp="";
        int gsc=sc/10;
        switch (gsc){
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
        }
        int osc=sc%10;
        if(gsc>6){
            if((sc==100)||(osc>=8)){
                otp="=+";
            } else if (osc>=4) {
                otp="0";
            }else{
                otp="-";
            }
        }
        System.out.println("お前の成績は："+grade+otp);


    }
}
