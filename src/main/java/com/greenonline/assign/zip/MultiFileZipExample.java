package com.greenonline.assign.zip;

import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class MultiFileZipExample {

    public static void main(String[] args) {
        // 압축할 파일들의 경로 (여러 개의 파일)
        String[] sourceFiles = {
                "D:\\sys\\Java\\src\\main\\java\\com\\greenonline\\assign\\초급_성적관리_프로그램.java",
                "D:\\sys\\Java\\src\\main\\java\\com\\greenonline\\assign\\초급_합계와_평균_계산_프로그램_짜기.java",

        };

        // 생성할 ZIP 파일 이름
        String zipFile = "output.zip";

        try {
            zipFiles(sourceFiles, zipFile);
            System.out.println("ZIP 파일이 성공적으로 생성되었습니다: " + zipFile);
        } catch (IOException e) {
            System.err.println("압축 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 여러 파일을 ZIP 파일로 압축하는 메소드
    public static void zipFiles(String[] sourceFiles, String zipFilePath) throws IOException {
        Path zipFile = Files.createFile(Paths.get(zipFilePath));

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            for (String filePath : sourceFiles) {
                Path file = Paths.get(filePath);
                if (!Files.isDirectory(file)) { // 파일이 디렉토리가 아닐 때만
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    try {
                        zipOutputStream.putNextEntry(zipEntry);
                        Files.copy(file, zipOutputStream);
                        zipOutputStream.closeEntry();
                    } catch (IOException e) {
                        System.err.println(filePath + " 파일을 압축 중 오류 발생: " + e.getMessage());
                    }
                }
            }
        }
    }
}

