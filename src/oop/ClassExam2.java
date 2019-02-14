package oop;

public class ClassExam2 {
	// 변수를 선언만 하고 초기화를 하지 않을시,
	// 기본값으로 자바가 초기화 한다.
	// 정해지지 않은 data type 은 null 로 자동 초기화 된다.
	// 정해진 data type 원시형, Primitive Type
	// 정해지지 않은 data type 참조형, Reference Type
	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	public static void main(String[] args) {
		ClassExam2 ce = new ClassExam2();

		System.out.println(ce.strs);
		System.out.println(ce.num);
		System.out.println(ce.db);
		System.out.println(ce.bl);
		System.out.println(ce.c);
	}
}
