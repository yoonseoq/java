package com.green.day08.Ch13;

public class ArrayStudy {
    /*
    배열은 같은 타입의 여러 데이터를 묶어서 정열하기 때문에
    배열을 사용하지 않는다면 데이터 수만큼 변수를 만들어야 한다

    만약 100개의 정수값을 저장을 한다면 변수선언을 100번 해야한다
    예를 들면 int n1 n2 n3


    그렇지만 배열은 사용하여 여러데이터를 편하게 저장히고 가져올 수 있다.

    배열을 만드는 방법은
    int[] 변수량 =new int[100]= new int [100];//

    int[] arr가 의미하는 바는 int 배열  다른타입의 배열의 주소값은 저장 할 수 없다.

    new int[100]; int형의 공간이 100개가 만들어진다.
    new int[100]; int형의 공간이 100개가 만들어진다.
    각 공간은 스트링 주소값만 저장 할 수 있다.

    배열쓰기
    int [] arr=new int[10];
    arr[0]=10;//첫번쨰 공간에 10을 대입 공간번호(index는)0에서부터 시작
    arr[1]=20;//두번째 공간에 20을 저장

    arr[9]=100; 마지막 공간에 100을넣음

    초기화 하지 않은 공간은 디폴트값이 들어간다. (저장되어 있다)
    숫자형은 0, 레퍼런스 타입은 null,boolean은 false



    [배열읽기]
    System.out.println(arr[0]);//10
    System.out.println(arr[9]);//110

    arr.length는 자신의 공간의 크기값을 저장한 정수 상수
    어떤크기의 배열이든 마지막 공간의 값을 사용하고 싶을 때는
    arr[arr.length-1]이렇게 하면 된다

    ---------


    [배열생성과 동시에 초기화하는 것]
    int[] arr2 = {1,2,3,4,5};

    int[] arr3 = new int[]{1,2,3,4,5}

    메소드명({1,2,3})//이렇게 호출하는 것이 안된다.
    메소드명(new int[]{1,2,3})//이렇게 호출하는 것이 안된다.
    그렇지만 우회가 가능
    int[] arr={1,2,3}
    메소드명(arr);

    배열과 반복문for의 궁합이 좋다

     */
    public static void main(String[] args) {
        int[] arr3= new int[]{1,2,3,4,5};
        System.out.println(arr3[2]);
    }
}
