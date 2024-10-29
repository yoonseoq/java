package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        DBox<String,Integer>box=new DBox<>();
        /*
            DBox<String,Integer>{
                private String left;
                private Integer righ;t

            void setter(String left, Integer right){
                this.left=left
                this.right=right
            }
                       }
        위처럼 작성한 클래스를 객체화 한 것 같은 효과
         */
        //객체에 적힌 부분이 L이면 String, R이면 Integer 가 됨
        box.setter("Apple",25);
        System.out.println(box);
        DBox<Integer,Apple>box2=new DBox<>();
        /*
            DBox<Integer,Apple>{
                private Integer left;
                private Apple right;

            void setter(String left, Integer right){
                this.left=left
                this.right=right
            }
                       }
        위처럼 작성한 클래스를 객체화 한 것 같은 효과
         */
        //객체에 적힌 부분이 L이면 String, R이면 Integer 가 됨

    }
}
class DBox<L,R>{
    private L left;
    private R right;

    void setter(L left, R right){
        this.left=left;
        this.right=right;

    }
    @Override
    public String toString(){
        return String.format("%s & %s",left,right);
    }
}
