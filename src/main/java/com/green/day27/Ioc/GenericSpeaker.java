package com.green.day27.Ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class GenericSpeaker implements Speaker {
    private Woofer woofer;


    public GenericSpeaker(Woofer woofer){
        this.woofer=woofer;
    }



    @Override
    public void speakerSound() {
        System.out.println("Generic Speaker : Sound is so amazing");
        woofer.baseSound();
    }
}
