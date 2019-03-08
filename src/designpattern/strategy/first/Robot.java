package designpattern.strategy.first;

public abstract class Robot {
	
	private String name;
	
	public Robot(String name) { this.name = name; }
	public String getName() { return name; }	
	public abstract void attack();
	public abstract void move();

}

class TaekwonV extends Robot {

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {	System.out.println("I have a missile"); }

	@Override
	public void move() { System.out.println("I can only walk"); }
	
}

class Atom extends Robot{

	public Atom(String name) { super(name); }

	@Override
	public void attack() { System.out.println("주먹 발사"); }

	@Override
	public void move() { System.out.println("날 수 있다"); }
	
}

class Sungard {
	
}
