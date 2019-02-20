package exam.ex03;
/*
 *  POJO : 모든 멤버변수는 Private 로 선언하고, 
 *  겟셋메서드는 Public 으로 선언한다.!!
 *  DAO, Model, VO 를 만들때 POJO 방식으로 
 */

public class Dog {
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
