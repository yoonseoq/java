package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[]arr= {10,20,30,40};

        Function<Integer[],Integer> fn =n->
                //<파라미터,리턴타입>
        {
            int max=n[0];
            for (int i = 0; i < n.length; i++) {
                if(max<n[i]){
                    max=n[i];
                }
                //return max; 리턴이 포문안에 있어서
            }return max;
        };

        int max = fn.apply(arr);

        System.out.println(max);

    }
}
