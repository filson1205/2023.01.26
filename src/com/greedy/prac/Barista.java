package com.greedy.prac;

public class Barista {
	/*
	 * 바리스타가 수신할 수 있는 메세지
	 * 1. 주문을 받아라
	 * 2. 주문 받은 메뉴를 만들어라 
	 * 3. 완성된 메뉴를 손님에게 전달해라 
	 */
	boolean makeOn;
	
	public void orderOn() {
		System.out.println("주문 받았고, 금방 만들겠습니다.");
		makeOn = true;
		make();

	}
	
	public void make() {
		
		if(makeOn) {
			System.out.println("딸기 스무디 다 만들었습니다.");
		}
	}
}
