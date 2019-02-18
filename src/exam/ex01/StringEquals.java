package exam.ex01;

public class StringEquals {

	String str = "1";
	public static void main(String[] args) {
		StringEquals se1 = new StringEquals();
		String str = "1";
		System.out.println(se1.str==str);
		StringEquals se2 = new StringEquals();
		System.out.println(se1.str==se2.str);
	}
}
