package com.green.day10.Ch13;

public class Misson2Object {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        arr[0]=new Student("영수",100,90,80);
        arr[1]=new Student("상철",100,90,80);
        arr[2]=new Student("광수",100,90,80);
        for(Student stu:arr){//stu
            System.out.printf("%s - 국어: %d, 영어: %d, 수학: %d\n"
                    ,stu.getName(),stu.getKorScore(),stu.getEngScore(),stu.getMatScore());
            System.out.println(stu);
        }

        printStudentInfo(arr);
        printKorScore(arr);
        printEngScore(arr);
        printMatScore(arr);
        printTotalSubjectScore(arr);
    }
    public static void printTotalSubjectScore(Student[] students){
        int totalSum=0;
        for (Student stu:students){
            totalSum+=stu.getAllScore();
        }
        float totalAvg=(float)totalSum/(students.length*Student.SUBJECT_CNT);
        System.out.printf("반 합계: %d, 반평균: %.1f",totalSum,totalAvg);
    }





    public static void printStudentInfo(Student[] students){
        for (Student stu: students){
        System.out.println(stu);
        }
    }

    public static void printKorScore(Student[] students){
        int totalKorScore=0;
        for(Student stu: students){

                 totalKorScore +=stu.getKorScore();
            }
        System.out.printf("국어- 합계:%d, 평균:%.1f",totalKorScore,(float)totalKorScore/students.length);}

    public static void printEngScore(Student[] students){
        int totalEngScore=0;
        for(Student stu: students){

                 totalEngScore +=stu.getEngScore();
            }
        System.out.printf("영어- 합계:%d, 평균:%.1f",totalEngScore,(float)totalEngScore/students.length);}


    public static void printMatScore(Student[] students){
        int totalKorScore=0;
        for(Student stu: students){

                 totalKorScore +=stu.getKorScore();
            }
        System.out.printf("국어- 합계:%d, 평균:%.1f",totalKorScore,(float)totalKorScore/students.length);}

    }

class Student{
    public static final int SUBJECT_CNT=3;//과목이 늘어나면 일일히 수정해야 하나요
    private String name;
    private int korScore;//국어점수
    private int engScore;//영어점수
    private int matScore;//수학점수

    Student(String name,int korScore,int engScore,int matScore){
        this.name=name;
        this.korScore=korScore;
        this.engScore=engScore;
        this.matScore=matScore;
    }

//데이터 한번 드가묜 수정못하게 setter차단 대신 getter는 있어야함
// getter만들때 시프트 누르고

    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMatScore() {
        return matScore;
    }

    public int getAllScore() {
        return korScore+engScore+matScore;
    }

    @Override
    public String toString(){
        int allScore=getAllScore();
        return String.format("%s - 국어: %d, 영어: %d, 수학: %d|합계점수:%d,평균점수%.1f"
                ,name,korScore,engScore,matScore,allScore,(float)allScore/SUBJECT_CNT);
    }
}
