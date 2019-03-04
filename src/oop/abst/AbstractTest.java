package oop.abst;
/*
 *  인터페이스는 실행부에 대한 정의를 하지 않기때문에
 *  메모리 생성시킬수 없다.
 */
interface Test {
	public void play();
	public void run();
}

public abstract class AbstractTest implements Test {
	
}
