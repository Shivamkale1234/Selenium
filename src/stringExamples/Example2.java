package stringExamples;

public class Example2 {

	public static void main(String[] args) {
		
		String name = "shivam";
		System.out.println(name);
		
		//length
		int a = name.length();
		System.out.println(a);
		
		//char at
		char b=name.charAt(4);
		System.out.println(b);
		
		for(int i=0; i<a; i++)
		{
			char c=name.charAt(i);
			System.out.print(c);
		}
		
	}

}
