package exam.ex03;
/*
 *  p[0].name = 이름
 */
public class Person {
	public String name;
	public int age;
	
	public static void main(String[] args) {
				
		Person[] p = new Person[3];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = "이름" + i;
			p[i].age = i;
		}
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("p[" + i + "].name => " + p[i].name);
			System.out.println("p[" + i + "].age  => " + p[i].age);
		}
	}
}
