package syntax;

public class ClassExam {
	int a = 1; // 클래스 변수
	char c = '1';
	String s = "1";
	
	void test() {
		int abc = 0;
		System.out.println("난 ClassExam꺼");
	}
	
	public static void main(String[] args) {
		// '.' ~의 의 의미 ce.(의)a
		int a = 1;
		ClassExam ce = new ClassExam(); 
		// 클래스를 선언하고 호출할때, 
		// static 을 제외한 나머지를 호출한다.
		ce.test();
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		
		/*
		 * data type 의 변천사
		 * 변수 ->> 배열(숫자의 한계를 극복)
		 *  ->> 구조체(다양한, 데이터타입의 조합)
		 * ->> 객체(메서드의 배열화, 동사를 data type 에 편입)
		 */
	}
}
