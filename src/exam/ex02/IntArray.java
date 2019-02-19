package exam.ex02;

public class IntArray {
	public int[] nums = new int[10];
	
	public boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) return false; // return 일 경우에는 한줄로 적는다.
			
			if (nums[i] == num) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		IntArray ia = new IntArray();
		for (int i = 0; i < ia.nums.length; i++) {
//			ia.nums[i] = (int)(Math.random() * 10) + 1;
			int a = (int)(Math.random() * 10) + 1;
//			if (ia.compare(ia.nums[i])) {
//				i--;
//			}else { // 비교를 하고나서 없다면 대입, 대입을 하고나서 비교.
//				
//			}
//		}
		
			if (ia.compare(a)) {
				i--;
			}else { // 비교를 하고나서 없다면 대입, 대입을 하고나서 비교.
				ia.nums[i] = a;
			}
		}
		
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "] = " +ia.nums[i]);
		}
		
//		for (int i = 0; i < ia.nums.length; i++) {
//			for (int j = i + 1; j < ia.nums.length; j++) {
//				if (ia.nums[i] > ia.nums[j]) {
//					int tmp = ia.nums[i];
//					ia.nums[i] = ia.nums[j];
//					ia.nums[j] = tmp;
//				}					
//			}			
//		}
//		System.out.println("----------------------------");
//		for (int i = 0; i < ia.nums.length; i++) {
//			System.out.println("ia.nums[" + i + "] = " +ia.nums[i]);
//		}
	}
}
