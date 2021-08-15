package javaprograms;


public class SumOfDigits {
	public static void main(String[] args) {
		
		int number = 4545;
		int remainder = 0;
		int result=0;
		while(number>0) {
			
			remainder=number%10;
			result=result+remainder;
			number=number/10;
		}
			
		System.out.println("Result is : " +result);
	}
} 
	
	
		/*
		 * int input =4545; String val = String.valueOf(input); char[] charArray =
		 * val.toCharArray(); int sumOfDigits = 0; for (char c : charArray) {
		 * sumOfDigits= sumOfDigits + Integer.parseInt(""+c); }
		 * System.out.println("Sum of digits is " +sumOfDigits);
		 */


