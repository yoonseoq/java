package com.green.day11.Ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1=new SuperCLS();//SuperCLS() 기본생성자 호출.객체생성 돠었으므로 1번째 호출
        SuperCLS s2=new SuperCLS();//2번
        SubCLS sub1=new SubCLS();//1이 왜올라갔냐. 서브클래스에 자동으로 생성자가 들어가있음, 부모의 기본생성자가 들어가있기 때문 부모의 기본생성자르 ㄹ호출하였기 때문
        //이거는 상속되었기 때문에 1번더 호출되어서 ㅋㅏ운트가 3
        sub1.showCount();
        sub1.showCount();
        //슈퍼()는 부모의 생성자를 호출
    }
}

class SuperCLS{
    protected static int count;

    //SuperCLS(int a)//파라미터를 집어넣으면 기본생성자가 아니기에
    SuperCLS(){
        count++;
    }
}
class SubCLS extends SuperCLS{
    SubCLS(){
        super();//이거는 자동으로 생성되는 거긴함 즉 생략가능. 만약에 부모의 기본생성자가 없으면 super용욕에 빨간줄뜸
    }
    void showCount(){
        System.out.println("count:"+count);
    }
}