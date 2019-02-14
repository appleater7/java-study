package oop;

public class ClassExam5 {
	// 클래스는 선언부와 실행부로 나뉘어져 있다.
	// 선언부는 변수 및 메서드의 선언을 하고,
	// 실행부는 클래스내의 별도 {} 영역 내에서만 실행 가능하다. 
	
	// 생성자
	// 변수 등 선언 및 초기화를 할때 생성자에서 진행한다.
	
	int a = 2;
	ClassExam5() {
		System.out.println("난 기본 생성자!");
	}
	
	ClassExam5(int a) {
		System.out.println("난 기본 생성자 아님");
	}
	// Debug alt shift d + j
	// f5(한단계씩 다음), f6(한줄씩다음), f8(종료)
	
	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(31);
		ce.a = 4;
//		(new ClassExam5()).a = 4;
//		ce = new ClassExam5();
		System.out.println(ce.a);
//		System.out.println((new ClassExam5()).a);
	}
}
