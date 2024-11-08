package com.green.day27.noneic;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(){
        this.woofer=new MartenWoofer();
    }
    @Override
    public void speakerSound() {
        System.out.println("JBL Speaker: 소리가 깔끔");
        woofer.baseSound();
    }
}
