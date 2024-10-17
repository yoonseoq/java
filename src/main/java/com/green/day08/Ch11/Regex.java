package com.green.day08.Ch11;

public class Regex {
    public static void main(String[] args) {
        String email = "sysooo18@naver.com";
        String regExp = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]{2,3}+$" ;
        String regExp2 = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]{2,}+$" ;
    }
}
