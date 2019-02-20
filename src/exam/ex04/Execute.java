package exam.ex04;

public class Execute {
	
	public static void space(Cat c) {
		c.sleep();
	}

	public static void space(Person p)	 {
		p.sleep();
	}
	
	public static void space(Action p)	 {
		p.sleep();
	}
	
	public static void main(String[] args)	 {
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}
}
// if (p instanceof cat) {
//	((Cat)p).eat("고등어");
//}