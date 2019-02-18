package oop.inter;
/*
 * 접근제어자 : public, protected, default, private
 * private		: 외부 참조 불가
 * public		: 
 * protected	: 같은 패키지 內, 단 상속받은 경우에는 외부서도 동작 가능
 * default 		: 
 */
import oop.inherit.Animal;

public class Print implements PrintSome{

	@Override
	public void printString(String str) {
		System.out.println(str);
	}

	@Override
	public void printChar(char c) {
		System.out.println(c);
	}

	@Override
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Print p = new Print();
		
		p.printInt(123);
		
		PrintSome ps = new Print();
		
		Animal a = new Animal();
		a.run();
		
	}
}
