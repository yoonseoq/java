package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;//아래에 있는 모든 클래스가 임포트됨

public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void md1()throws IOException{
        md2();
    }
    public static void md2() throws IOException{
        Path path= Paths.get("D:/simple.txt");//절대경로(full 경로)
        //D drive에 있는 simple.txt불러오기
        BufferedWriter writer= Files.newBufferedWriter(path);
        /*
        1.멤버메소드이다.
        2.스태틱 메소드
        3.리턴메소드 리턴타입은 BufferedWriter
        4.파라미터 타입ㄹ은 path
        5.throw메소드
         */
        writer.write('a');
        writer.write("반가워");
        writer.close();
    }
}//클라스로 다 감싸야함
