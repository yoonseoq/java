package com.green.day05.ch06;
//지역변수
public class LocalVariable {
    /*
        Scope스코프:변수의 접근가능영역,변수가 소멸되지 않고
        대전제: 선언된 변수에서 나를 감싸고 가장 가까이 있는 {}안에서만 살아있다(물론 선언된 이후)
     */
    public static void sum(int n1) {
        int num1;//main메소드에서 사용한 변수지만 중괄호를 벗어나는 순간 num1은 죽기때문에 중괄호가 별개이기 때문에
    }


    public static void main(String[] args) {
        //System.out.println(num1);//선언된 영역 위에 있으므로 무효

        boolean ste = true;

        int num1=11;

        if (ste){
            //int num1=22;//같은 스코프 안에 선언되어있었어서 두번 선언하면 안됨
            int num2=22;
            num1++;
            System.out.println(num1);
            System.out.println(num2);
        }
            //System.out.println(num2);스코프 밖의 선언이므로 사라짐
        {
            int num3=33;
            num3++;
            System.out.println(num3);
        }
        //System.out.println(num3); //num3의 스코프는 사라졌다.
        int i=0;//이렇게 for문밖으로 i를 빼면 됨
        for (;i<10;i++){

        }
        System.out.println(i); //i의 스코프는 for 문 바깥에서는 사라진다
        // for문 안에서 생성된 변수는 for문 안에서만 사용가능하다



    }

}
