package com.greedy.section02.encapsulation.problem4;

public class Application1 {

	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
//		monster1.kinds = "프랑켄슈타인";
//		monster1.hp = 200;
		
		monster1.setKinds("프랑켄슈타인");
		monster1.setHp(200);
		
		System.out.println(monster1.getInfo());
		
	}

}
// 직접 필드 제한하고 간접적으로 접근하기 위해서 캡슐화 -> 결합도를 낮추기 위해서
// 3가지 감추기 
// 필드 감추기 = 데이터 은닉
// 클래스 감추기 = 타입 은닉
// 구현 은닉