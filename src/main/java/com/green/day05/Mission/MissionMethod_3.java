package com.green.day05.Mission;

public class MissionMethod_3 {
    public static void main(String[] args) {
        printStar(4);
        System.out.println();
        printStarTriangle(4);
    }


    static void printStarTriangle(int star) {
        for (int i = 0; i < star; i++) {
            printStar(i);
        }
        System.out.println();
    }
    static void printStar(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }

    }//인텔리제이 소스코드 정리 Ctri+Shift+Alt+L

}
