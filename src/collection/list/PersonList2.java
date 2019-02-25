package collection.list;

class Person2 {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class PersonList2 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		Person2 p2 = p;
		p.setName("hong");
		p.setName("black");
		System.out.println(p.getName());
		System.out.println(p2.getName());
		// 19L, 20L 동일한 값이 호출됨
		p2.setName("hong");
		System.out.println(p.getName());
		System.out.println(p2.getName());
		p2 = new Person2();
		p2.setName("black");
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}
}
