package oop;

public class StaticExam {
	
	static {
		
	}

	static int num = 1; // 멤버변수
	
	public static void main(String[] args) {
		System.out.println(StaticExam.num); // StaticExam. 이 생략되어 있다.
		
		StaticExam se = new StaticExam(); // 선언할때 static 을 제외한 나머지를 메모리에 호출한다.
		System.out.println(se.num);
		se.num = 10;
		se = new StaticExam();
		System.out.println(se.num);
		System.out.println(StaticExam.num);
	}
}
