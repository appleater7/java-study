package syntax;

public class Loop2 {

	public static void main(String[] args) {
		int i = 10;
//		for(;i >= 0 ; i--) {
//			System.out.println(i);
//		}
		
		for (i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + i * j + " ");
				if (i * j < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
