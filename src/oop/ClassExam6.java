package oop;

public class ClassExam6 {
	
	int[] nums;
	ClassExam6(int i) {
		nums = new int[i];
	}
	
	public static void main(String[] args) {
		ClassExam6 ce = new ClassExam6(3);
		ce.nums[0] = 1;
		System.out.println(ce.nums[0]);
	}
}
