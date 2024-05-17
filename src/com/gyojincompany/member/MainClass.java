package com.gyojincompany.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setName("홍길동");
		
		
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
		
		Member member2 = new Member();
//		member2.id = "lion";
//		member2.pw = "12345";
//		member2.name = "이순신";
//		member2.email = "lee@abc.com";
//		member2.age = 32;
		
		System.out.println("회원1이름:"+member1.getId()); // 홍길동
//		System.out.println("회원2이름:"+member2.name); // 이순신
	}

}
