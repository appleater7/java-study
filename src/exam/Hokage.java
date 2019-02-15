package exam;

public class Hokage {

	int generation;
	String name;
	
	public static void main(String[] args) {
		Hokage[] ninja = new Hokage[5];
		for (int i = 0; i < ninja.length ; i++) {
			ninja[i] = new Hokage();
			ninja[i].generation = i + 1;
		}
		for (int i = 0; i < ninja.length ; i++) {
			System.out.println(ninja[i].generation);
		}
	}
}
