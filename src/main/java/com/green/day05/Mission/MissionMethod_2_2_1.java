package com.green.day05.Mission;

public class MissionMethod_2_2_1 {
    public static void main(String[] args) {

        printStarSquare(4);
        printStarTrinagle(4);

    }

    static void printStar(int z) {
        for (int i=1;i<=z;i++){
            System.out.print("* ");
        }
            System.out.println();
    }

    static void printStarSquare(int star) {
        for (int i=0;i<star;i++){
            printStar(star);
            }

        }
    static void printStarTrinagle(int star) {
        for (int i=0;i<=star;i++){
            for (int z=1;z<=i;z++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }

}


