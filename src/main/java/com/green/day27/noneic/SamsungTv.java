package com.green.day27.noneic;

import com.green.day27.*;

public class SamsungTv implements Tv {
    private Speaker speaker ;

    public SamsungTv()
    {
        //speaker = new HamanSpeaker();
        speaker = new JBLSpeaker();
    }
    @Override
    public void sound() {


        System.out.println("SamsungTv: 소리가 난다");
        speaker.speakerSound();
        // 스피커를 딱히 안지정해서 오류가남
    }

    @Override
    public void speakerSound() {

    }
}
// 추상메소드는 구현하려면 클래스를 인터페이스로 만들면됨