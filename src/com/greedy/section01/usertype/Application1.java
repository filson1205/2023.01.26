package com.greedy.section01.usertype;

public class Application1 {

	public static void main(String[] args) {
		
		/* 회원 정보 관리 
		 * 아이디, 비밀번호, 이름, 나이, 성별, 취미
		 * */
		
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.print("hobby : ");
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		/* 사용자 정의의 자료형 사용 */
		/* 1. 변수 선언 및 객체 생성 */
		/* 클래스 사용할이름 = new 클래스(); <- 객체(instance) 생성 구문
		 * 자료형 변수명 = new 클래스명();
		 *  */
		Member member = new Member(); //member는 매개변수(레퍼런스 변수)라고함
		
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("memeber.name : " + member.name);
		System.out.println("member.age : "  + member.age);
		System.out.println("memeber.gender : " + member.gender);
		System.out.println("member.hobby : " + member.hobby);
		
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "홍길동";
		member.age = 20;
		member.gender = '남';
		member.hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("변경 후 member.id : " + member.id);
		System.out.println("변경 후 member.pwd : " + member.pwd);
		System.out.println("변경 후 member.name : " + member.name);
		System.out.println("변경 후 member.age : " + member.age);
		System.out.println("변경 후 member.gender : " + member.gender);
		System.out.print("변경 후 member.hobby : ");
		for(int i = 0; i < member.hobby.length; i++) {
			System.out.print(member.hobby[i] + " ");
		}
				
		System.out.println();
		
		
	}

}
