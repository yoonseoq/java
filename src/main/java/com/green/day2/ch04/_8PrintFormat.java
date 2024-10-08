package com.green.day2.ch04;

public class _8PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을때 사용 가능

         */

        String name="홍길동";
        int age=22;
        float height=172.5f;
        char bloodType ='O';
        boolean isMan=true;

        //홍길동은 22살 키는 172.5cm,혈액형은 O형. 그는 남자입니까?true!


        System.out.println(name+"의 나이는 "+age+"살 키는"
                +height+"cm 혈액형은"+bloodType+"형입니다. " +
                "그는 남자입니까?"+ isMan);

        System.out.printf("%s의 나이는 %d살 키는 %scm 혈액형은 %c형입니다. 그는 남자입니까? %b\n"
                ,name,age,height,bloodType,isMan);

        /*
        키 값이 실수 2개 나오게 하기 위해서는 %s로 바꾸면 댐 대신 순수출력기능뿐
         */


        System.out.printf("키는 %.1f\n",172.28444);//Best %f값을 주어서 기능을 활용 할 수 있다.
        //012는 12칸을 사용하는데 빈칸이 있으면 빈칸을 0으로 채운다,
        // .1은 실수를 나타내는 길이

        int won=230000000;
        System.out.printf("won:%d원\n",won);
        System.out.printf("won:%,d원\n",won);//Best!!
        System.out.printf("won:%12d원\n",won);//오른쪽으로 밀착
        System.out.printf("won:%-12d원\n",won);//왼쪽으로 밀착
        System.out.printf("won:%012d원\n",won);//빈칸을 0으로 채움

        String result= String.format("%,d",won);
        System.out.println("result: "+result);







    }
}
