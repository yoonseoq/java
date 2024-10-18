package com.green.day09.Ch13;

public class EnhancedForInst {
    public static void main(String[] args) {

        Product[] arr=new Product[4];
        arr[0]= new Product("coffee",5000);
        arr[1]= new Product("computer",50000000);
        arr[2]= new Product("apple",5000);
        arr[3]= new Product("dress",5000200);

        for(Product item:arr)//생성자 item에다가 배열값 각 주소 부름
        {
            System.out.println(item);
        }
        int sum=0;
        for(Product item:arr){
            sum+= item.getPrice();
        }
        System.out.printf("합계:%d원\n",sum);

        //배열에서 제품명이 apple인것만

        for (Product item:arr) {//item이 for문을 축약해놓은것

        if(item.getName().equals("apple")){//혹시가지고 잇는게 애플이니?

            System.out.println(item);//ㅇㅋ 콘솔
        }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
            sum+=arr[i].getPrice();
        }
        System.out.println(sum);

        /*
        enhanced for문을 사용하여 제품명 가격ㄱ을 콘솔에 출력하고 모든제품 가격을 더한갑
         */
    }
}

class Product{
    private String name;
    private int price;


    Product(String name, int price){
        this.name=name;
        this.price=price;

    }
    public String toString(){//메소드임
        //return "제품명은"+name+"가격은"+price;
        return String.format("제품명;%s원,가격:%d원",name,price);
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
