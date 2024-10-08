package com.green.day2.ch05;

public class _16IEIE {
    public static void main(String[] args) {
        int n=1010;

        if(n<0){
            System.out.printf("%d는 0미만\n",n);
        } else if (n<50) {
            System.out.printf("%d는 50미만\n",n);
        }
        else if (n<100) {
            System.out.printf("%d는 100미만\n",n);
        }
        else {
            System.out.printf("%d는 100이상\n",n);
        }

        /*
        if-elseif-else 이것도 그룹이 된다. 그 중 하나만 실행 될 수 있다.
        elseif의 개수제한은 없다
        다만 조건은 위에서 아래로 물어보고 가장 빨리 만나는 true를 실행한다.
        실행하는데 true조건이 없다면 else가 실행된다
        else는 필수가 아닌 옵션,else가 없는경우 실행이 안되는 상황 발생가능
        else가 있으면 하나는 무적권 실행
         */
        System.out.println("쫑");

    }
}
