package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        clear();
    }

    public void add(int n){
        //배열은 imutable이기 때문에 한번 정해지면 변동이 안된다. 그래서 고정되있는 칸 수를 늘린다
      int[] tmp=new int[arr.length+1];//기존 크기보다 크게
        /*
        list.add(10); 이거 할때마다 배열에 칸을 하나씩 증가시키고 새로운값 넣을준비
         */
        tmp[arr.length]=n;//넣은 자연수를 그 해당배열인덱스에 넣는다
        for (int i = 0; i < arr.length; i++) {
            tmp[i]=arr[i];//그전까지 값 추가 기존의 원본에서 값 복사
        }
        tmp[arr.length]=n;
      arr = tmp;//복사 할 때마다 한칸 늘어나는것. 늘어난 크기의 배열 주소값울 담는다.
        //일단 이렇게 배열이 생김
        /*
        arr = tmp 왜 밑에 있냐? 그 우ㅣ에 올리면 연결고리 끊어짐
         */
        int size=arr.length;

    }
    public int size(){
        return arr.length;
    }



    public int remove(){

        //라스트인덱스 찾기:tlqkf
        int [] tmp= new int[arr.length-1];//숫자를 뺌(진석씨)
        for (int i = 0; i < arr.length-1; i++) {
            //그 숫자만큼 범위설정
            tmp[i]=arr[i];


        }
        int p= arr[arr.length-1];
        arr=tmp;

        return p;

    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);//0번칸이 없다고 해서
        int i;
        for (i = 1; i < arr.length; i++) {

            sb.append("," + arr[i]);

        }
        sb.append("]");
        return sb.toString();
    }
    public void clear(){
        arr=new int[0];


    }
}

/*
        arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 2;



//오늘 할 것 스트링 빌더 이해하기

        /*
        int i;
        for ( i = 0; i < arr.length; i++) {

        }
        return "["+arr[i]+"]";
        */

          //타입이 이거임
    /*
    public MyArrayList add(int n){
    return null; 일단 네기 힌거
    }
     */


