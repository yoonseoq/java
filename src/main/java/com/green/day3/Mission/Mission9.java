package com.green.day3.Mission;

public class Mission9 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int dan = 2; dan < 10; dan++) {
                System.out.printf("%d x %d = %d\t", dan, i, (i * dan));//\t는 옆으로 식을 배열시킴
            }
            System.out.println();
        }
    }
}
