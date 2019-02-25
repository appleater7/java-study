package oop.inherit;
/*
 *  work() 메서드의 오버라이딩이 발생함.
 *  오버라이딩의 조건
 *  1. 상속
 *  2. 메서드명이 같다.
 *  3. 파라메터 숫자 갯수 순서가 같다.
 *  4. 반드시 해당 메서드의 데이터 타입까지 동일 해야 한다.
 *  5. 접근제어자 까지 동일할 것
 *  
 *  오버로딩의 조건
 *  1. 같은 공간에 있어야 한다.
 *  2. 파라메터나 갯수나 타입, 순서등이 달라야 한다.
 */

// 모든 클래스는 object 클래스를 파생받는다.
// 생성자에 감춰져 있다.!!!!^ㅡ^

// this 이 클래스 , super 상위 클래스

// 메인메서드를 제외한 영역에서만 this , super 를 사용할 수 있다.
class GrandFather {
	
	int age = 70;
	
	GrandFather() {
		
	}
	
	void work() {
		System.out.println("할아버지가 농사를 짓는다.");
		System.out.println(this.age);
	}
	
}

class Father extends GrandFather {
	
	int age = 40;
	
	Father() {
		
	}
	
	void work() {
		super.work();
		System.out.println("아빠가 일함");
		System.out.println(this.age);
	}
}

public class Son extends Father{
	
	int age = 10;
	
	Son() {
		System.out.println("이건 생성자");
	}
	
	void work() {
		super.work();
		System.out.println("아들이 공부함");
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		Son s = new Son();
		Father f = new Father();
		s.work();
		

	}
}
