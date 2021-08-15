package javaprograms;


public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		  int num1=0; int num2=1; int sum=0,count=10;
		  System.out.print(" " +num1);
		  System.out.print(" " +num2); 
		  for(int i=2;i<count;i++) {
		  sum=num1+num2;
		  System.out.print(" " +sum); 
		  num1=num2; 
		  num2=sum;
		  
		  }
	}
}
		
		/*
		 * int i = 1, n = 10, t1 = 0, t2 = 1; System.out.print("First " + n +
		 * " numbers series: "); while (i <= n) { System.out.println(t1 + " "); int sum
		 * = t1 + t2; t1 = t2; t2 = sum; i++; }
		 */

