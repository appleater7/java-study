package me.collection;
/*
 *  고양이 이름 1 ~ 10
 *  고양이 나이 1 ~ 10 중 랜덤
 */

import java.util.HashMap;
import java.util.Set;

class Cat {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}	
}

public class HashMapPractice {
	
	public static void main(String[] args) {		
		HashMap<String, Integer> catList = new HashMap<>();
		int size = 10;
		for (int i = 0; i < size; i++) {
			catList.put("이름" + (i+1), (int)((Math.random()) * 10) + 1);			
		}
		Set<String> catKeys = catList.keySet();
		for (String catKey:catKeys) {
			System.out.println(catKey + "의 나이는 " + catList.get(catKey));
		}
	}
}
