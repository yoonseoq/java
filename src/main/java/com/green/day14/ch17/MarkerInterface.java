package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {

        Report0 rpt0=new Report0("contents");
        //밑에 미리 스트링타입이 변수로 들어가능
        // 생성자 만들어 놔서 그냥 매개변수 집어넣으면 된다
        Report1 rpt1=new Report1();
        Report2 rpt2=new Report2();
        Report3 rpt3=new Report3();

         //
        Printer prn= new Printer();
        prn.printContents(rpt0);
        prn.printContents(rpt1);
        prn.printContents(rpt2);
        prn.printContents(rpt3);
    }
}

//인터페이스는 클래스 상속 못받아서 object상속이
interface Printable2 {
    //public abstract String getContents(); 원래 이거임
    String getContents();
}

interface Upper {
}

interface Lower {
}

class Report0 implements Printable2, Upper {

    private String contents;

//프라이빗한 메소드에 값넣을거면 세터메소드, 생성자
    //생성자를 통해서 넣게해라

     Report0(String contents) {//지역변수는 중괄호 벗어나면 죽음
        this.contents = contents;
        //위에있는 contents 지시위해 this
    }
    @Override
    public String getContents() {
        return contents;
    }

}
class Report1 implements Printable2,Lower{
    public String getContents(){
        return "Simple Funny News!";
    }
}
class Report2 implements Printable2,Upper{
    public String getContents(){
        return "Simple Funny News!";
    }
}
class Report3 implements Printable2,Upper,Lower{//먼저 트루가 떴기 때문에 upeer가 나와버림
    public String getContents(){
        return "Simple Funny News!";
    }
}//생성자 다 있음



//추상메소드는 상속받은 한 어떻게든 구현시켜야함


class Printer{
    public void printContents(Printable2 doc){
        if (doc instanceof Upper){
            System.out.println(doc.getContents().toUpperCase());//ㅇ영문자 대문자로
        } else if (doc instanceof Lower) {
            String str= doc.getContents();
            System.out.println(str.toLowerCase());
            //위에 두줄과 아래 한줄이 같음
            System.out.println(doc.getContents().toLowerCase());//영ㅂ문자 소문자로

        }else {//다 대문자로 나옴
            System.out.println(doc.getContents());
        }
    }
}