package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        PrintableVar2 p=s-> System.out.println(s);
        //파라미터가 하나면 생략가능
        p.print("ㅋㅋ");
        p.print("（笑（笑））");
        //중괄호생략시 리턴도 생략가능
        Calc sumCalc=(n1,n2)->n1+n2;
        Calc minusCalc=(n1,n2)->n1-n2;
        Calc multifliyCalc=(n1,n2)->n1*n2;
        Calc devideCalc=(n1,n2)->n1/n2;
        System.out.println(sumCalc.calc(2, 3));
        System.out.println(minusCalc.calc(2, 3));
        System.out.println(multifliyCalc.calc(2, 3));
        System.out.println(devideCalc.calc(6,2));
    }
}
@FunctionalInterface
interface PrintableVar2{
    void print(String str);
}

@FunctionalInterface
interface Calc{
    int calc(int n1, int n2);

}