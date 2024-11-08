package com.green.day27.noneic;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HamanSpeaker implements Speaker {

    private Woofer woofer = new HanilWoofer();// 부모니까 자식의 개체갑 넣을수 있음


    @Override
    public void speakerSound() {
        System.out.println("Harman Speaker: 소리가 웅장하다");
        woofer.baseSound();
    }
}

// 다양성
