package javaprograms;

public class SwapNo {

	public static void main(String[] args) {
		
		//without using third variable
		  int s1=200; 
		  int s2=50; 
		  System.out.println("Before swapping :");
		  System.out.println("s1:" +s1);
		  System.out.println("s2:" +s2);
		  s1=s1*s2;
		  s2=s1/s2;
		  s1=s1/s2;
		  System.out.println("After swapping :");
		  System.out.println("s1:" +s1);
		  System.out.println("s2:" +s2);
						
	}
}
		
				
		
		
		//using third variable
		
		/*
		 * int s1=20; int s2=50; 
		 * System.out.println("Before swapping :" + "s1 -> " + s1 * + " " + "s2 -> " + s2);
		 * int temp =s1;
		 * s1=s2; 
		 * s2=temp;
		 * System.out.println("After swapping :" + "s1 -> " + s1 + " " + "s2 -> " + s2);
		 */
		 
		
		
		//without using third variable
		
		/*
		 *int s1=20;
		 *int s2=50;
		 *System.out.println("Before swapping :" + "s1 -> " + s1 + " " + "s2 -> " + s2);
		 *s1=s1-s2;
		 *s2=s1+s2;
		 *s1=s2-s1;
		 *System.out.println("After swapping :" + "s1 -> " + s1 + " " + "s2 -> " + s2);
		 */
		
	
