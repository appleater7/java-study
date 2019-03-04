package oop.generic;

import java.util.ArrayList;
import java.util.List;

public class ElementsGeneric<E> extends ArrayList<E> {

	public static void main(String[] args) {
		List<String> strList = new ElementsGeneric<>();
		strList.add("abc");
	}
}
