package me;

public class CircleTest {
	
	public static void main(String[] args) {
		int n = 10;
		for (int i = -n; i <= n; i++) {
			for (int j = -n; j <= n; j++) {
				if (i * i + j * j <= n * n) {
					System.out.println("☆");
				} else {
					System.out.println("★");
				}
			}
			System.out.println();
		}
	}

}
