package syntax;

public class Condition3 {

	public static void main(String[] args) {
		int num = 5;
		String str = "3";
		
		switch(str) { // 스위치는 true 일때 부터 이후까지 지속적으로 실행한다.
		// 대안으로 break 를 사용한다.
		case "1" : 
			System.out.println("1이네요~");
			break;
		case "2" : 
			System.out.println("2이네요~");
			break;
		case "3" : 
			System.out.println("3이네요~");
			break;
		case "4" : 
			System.out.println("4이네요~");
			break;
		default : 
			System.out.println("1~4 아니네요~");
			
		}
		
	}
}
