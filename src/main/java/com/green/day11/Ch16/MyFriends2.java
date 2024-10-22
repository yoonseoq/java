package com.green.day11.Ch16;

public class MyFriends2 {
    public static void main(String[] args) {




        UnivFriend2 uf=new UnivFriend2("윤","감귤포장","1111");
        Friend f1=uf;//여기 들어있는 객체값은 서로 같은 주소값을 가진다
        Friend f2=new UnivFriend2("김","응급구조","4444");
        //f2가 의미하는 바는 Friend객체수조값을 담을 수 있는 f2레퍼런스 변수
        //이제느 ㄴ + Friend 를 상속받은 객체의 주소값도 담을 ㅜㅅ 있다

        Friend[] arr3=new Friend[10];
        //univFriend2 CompFriend2 Friend 객체 주소값 ㄴ모두 담으 ㄹ수 있다

        uf.showInfo();
        CompFriend2 cf=new CompFriend2("윤","영어","폰");
        cf.showInfo();
        arr3[0]=uf;
        arr3[1]=f2;
        arr3[2]=new CompFriend2("박","바리스타","010");
        arr3[3]=new CompFriend2("강","마케팅","555");
        //부모타입은 자식의 객체값을 가질 수 있다.

        arr3[0].showInfo();
        System.out.println("---------");
        //arr3[4].showInfo();//null point exception 발생!

        //반복문으로 arr3에 객체주소값이 있는 친구들만 showInfo()메소드 호출
        //객체주소값이 있는걸 알 수 있는 명령어는 없고 if(arr3[i]!=null)를 사용해야함
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i]!=null){//주솟값이 있을지 없을지 체크
            arr3[i].showInfo();
        System.out.println("----------");
            }
        }
        for (int i = 0; i < arr3.length; i++) {

        if(arr3[i]==null){
                continue;//씹어버림
            }
            arr3[i].showInfo();
        System.out.println("----------");

        }
        /*
        대학친구와 직장동료는 부모는 같지만 서로서로 남남
        다형성은 다양한 형태가 될 수 있는 성질이다.

         */
        UnivFriend2[] arr1= new UnivFriend2[3];
        CompFriend2[] arr2= new CompFriend2[3];

    }
}
//생성자를 통해 멤버필드 초기화 가능하게 작성

class Friend {
    protected String name;//전역변수 만들어줘야함 지역변수는 호출끝나면 증발함
    protected String phone;

    Friend(String name, String phone) {//생성자 만들어주기
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo() {//만약에 대학친구랑 직장동료가 읽기가 어ㅄ으면 여기까지옴
        System.out.println("이름:" + name);
        System.out.println("전화:" + phone);
    }

}
//이름 전화번호 전공값을 초기화할 수 있는 생성자작성
class UnivFriend2 extends Friend {//부모의 기본생성자가 없다. 해결방법은
    private String major;

    UnivFriend2(String name, String major, String phone){
        super(name, phone);
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공:"+major);
    }


}
class CompFriend2 extends Friend{
    private String department;

    CompFriend2(String name, String department,String phone){
        super(name, phone);//기본생성자가 없을시 이렇게 사용
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();//부모가 가지고 있는것을 호출
        System.out.println("부서명:"+department);
    }
}

