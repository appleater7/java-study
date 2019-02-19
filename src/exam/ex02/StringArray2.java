package exam.ex02;

public class StringArray2 {
	public String[] strs;

	public static void main(String[] args) {
		int sa2Length = 2;
		int strsLength = 10;
		StringArray2[] sa = new StringArray2[sa2Length];
		for (int i = 0; i < sa2Length; i++) {
			sa[i] = new StringArray2();
			sa[i].strs = new String[strsLength];
		}
		for (int i = 0; i < sa2Length; i++) {
			if (i == 0) {
				for (int j = 0; j < strsLength; j++) {
					sa[i].strs[j] = (j + 1) + "";
				}				
			}else {
				for (int j = 0; j < strsLength; j++) {
					sa[i].strs[j] = (10 - j) + "";
				}
			}
		}
		for (int i = 0; i < sa.length; i++) {
			for (int j = 0; j < sa[i].strs.length; j++) {
				System.out.println("sa[" + (i + 1) + "]" +".strs[" + j + "] = " + sa[i].strs[j]);
			}
		}
		
		
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		sa1.strs = new String[10];
		sa2.strs = new String[10];
		
		
		// sa1 방갯수 10개 -> 1 ~ 10
		// sa2 방갯수 10개 -> 10 ~ 1
		
		strsLength = sa1.strs.length;
		
		for (int i = 0; i < strsLength; i++) {
			sa1.strs[i] = (i + 1) + "";
			sa2.strs[i] = (10 - i) + "";
		}
		for (int i = 0; i < strsLength; i++) {
			System.out.println("sa1.strs[" + i + "] = " + sa1.strs[i]);
			System.out.println("sa2.strs[" + i + "] = " + sa2.strs[i]);
		}
		
	}
}
