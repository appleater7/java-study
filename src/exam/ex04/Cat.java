package exam.ex04;

public class Cat implements Action{

	@Override
	public void speek() {
		System.out.println("야옹");
	}

	@Override
	public void sleep() {
		System.out.println("냥쿨쿨");
	}

	@Override
	public void eat() {
		System.out.println("냥먹냥먹");
	}

}
