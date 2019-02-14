package syntax;

public class Cons {

	Cons() {
		System.out.println("생성자호출!");
	}
	public static void main(String[] args) {
		// 반드시 생성자는 클래스명과 동일하여야 한다.
		// 11번째 줄 코드 실행시, 3 부터 10번째까지의 
		// 코드를 별도실행하여 다른 메모리에 할당한다.
		// 그것을 c 에 대입하는 것.
		Cons c = new Cons();
	}
}
