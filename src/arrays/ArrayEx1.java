package arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		 
		int a[] = new int [4];  // allways start with zero.
		a[0] = 10;
		a[1] = 20; 
		a[2] = 30;
		a[3] = 40;
	  //a[4] = 50;   trying to initialize 3rd index value 
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}

//thrown "java.lang.ArrayIndexOutOfBoundsException:"
