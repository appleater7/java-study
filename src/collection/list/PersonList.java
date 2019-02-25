package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class PersonList {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p.getName());
		
		List<Person> pList = new ArrayList<>();
		
		int size = 10;
		for (int i = 0; i < size; i++) {
			Person tmpP = new Person();
			pList.add(tmpP);
			tmpP.setName("이름" + (i + 1));
		}
		for (int i = 0; i < size; i++) {
			System.out.println(pList.get(i).getName());
		}
	}
}
