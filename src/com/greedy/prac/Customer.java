package com.greedy.prac;

public class Customer {
	/*
	 * 손님이 수신할 수 있는 메세지
	 * 1. 캐셔에게 주문을 해라 
	 * 2. 완성된 메뉴를 받아라
	 */
	Cashier cash = new Cashier();
	
	public void cusOrder() {
		
			System.out.println("딸기 스무디 한잔 주문할게요!");
			cash.Casorder();
	}
	
	public static void takeIt() {
		
			System.out.println("잘 먹겠습니다.");
}
}
