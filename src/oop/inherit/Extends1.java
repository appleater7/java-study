package oop.inherit;
/*
 *  Extends1 생성자가 호출되자마자, 마더의 생성자를 호출하고, 
 *  마더의 데이터를 읽은후, Extends1 의 데이터를 마저 읽는다.
 *  이후 실행 한다. 
 */
class Mother1 {
	int age = 55;
	String name = "엄마몬!";
	
	Mother1() {
		System.out.println("난 엄마 생성자");
	}
	
	void attack() {
		System.out.println("엄마가 등짝 스매싱을 사용합니다.");
	}
	
	void eat() {
		System.out.println("확장이 먹습니다.");
	}
}

public class Extends1 extends Mother1 {
	
	Extends1() {
		System.out.println("난 확장 생성자!");
		System.out.println(age);
		attack();
	}

	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
	}
}