package com.green.day06.ch07;

import com.green.day06.ch09.InfoHideCircle;//ctrl누르면 가짐

public class AccessLevelTest { // 클래스는 한 번만 선언
    public static void main(String[] args) {
        InfoHideCircle ihc = new InfoHideCircle();
        /*
            InfoHideCircle은 public이기 때문에 다른 패키지에서 접근이 가능하다
            굳이 같은 패키지에선 쓸 필요가 없
         */

        String str = "String은 워낙 자주 사용하기 때문에 import가 필요 없다";

        // Circle2 c = new Circle2(); // 주석 처리: Circle2가 public이 아니거나 접근 불가한 경우
    }
}

/*
    class 키워드 앞에 public을 붙일 수 있는 경우는
    Java 파일명과 클래스명이 일치할 때만 가능.
    그 외의 경우에는 public을 붙일 수 없다.
 */
class AccessLevel {
    // public이 없으므로 패키지 내에서만 사용 가능
}
