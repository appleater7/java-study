package oop.inherit;

public class Final {
	
	final int num = 3;
	final int num2;
	Final() {
		num2 = 3;
	}
	
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.num);
//		f.num = 3 ; // 파이널 변수는 선언시 반드시 동시에 값을 초기화 하여야 한다.
//		6Line 이전까지만 초기화 되면 선언이 유효하다.
//      final + static 함께써서 누구나 볼 수 있지만, 불가변한 설정같은 단위에서 사용한다.!!!!!!
	}
}
