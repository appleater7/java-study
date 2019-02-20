package exam.ex03;
// 각 변수의 자료형
// nums : 인트 2차원 배열, nums[0] : 인트 배열, nums[0][0] : 인트
public class MultiDimension {

	public int[][] nums = new int[100][];
	
	public static void main(String[] args) {
		MultiDimension md = new MultiDimension();
		// 다차원 배열의 초기화
		for (int i = 0; i < md.nums.length; i++) {
			md.nums[i] = new int[i+1];

		}
		int numCount = 1;
		for (int i = 0; i < md.nums.length; i++) {
			for (int j = 0; j < md.nums[i].length; j++) {
				md.nums[i][j] = numCount;
				numCount++;
			}
		}
		
		for (int i = 0; i < md.nums.length; i++) {
			System.out.print(i + "층 : ");
			for (int j = 0; j < md.nums[i].length; j++) {
				System.out.print(md.nums[i][j] + ",");
			}
			System.out.println();
		}
		// 다차원 배열의 초기화 끝
	}
}
