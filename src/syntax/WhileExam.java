package syntax;

public class WhileExam {

	public static void main(String[] args) {
		int num = 1;
		while (num > 5) {
			System.out.println(num);
			num++;
		}
		
		do {
			System.out.println(num);
			num++;
		}while (num > 5);
	}
}
