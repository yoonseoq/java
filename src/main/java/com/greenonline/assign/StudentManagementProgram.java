package com.greenonline.assign;

public class StudentManagementProgram {
    public static void main(String[] args) {
        Member si= new Member("12345","abcde",
                "서울특별시 강남구 역삼동","student@school.com");
        si.result();
    }
}
class Member{
    private String ID;
    private String PW;
    private String Address;
    private String Email;

    public Member(String ID,String PW,String Address,String Email){
        //4개의 파라미터를 받는 생성자

        this.ID=ID;
        this.PW=PW;
        this.Address=Address;
        this.Email=Email;
    }
    public void result(){
        System.out.println("학생정보");
        System.out.println("---------------------");
        System.out.printf("ID: %s\n",ID);
        System.out.printf("PW: %s\n",PW);
        System.out.printf("Address: %s\n",Address);
        System.out.printf("Email: %s\n",Email);
    }

}
