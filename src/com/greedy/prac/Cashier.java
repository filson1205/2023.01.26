package com.greedy.prac;

public class Cashier {
	/*
	 * 캐셔가 수신할 수 있는 메세지
	 * 1. 주문을 받아라 
	 * 2. 바리스타에게 메뉴를 전달해라 
	 */
	Barista bari = new Barista();

	public void Casorder() {
		
		System.out.println("딸기 스무디 한잔 주문 들어왔습니다.");
		bari.orderOn();
	}

// 	public void make() {
// 		
//		System.out.println("주문이 완성되었습니다.");
//		cus.takeIt();
//	}
}
