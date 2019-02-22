package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int ranNum = (int)(Math.random() * 9) + 1;
			if(numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			}else {
				i--;
			}
		}
		System.out.println(numList);
		System.out.println(", 를 구분자로하여 숫자를 3개 입력해주세요!");
		
		String inputStr = scan.nextLine();
		String[] inputNums = inputStr.split(",");
		
		int ballCount = 0;
		int strikeCount = 0;
		int outCount = 0;
		
		for (int i = 0; i < inputNums.length; i++) {
			if (numList.indexOf(Integer.parseInt(inputNums[i])) != -1) {
				if (i == numList.indexOf(Integer.parseInt(inputNums[i]))) {
	// 나는 numList 의 모값이 몇번째에 있는지의 주소와
	// nums 의 모값이 몇번째에 있는지 비교하려 했는데
	// nums 의 모값이 몇번째에 있는지 == i 와 같았다.
					strikeCount++;
				}else {
					ballCount++;
				}
			}else {
				outCount++;
			}
		}
		
		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums.length; j++) {
//				if (numList.indexOf(nums[i]) == -1) {
//					outCount++;
//					break;
//				}else if (numList.indexOf(nums[i]) != -1 && numList.indexOf(nums[i]) == -1) {
//					ballCount++;
//					break;
//				}else {
//					strikeCount++;
//					break;
//				}
//			}
//		}
		System.out.print(strikeCount + "S ");
		System.out.print(ballCount + "B ");
		System.out.print(outCount + "O ");
	}
}
