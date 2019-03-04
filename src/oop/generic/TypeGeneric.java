package oop.generic;
/*
 *  제네릭은 4종류가 있다.
 *  Type
 *  Elements
 *  Key
 *  Values
 *   
 */
public class TypeGeneric<T> {
	private Object o;
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}
	
	public static void main(String[] args) {
		TypeGeneric<Integer> tg = new TypeGeneric<>();
		tg.setT(123);
		Integer i = tg.getT();
		tg.setO("abc");
		Object o = tg.getO();
	}
}
