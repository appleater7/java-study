package oop.inherit;

public class Animal {
	
	int age;
	String type;
	
	void eat() {
		/**
		 *  동물은 먹기위해 존재한다.
		 */
		System.out.println(age + "살인 " + type + "이 밥을 먹다.");
	}
	
	void sleep() {
		System.out.println(age + "살인 " + type + "이 잠을 자다.");
	}
	
	void run() {
		System.out.println(age + "살인 " + type + "이 뛰다.");
	}
}
