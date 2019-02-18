package oop.inter;
/*
 *  인터페이스에는 메서드 선언만 가능하다.(정의 x)
 *  표준을 만드는 정의서
 *  몸통을 만들 수 없다.
 */
public interface PrintSome {
	void printString(String str);
	void printChar(char c);
	void printInt(int num);
}
