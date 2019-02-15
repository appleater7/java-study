package oop.inherit;

class Book {
	String name;
	Book(String name) {
		this.name = name;
	}
//	Book(){
//		this("자바의 정석");
//		
////		this.name = "자바의 정석";
//// 		this = Book / this("자바의 정석") 
////			= Book("자바의 정석") = Book(String name)
//	}
}

public class ConsExam extends Book{
	ConsExam() {
		super("자바의 정석");
	}
	
	public static void main(String[] args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		
//		String str = new String("abc");
//		Scanner scan = new Scanner(System.in);
//		
//		int num = Integer.parseInt("1");
	}
}
