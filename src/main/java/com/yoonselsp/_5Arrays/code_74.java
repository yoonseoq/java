package com.yoonselsp._5Arrays;

public class code_74 {
    public static void main(String[] args) {

        char[] alpha={'A','B','C','D','E'};
        for (char x: alpha) {
            System.out.print(x+":"+(char)(x+32));//(char)(x+32)이건 아스키코드 일까여
            if (x=='E'){
                break;
            }
            System.out.print(",");
        }

    }
}
