package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        /*
        만약 BufferedWriter writer = Files.newBufferedWriter(path);
         */
        try {
            Path path = Paths.get("D:/simple.txt");//절대경로(full 경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write('a');
            writer.write("반가워");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //빨간줄 뜨는이유 똑같이 던지거나(메인메소드여서 못던짐) 트라이캐치
    }
}

/*
class Files{
    public static BufferedWriter newBufferedWriter(Path path){
    return null;
    }

}
 */
class FinallyCase2 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.close();
        } catch (IOException e) {

        }

    }
}