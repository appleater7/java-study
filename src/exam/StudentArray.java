package exam;

class Student {
	String name;
	int grade;
	String schoolName;
}
public class StudentArray {

	public static void main(String[] args) {
		// 스튜던트[] 는 스튜던트배열 데이터타입, 
		// 그럼 스튜던트[9]의 데이터 타입은?? 스튜던트에 대입 될수 있는값은 인트, 스트링 안됨 !! 스튜던트만
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].grade = i + 1;
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println("student[" + i + "] 의 grade : " +students[i].grade);
		}
	}
}
