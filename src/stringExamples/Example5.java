package stringExamples;

public class Example5 {

	public static void main(String[] args) {
		
			
	    String name = new String("shivam");
		int a = name.length();
		char b=name.charAt(4);
		String d = "My name is Shivam";
		String e = d.toUpperCase();
		String f = e.toLowerCase();
		String g = "Mumbai";
		String h ="mumbai";
		boolean j = g.equals(h);
		boolean k=g.equalsIgnoreCase(h);
		String city = "i am from pune";
		boolean l = city.contains("pun");
		boolean m = city.contains("pun");
		int n = city.indexOf("pune");
		String college = "";
		String college1 = " college of engineering    ";
		int o= 10;
		int p= 20;
		String q = String.valueOf(o);
		String college2 = "college of bngineering";
	    String r = college2.replace('b', 'E');
	
	    //outputs
	    System.out.println("01)--"+name);             //shivam
		System.out.println("02)--"+a);                //length();
		System.out.println("03)--"+b);                //charAt(4);
		System.out.println("04)--"+d);                //My name is Shivam
		System.out.println("05)--"+e);                //toUpperCase();
        System.out.println("06)--"+f);                //toLowerCase();
		System.out.println("07)--"+j);                //equals(h);
		System.out.println("08)--"+k);                //equalsIgnoreCase(h);
		System.out.println("09)--"+l);                //contains("pun");
		System.out.println("10)--"+m);                //contains("pun");
		System.out.println("11)--"+n);                //indexOf("pune");
	    System.out.println("12)--"+college.isBlank());//isBlank();
	    System.out.println("13)--"+college.isEmpty());//isEmpty();
	    System.out.println("14)--"+college1);         // college of 
	                                                  //engineering
	    System.out.println("15)--"+college1.trim());  //trim()
	    System.out.println("16)--"+q);                //10
	    System.out.println("17)--"+o+p);              //1020
	    System.out.println("18)--"+o+p);              //1020
	    System.out.println("19)--"+r);                //replace('b', 'E');

		for(int i=0; i<a; i++)
		{
			char c=name.charAt(i);
			System.out.print(c +" ");
		}
		
	}

}
