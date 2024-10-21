package com.green.day09.Ch13;

public class EnhancedForInst {
    public static void main(String[] args) {

        Product[] arr = new Product[4];

        //모든타입의 배열을 만들 수 있다. 이건 product 배열 4개까지
        //new 키워드로 product 생성자 호출
        //기본생성자 없다. 기본생성자는 ()빈칸이 있다 일일이 수동으로 넣어줘야함
        //각 방마다 product 개체값이 들어감

        arr[0] = new Product("coffee", 5_000);
        arr[1] = new Product("computer", 50_000_000);
        arr[2] = new Product("apple", 5_000);
        arr[3] = new Product("dress", 5_000_200);

        for (Product item : arr)//생성자 item에다가 배열값 각 주소 부름
        {
            System.out.println(item);
        }
        int sum = 0;
        for (Product item : arr) {
            sum += item.getPrice();//가격을 불러온것
        }
        System.out.printf("합계:%d원\n", sum);

        //배열에서 제품명이 apple인것만

        for (Product item : arr) {//item이 for문을 축약해놓은것
            /*
            들어오세요. 애플아니네요 나가세요
            엇 애플이시네요 주소값 주세여
             */

            if (item.getName().equals("apple")) {//혹시가지고 잇는게 애플이니?

                System.out.println(item);//ㅇㅋ 콘솔
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
            sum += arr[i].getPrice();
        }
        System.out.println(sum);

        /*
        enhanced for문을 사용하여 제품명 가격ㄱ을 콘솔에 출력하고 모든제품 가격을 더한갑
         */
    }
}

class Product {
    private String name;
    private int price;


    Product(String name, int price) {//각방마다 product 개체값이 각각있다
        this.name = name;
        this.price = price;

    }
    //오버라이딩
    @Override//애노테이션을 붙이면  실수를 방지할 수 있다
    public String toString() {//메소드임 표현할 수 있는 문자열을 주세요
        //return "제품명은"+name+"가격은"+price;
        return String.format("제품명;%s원,가격:%d원", name, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
