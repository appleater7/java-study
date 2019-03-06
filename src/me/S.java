package me;

class F{
	public F(){
		System.out.println("아빠");
	}
}

public class S extends F{

	public S(){
		System.out.println("아들");
	}
	public static void main(String[] args){
		new S();
	}
}
