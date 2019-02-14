package syntax;

public class ClassExam {
	int a = 1; // 클래스 변수, 전역변수
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
		// 클래스를 선언하고 호출할때, static 을 제외한 나머지를 호출한다.
		ce.test();
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		
//		ce.test.abc = 1;
	}
}
