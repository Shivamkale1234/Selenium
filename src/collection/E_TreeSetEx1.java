package collection;

import java.util.TreeSet;

public class E_TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add('a');
		t.add('A');
		//t.add(10);     // if we add //t.add(10); through an exception ClassCastException.
		t.add('B');
		t.add('C');
		t.add('D');
		t.add('E');
		
		System.out.println(t);

	}

}
