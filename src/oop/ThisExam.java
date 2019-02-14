package oop;

public class ThisExam {

	int num = 10;
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		// 가독성을 위해서 this를 써주어야 함
		return this.num;
	}
	
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}
}