package method;

public class Methods {

	// 메서드의 오버로딩은 파라미터의 데이터타입, 숫자, 
	// 순서로 구분되는한 선언할 수 있다.
	void test(int a, String str) {
		
	}
	void test(String str, int a) {
		
	}
	
	static String getStr( ) {
		return "abc";
	}
	
	static void setStr(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		setStr("abc");
		String str = getStr();
		System.out.println(str);
		
	}
}
