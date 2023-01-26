package com.greedy.section05.overloading;

public class OverloadingTest {
	
	public void test() {}
	
//	public void test() {}
	
//	private void test() {} //접근제한자는 오버로드 성립요건 해당하지 않음
	
//	public int test() { return 0; } //리턴타입은 오버로드 성립요건 해당하지 않음

	public void test(int num) {} //오버로딩 성립
	
//	public void test(int num2) {} //매개변수 이름이 중요하지않기 때문에 성립요건 해당핳지 않음
	
	public void test(int num1, int num2) {} //오버로딩 성립
	
	public void test(int num, String name) {} //오버로딩 성립
	
	public void test(String name, int num ) {} //오버로딩 성립
}
