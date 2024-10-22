package com.green.day11.Ch16;

public class MyFriends {
    public static void main(String[] args) {



    }
}
/*
private 멤버필드 값 넣는 2가지
1.생성자
2.메소드(setter)

아래 두 클래스 모드 멤버필드를 초기화 할 수 있는 생성자로 만드시오
 */
         /*
         뭔가 이상하지 않나요? 대학친구 직장동료 에 이름이랑 전화번호 중복되어서 좀 불편하네여
         아래의 두 클래스는 중복된 내용이 있고 둘다 사람정보를 저장하므로
         중복된 정보를 상속으로 처리하면 코드가 줄어든다 어캐헤결할까요
          */


class UnivFriend{//대학친구
    private String name;
    private String major;//전공
    private String phone;
     UnivFriend(String name,String major,String phone){
        this.name=name;
        this.major=major;
        this.phone=phone;
    }

    public String getName() {//getter만들어야 객체화해서 쓸 수 있다.
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}
class CompFriend{//직장동료
    private String name;
    private String department;//부서
    private String phone;
    CompFriend(String name,String department,String phone){
        this.name=name;
        this.department=department;
        this.phone=phone;

    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }
}