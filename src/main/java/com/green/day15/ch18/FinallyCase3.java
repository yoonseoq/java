package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer=null;
        try {
            Path path = Paths.get("D:/simple.txt");//절대경로(full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("반가워");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally { //예외가 되든 말든 무적권 실행되는 부분
            System.out.println("되겠나 ㅋ");
            try{
                System.out.println("어 되네");
                if (writer!=null){
                    writer.close();
                }
            } catch (IOException e) {

            }
            System.out.println("お終い");
        }
    }
}
