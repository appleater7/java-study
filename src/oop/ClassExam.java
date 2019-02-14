package oop;

public class ClassExam {

	int[] nums = new int[3];
	String str = "abc";

	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		ce.str = "바꾸자!";
		System.out.println(ce.str);

//		ce = null; // 가비지 컬렉터에서 추가설명
//		System.out.println(ce.str);

//		반복문을 사용해서
//		ce 가 가지고 있는 nums 라는 인트형 배열변수에
//		0 = 10, 1 = 20, 2 = 30 이라는 값을 저장하고
//		다시 반복문을 사용해서
//		System.out.println() 으로 값을 출력해주세요.
		int length = ce.nums.length;
		// 입력단과 출력단을 분리하세요!!!!
		for (int i = 0; i < length; i++) {
			ce.nums[i] = (i + 1) * 10;
		}

		for (int i = 0; i < length; i++) {
			System.out.println(ce.nums[i]);
		}
	}
}
