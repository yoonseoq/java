package com.green.day27;

import com.green.day27.noneic.HamanSpeaker;
import com.green.day27.noneic.JBLSpeaker;
import com.green.day27.noneic.SamsungTv;

public class Test {
    public static void main(String[] args) {
        HamanSpeaker hs = new HamanSpeaker();
        hs.speakerSound();
        //null 인상태에서 메소드 호출하면 에러터짐
        System.out.println("--------");
        Tv tv = new SamsungTv();
        tv.sound();

        // 삼성은 하만 스피커 jbl로 해결

        /*
        System.out.println("--------");
        JBLSpeaker jbl = new JBLSpeaker();
        jbl.speakerSound();


         */


    }
}
