package exam;

public class Evangelion {

	int num;
	String Pilot;
	
	public static void main(String[] args) {
		Evangelion[] eva = new Evangelion[6];
		
		for (int i = 0; i < eva.length; i++) {
			eva[i] = new Evangelion();
			eva[i].num = i;
		}
		for (int i = 0; i < eva.length; i++) {
			System.out.println(eva[i].num);
		}
	}
}
