package com.greedy.prac;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		/* 요구사항
		 * 
		 * 1. 손님이 캐셔에게 커피 주문을 한다.
		 * 2. 캐셔는 바리스타에게 주문 받은 메뉴를 전달한다.
		 * 3. 바리스타는 주문 받은 커피를 만들어서 손님에게 전달한다.
		 * 
		 * 객체 구분
		 * 1. 손님
		 * 2. 캐셔
		 * 3. 바리스타
		 * 4. 커피?
		 *  
		 * 손님이 수신할 수 있는 메세지
		 * 1. 캐셔에게 주문을 해라 
		 * 2. 완성된 메뉴를 받아라
		 * 
		 * 캐셔가 수신할 수 있는 메세지
		 * 1. 주문을 받아라 
		 * 2. 바리스타에게 메뉴를 전달해라 
		 * 
		 * 바리스타가 수신할 수 있는 메세지
		 * 1. 캐셔에게 주문을 받아라
		 * 2. 주문 받은 메뉴를 만들어라 
		 * 3. 완성된 메뉴를 손님에게 전달해라 
		 * */
		Customer cus = new Customer();

		Scanner sc = new Scanner(System.in);

		System.out.print("주문하시겠습니까?");	
		boolean isTrue = sc.nextBoolean(); 

		if (isTrue) {
			cus.cusOrder();
		}

		Customer.takeIt();

	}

}
