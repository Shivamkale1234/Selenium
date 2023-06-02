package stringExamples;

public class Example4 {

	public static void main(String[] args) {
		
		String city = "i am from pune";
		boolean a = city.contains("pun");
		System.out.println(a);
		
		//end word only
		boolean b = city.endsWith("ne");
		System.out.println(b);
		
		//countup to index
		int c = city.indexOf("pune");
		System.out.println(c);
		
	    String college = "";
	    
	    //isBlank
	    System.out.println(college.isBlank());
	    
	    //empty
	    System.out.println(college.isEmpty());
	    
	    
	    String college1 = " college of engineering    ";
	    System.out.println(college1);
	    
        //trim
	    System.out.println(college1.trim());
	    
	    int g= 10;
	    int i= 20;
	    String h = String.valueOf(g);
	    System.out.println(h);
	    System.out.println(g+i);
	    System.out.println(g+h);
	    
	    String college2 = "college of bngineering";
	    String k = college2.replace('b', 'E');
	    System.out.println(k);
	    
	}

}
