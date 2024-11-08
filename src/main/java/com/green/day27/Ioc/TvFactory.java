package com.green.day27.Ioc;

import com.green.day27.*;

public class TvFactory {
    // Singleton 패턴
    // 객체는 딱 하나만 만들어서 돌려쓴다
    private static TvFactory tvFactory;

    public static TvFactory getInstance() {
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        // null 이면 주소값을 넣고 넘겨줌 스태틱이여서 공간이 하나임 그대로 유지됨 즉 같은주소값 가짐
        // 새롭게 생성, 호출할때마다 null 이 넘어가는 상태
        return tvFactory;
    }

    //객체생성을 스프링에 대리로 만드는 것을 빈등록
    private TvFactory() {
        //생성자는 하나인데 앞에 프라이빗 붙임 기본생성자 만듦?
    }

    public Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName) {
            case "boss" -> new BossSpeaker(woofer);
            case "generic" -> new GenericSpeaker(woofer);
            default -> null;
        };
        return switch (tvName){
        case "lg"-> new LgTv(speaker);
            default -> null;
        };
    }


    }




