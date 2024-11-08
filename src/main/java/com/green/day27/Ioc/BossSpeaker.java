package com.green.day27.Ioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;
import com.green.day27.noneic.SamsungTv;

public class BossSpeaker implements Speaker {
    private Woofer woofer;
    public BossSpeaker(Woofer woofer){
        this.woofer=woofer;
    }// 주는대로 쓰기




    // 외부에서 주는거 그대로 씀
    @Override
    public void speakerSound() {
        System.out.println("Boss Speaker :  소리가 짱짱하다");
        woofer.baseSound();
    }
}
