package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

        System.out.print("a/b...a?");
        int n1 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐
        System.out.print("a/b...b?");
        int n2 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐

        System.out.printf("%d/%d=%d\n", n1,n2,(n1/n2));
        //수학적 에러는 여기서 발생함

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지
        } catch (ArithmeticException e){
             System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지

        }
        System.out.println("--------------------------------");

        try {

            System.out.print("a/b...a?");
            int n1 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐
            System.out.print("a/b...b?");
            int n2 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐

            System.out.printf("%d/%d=%d\n", n1,n2,(n1/n2));
            //수학적 에러는 여기서 발생함

        } catch (InputMismatchException | ArithmeticException  e) {
            //이렇게 이중으로 해도됨
            System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지
        }

        System.out.println("----------------------");
        try {

            System.out.print("a/b...a?");
            int n1 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐
            System.out.print("a/b...b?");
            int n2 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐

            System.out.printf("%d/%d=%d\n", n1,n2,(n1/n2));
            //수학적 에러는 여기서 발생함

        } catch (Exception  e) {//예외 최상부분 모든걸 잡아버림. 예외의 최상위 클래스
            //이렇게 이중으로 해도됨
            System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지
        }
        System.out.println("----------------------------");
        try {

            System.out.print("a/b...a?");
            int n1 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐
            System.out.print("a/b...b?");
            int n2 = scan.nextInt();//숫자만 적게끔 문자열이 조금이라도 들어가면 예외터짐

            System.out.printf("%d/%d=%d\n", n1,n2,(n1/n2));
            //수학적 에러는 여기서 발생함

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());//수학적 에러는 안잡안냄
            e.printStackTrace();//에러터지면 나오는 메세지

        }catch (Exception e){
            //Exception 은 항상 제일 밑 catch문에적을 수 있다
        }

        //n1 빨간색 이유 을 감싸는 스코프를 벗어나서. 스코프문제 빈번
        //그냥 n1밖에다 선언하면 될까요
        //아니면 이 문단을 스코프 안에 넣으면됨
        //문자가 들어가는 순가 ㄴ종료처리


        System.out.println("お終い");//수학적 에러터지면 이런거도 없
        //이중트라이 캐치하면 종료메세지볼수있다.
    }
}
