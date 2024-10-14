package com.green.day05.Mission;

public class MissionMethod_2 {
    public static void main(String[] args) {


        printStar(4);
        System.out.println();
        printStarTrinagle(4);
        printStarSquare(4);

    }



    static void printStarTrinagle(int star) {
        for (int i=0;i<star;i++){
            printStar(i);
        }
            System.out.println();
    }
    static void printStarSquare(int star) {
        for (int i=0;i<star;i++){
            for (int z=0;z==i;z++){

            printStar(i);
            }
        }
            System.out.println();
    }
    static void printStar(int star) {
        for (int i=0;i<star;i++){
            System.out.print("* ");
        }
            System.out.println();
    }

    }

