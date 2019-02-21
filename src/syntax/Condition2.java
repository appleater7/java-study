package syntax;

public class Condition2 {

	public static void main(String[] args) {
		int a = 4;
//		String str = "a는 3이 아니다."; // else 문을 생략할 수 있는 방법 선행 전제.
//		if (a == 3) {
//			str = "a는 3이다.";
//		}
		String str = (a == 3) ? "a는 3이다." : "a는 3이 아니다.";
		// 맞으면 앞, 틀리면 뒤

		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.equals("dog")); // false 호출됨 대소문자의 구분
		System.out.println(s1.equalsIgnoreCase("dog")); // true 호출됨 대소문자의 무시
		System.out.println(s1.toLowerCase().equals("dog"));
	}
}
