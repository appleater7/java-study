package syntax;
/*
 *  \" "입력
 *  \t tab입력
 *  \n enter(줄바꿈)입력
 *  \\ \입력
 *  \r\n 개행하기 두번바뀌진 않음 시스템 차이를 고려한 합성명령어
 */
public class SpString {

	public static void main(String[] args) {
		String str = "\"hi\"\ta\nb\rc\\";
		System.out.println(str);
	}
}
