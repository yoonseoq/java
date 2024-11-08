package com.green.day27.Ioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;

public class LgTv implements Tv {

    private Speaker speaker;

    public LgTv(Speaker speaker){
        this.speaker=speaker;
    }


    @Override
    public void sound() {
        System.out.println("LgTv : 소리가 난다");
        speaker.speakerSound();

    }

    @Override
    public void speakerSound() {

    }
}


// 인터페이스는 구현하거나 아니면 abstract 하면 된다