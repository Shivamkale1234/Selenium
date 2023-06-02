package stringExamples;

public class Example3 {

	public static void main(String[] args) {
		
		String x = "My name is Shivam";
		System.out.println(x);
		
		//upper
		String a = x.toUpperCase();
		System.out.println(a);
		
		//lower
		String b = a.toLowerCase();
		System.out.println(b);
		
		String c= "Mumbai";
		String d ="mumbai";
		
		//concad
		String g = c.concat(d);
		System.out.println(g);
		
		//equals
		boolean e = c.equals(d);
		System.out.println(e);
		
		//equalsIgnoreCase
		boolean f=c.equalsIgnoreCase(d);
		System.out.println(f);
		
		String city = "i am from pune";
		System.out.println(city);
		
	}

}
