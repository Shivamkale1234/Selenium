package collection;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		 
		ArrayList l = new ArrayList();
		
		l.add("shiv");
		l.add('A');
		l.add(10);
		l.add(20);
		l.add(20.30);
		l.add("shivraj");
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(3));
		
		l.set(2, 50);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.contains("shiv"));
		System.out.println(l.contains("shiva"));
		
		l.clear();
		System.out.println(l);

	}
}
/*
[shiv, A, 10, 20, 20.3, shivraj, null, null]
8
20
[shiv, A, 50, 20, 20.3, shivraj, null, null]
[shiv, 50, 20, 20.3, shivraj, null, null]
false
true
false
[]
*/