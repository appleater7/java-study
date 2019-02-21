package collection.list;
// 인스턴스화 al 은 인스턴스 변수
// ArrayList 의 구성원의 DATA TYPE 은 Object.
// <> : 다이아몬드라고 부른다.
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); 
		// ArrayList<String> : 스트링 data type 의 리스트
//		al.add(10);
		al.add("abc");
//		al.add(true);
//		al.add('c');
//		al.add(1.1);
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		ArrayList<Integer> numList = new ArrayList<>();
		// 다이아몬드로 설정할 수 있는 data type 은 프로머티브 데이터 타입은 
		// 사용할 수 없다. 따라서 warper 클래스로 대체 사용 할 수 있다.
	}
}
