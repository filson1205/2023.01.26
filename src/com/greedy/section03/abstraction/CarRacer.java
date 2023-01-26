package com.greedy.section03.abstraction;

public class CarRacer {
	
	private Car car = new Car(); //아직 배우지 않은 문법 때문에 이렇게 작성
	
	public void startUp() {
		car.startUP();
	}

	public void stepAccelator() {
		car.go();
	}
	
	public void stepBreck() {
		car.stop();
	}
	
	public void turnOff() {
		car.turnOff();
	}
	
}
