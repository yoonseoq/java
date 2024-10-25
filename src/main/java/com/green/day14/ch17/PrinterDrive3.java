package com.green.day14.ch17;

import com.green.day14.ch17.Prn204Drv;

/*

클래스가 클래스 상속: extends
인터페이스가 인터페이스를 상속받을때는 extends
클래스가 인터페이스 상속: implements
인터페이스는 클래스를 상속 받을 수 없다
 */
public class PrinterDrive3 {
    public static void main(String[] args) {
        //자식타입이 부모객체 주소값 담은 경우
        //Prn204Drv();가 상속을 어디까지 받았는지 확인하면 Printable가지 상속받았고
        //Printable은 ColorPrintable보다 부모타입이기 때문에 담을 수 없다.
        ColorPrintable cp=(ColorPrintable)new Prn204Drv();
        //둘다 printable담겨있지만  Prn204Drv()은 printCMYK을 몰라서
    }
}
interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}
//prm909Drv 객체으;ㅣ 주소값 담을 수 있는 타입
//Printable, ColorPrintable, Prn909Drv
//Prn909Drv 타입으로 호출가능한 메소드 printCMYK,print
//colorprintable로 허출가능한 메소드 printCMYK,print
//Printable로 허출가능한 메소드 print
class prn909Drv implements ColorPrintable{

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);

    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}
/*
CMYK
빛의 3원색 RGB
 */

//이미지 표현방식:
// ......이 많을수록 고해상도
// bitmap vector 방식
//이미지 포맷:jpg,jpeg,png
