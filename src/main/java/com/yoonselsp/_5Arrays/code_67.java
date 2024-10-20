package com.yoonselsp._5Arrays;

import java.util.Arrays;

public class code_67 {
    public static void main(String[] args) {

        /*
        배열 복사하기
         */

    int[] original={4,5,6,7,8};
    int[] destination={0,1,2,3,9,10,11,12,13};

    System.arraycopy(original,2,destination,4,3);
    //        배열복사(original 배열,original index값 2번째부터,destination배열,destination index값 ,복사하는 길이는 3만큼)
    System.out.println(Arrays.toString(original));//[4, 5, 6, 7, 8] 0,1,2 번째부터 3개값을 복제해서
    System.out.println(Arrays.toString(destination));//[0, 1, 2, 3, 6, 7, 8, 12, 13]// 01234 번째의 3개값까지 대입



    }
}
