package com.greenonline.assign.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressUtil {

    public void compressZip() throws Exception {
        // 압축 할 대상(파일)이 있는 경로 지정
        String fileFolder = "C:\\Users\\NB061\\IdeaProjects\\files\\";

        // 경로에 있는 파일들의 파일객체를 생성
        File file1 = new File(fileFolder, "1.pdf");
        File file2 = new File(fileFolder, "2.pdf");
        File file3 = new File(fileFolder, "test.png");

        // 파일 객체를 담을 ArrayList 객체를 생성
        List<File> files = new ArrayList<>();

        // 파일 객체를 ArrayList에 담는다.
        files.add(file1);
        files.add(file2);
        files.add(file3);

        // 압축 될 zip 파일의 경로 지정
        String zipFolder = "C:\\Users\\NB061\\Downloads\\";

        // demo.zip 이름으로 파일 객체를 생성
        File zipFile = new File(zipFolder, "demo.zip");

        // Stream에 사용 할 byte 지정
        byte[] buf = new byte[4096];

        // zip 파일 형식으로 파일을 쓰기 위한 출력 스트림 필터를 구현하여 demo.zip 파일 생성
        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile))) {
            // 파일 객체 리스트로 loop
            for (File file : files) {
                // 파일 객체를 통해 FileInputStream 객체 생성
                try (FileInputStream in = new FileInputStream(file)) {
                    // 압축 되어지는 파일의 파일명을 지정
                    ZipEntry ze = new ZipEntry(file.getName());
                    // 새 ZIP 파일 항목 쓰기를 시작하고 항목 데이터의 시작에 스트림을 배치
                    out.putNextEntry(ze);
                    int len;
                    // FileInputStream을 통해 파일 데이터를 읽어들여 ZipOutputStream으로 생성된 zip 파일에 write
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    // 현재 ZIP 항목을 닫고 다음 항목을 쓸 수 있도록 스트림을 배치
                    out.closeEntry();
                }
            }
        }
    }
}
