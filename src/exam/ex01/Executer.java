package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object obj = new Son();
		Father f = new Son();
		Son s = new Son();
		
		
		obj = f;
		obj = s;
		
		Object obtest1 = new Object();
//		Son obtest2 = new Object(); // 메모리를 생성할때, 데이터타입과 호환되는지 check??!!
		obtest1 = f;
		
		
		Object[] objs = new Object[3];
		objs[0] = obj;
		objs[1] = f;
		objs[2] = s;
		
		((Father)objs[1]).printInfo();		
	}
}

// 상위 클래스
// 상속받은 하위 클래스