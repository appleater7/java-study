package collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *  클래스이름 : Dog
 *  String name, int age(private)
 *  dogList 만들어서 반복문으로 1부터 10까지!!
 *  name = 강아지1~10, age = 1 ~ 10
 */

class Dog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}

public class DogList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		int size = 10;
		for (int i = 0; i < size; i++) {
			Dog dog = new Dog();
			dog.setName("강아지" + (i + 1)); // dog.name = "강아지";
			dog.setAge(i + 1);
			dogList.add(dog);
		}
		for (int i = 0; i < size; i++) {
			System.out.println(dogList.get(i).getName() + "의 나이는 " + 
					dogList.get(i).getAge() + "살");
		}
		Map<String,String> map2 = new HashMap<String,String>();
		System.out.println(map2);
	}
}
