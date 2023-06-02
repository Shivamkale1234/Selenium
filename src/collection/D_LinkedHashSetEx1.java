package collection;

import java.util.LinkedHashSet;

public class D_LinkedHashSetEx1 {

	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet();
		
		l.add("shiv");
		l.add('A');
		l.add(10);
		l.add(20);
		l.add(20.30);
		l.add("shivraj");
		l.add(null);
		l.add(null);
		
		System.out.println(l);

	}

}
