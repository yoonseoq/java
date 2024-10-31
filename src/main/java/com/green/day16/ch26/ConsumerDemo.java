package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = n-> System.out.println((n<0?-n:n));

        cons.accept(10);//콘솔에 10찍혀야함
        cons.accept(-20);//콘솔에 20찍혀야함


        Consumer<String> cons2 = s -> System.out.printf("%s는 %d글자입니다.",s,s.length());
        cons2.accept("aaaa");

    }
}
//class Consumer<Integer>
