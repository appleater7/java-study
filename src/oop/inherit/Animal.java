package oop.inherit;

import oop.inter.DoSome;

public class Animal implements DoSome{
	
	int age;
	String type;
	
	public void eat() {
		/**
		 *  동물은 먹기위해 존재한다.
		 */
		System.out.println(age + "살인 " + type + "이 밥을 먹다.");
	}
	
	public void sleep() {
		System.out.println(age + "살인 " + type + "이 잠을 자다.");
	}
	
	public void run() {
		System.out.println(age + "살인 " + type + "이 뛰다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
}
