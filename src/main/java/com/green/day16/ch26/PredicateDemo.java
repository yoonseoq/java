package com.green.day16.ch26;

import java.util.function.Predicate;

/*
    predicate: 서술어 술부 주어의 동작 상태 성질따위를 서술

    predicate 함수형 인터페이스, 인자가 하나, 타입은 제네릭 (파라미터 하나), 리턴 boolean
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> preMore10 = n -> n > 10;
        System.out.println(preMore10.test(9));
        System.out.println(preMore10.test(11));
        examPredicate(preMore10, 9);
        examPredicate(n -> n > 10, 9);
        examPredicate(n -> n > 10, 12);
//남자,남,여자,여 이런값들만 허용(true),나머지 false

        Predicate<String> preCheckGender=s->"남".equals(s)||
                "남자".equals(s)||"여자".equals(s)||"여".equals(s);

        Predicate<String> preCheckGender2=s->switch (s){
            case "남","남자","여","여자"->true;
            default -> false;
        };

        boolean result= switch ("남자"){
            case "남","남자","여","여자"->true;
            default -> false;
        };

        String gender="남";
        System.out.println(gender);
        if (preCheckGender.test(gender)){
            System.out.println("성별을 잘 입력하셨습니다.");
        }else {
            System.out.println("성별을 확인해 주세요");
        }

        if (preCheckGender2.test(gender)){
            System.out.println("성별을 잘 입력하셨습니다.");
        }else {
            System.out.println("성별을 확인해 주세요");
        }
    }

    public static void examPredicate(Predicate<Integer> p, int n) {
        System.out.println(p.test(n));
    }
}
