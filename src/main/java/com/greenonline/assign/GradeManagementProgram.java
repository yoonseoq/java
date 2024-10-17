package com.greenonline.assign;

public class GradeManagementProgram {
    public static void main(String[] args) {
        Grade kbh = new Grade("강백호",90.0,85.5,70.0);
        Grade ccs = new Grade("채치수",82.0,92.0,60.5);

    }
}
class Grade{
    public Grade(String name,double kor,double math, double eng){
        System.out.printf("%s의 평균 점수:%.2f\n",name,((kor+math+eng)/3));
    }

}