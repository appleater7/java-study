package exam.ex03;

public class MethodExam01 {
	public String name = "강영준";
	
	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01();
		System.out.println(me1.name);
	}
	
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name = "임꺽정";
		MethodExam01.setTest(me);
		System.out.println(me.name);
		// 메모리 생성 안했는데 .으로 받을수 있으면 setTest는 스태틱이다.
	}
}
