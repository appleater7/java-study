package oop.inherit;

// final 클래스, 메서드, 변수에서 사용할 수 있다.

class People {
	String name = "무명";
	People() {
		this("무명");
	}
	People(String name) {
		this.name = name;
	}
	final void printInfo() {
		System.out.println("이름 : " + name);
	}
}

public class Student extends People {
	int grade;
	Student(int grade) {
		this.grade = grade;
	}
	
//	void printInfo() {
//		System.out.println("학년 : " + grade);
//		System.out.println("이름 : " + name);
//	}
	
	public static void main(String[] args) {
		Student st = new Student(3);
		st.printInfo();
	}
}
