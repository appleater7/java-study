package collection.list;
/*
 *  "str" 이 최초선언 될 때, JVM 에서 주소를 한당한다.
 *  사용자가 new 를 통하여 선언할때랑 별개의 시점임!
 * 
 */
public class StrTest {

	public static void main(String[] args) {
	
		String str = new String("str");
		System.out.println(str == "str");
	}
}
