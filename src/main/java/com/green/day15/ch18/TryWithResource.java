package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
            Path path = Paths.get("D:/simple.txt");//절대경로(full 경로)
        try(BufferedWriter writer= Files.newBufferedWriter(path)) {
        Scanner scan= new Scanner(System.in);
        AutoCloseable auto=writer;
        auto=scan;
            writer.write("d플 무근본");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("お終い");
    }
    /*
    writer.close();
    scan.close();
    무적권 실행됨
     AutoClosable 인터페이스를 상속받은 객체만 쓸 수 있다.
     try-catch문 안에 코드가 많음 성능이 저해될 수 있다.
     */
}
