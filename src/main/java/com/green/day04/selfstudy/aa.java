package com.green.day04.selfstudy;

public class aa {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 10) + 1;
        System.out.println("star:" + star);
        String p = " ";
        String s = "*";
        int i;
        int z;

        for (i = 0; i < 5; i++) {        // 0,1,2,3,4
            for (z = 0; z < 5; z++) {     //0,1,2,3,4
                System.out.print(z < i ? p : s);
            }
            System.out.println();
        }
                /*      01234
                i=0 z<0 fffff
                i=1 z<1 tffff
                i=2 z<2 ttfff
                i=3 z<3 tttff
                i=4 z<4 ttttf
                 */
                //System.out.print(s);

        for (i = 0; i < 5; i++) {
            for (z = 0; z <= i; z++) {
                System.out.print(s);
            }
            for (z=1;z<5-i;z++) {                                                     //공백뒤로 별이 그냥 따라붙게 해야한다. 처음부터 f가 나오면 바로 다음으로 넘어가버림
                System.out.print("_");
            }

                /*       01234
                i=0 z<5  tttt  ____
                i=1 z<4  ttt   ___
                i=2 z<3  tt    __
                i=3 z<2  t     _
                i=4 z<1

                 */


                /*       01234
                i=0 z<=0 tffff *
                i=1 z<=1 ttfff **
                i=2 z<=2 tttff ***
                i=3 z<=3 ttttf ****
                i=4 z<=4 ttttt *****

                 */



                System.out.println();



        }





        for ( i=0;i<star;i++){
            for (z=0;z<star;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}