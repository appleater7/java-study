package exam.ex03;
/*
 *  반복문으로 dogs 배열안의
 *  개개의 dog 의 이름과 나이를 입력하여
 *  출력하는 코드를 작성하세요.
 *  ex -> dogs[0].name => 멍멍이1
 *  ex -> dogs[1].age => 1
 * 
 */
public class Execute {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		
		for (int i = 0; i < dogs.length; i++) {
			String str = "멍멍이";
			int age = i;
			dogs[i] = new Dog();
			dogs[i].setName(str + (i+1));
			dogs[i].setAge(age);
		}
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println("dogs[" + i + "].name => " + dogs[i].getName());
			System.out.println("dogs[" + i + "].Age  => " + dogs[i].getAge());
		}
	}
}
