package javaprograms;


import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] data = {1,2,4,7,6,3,8};

		Arrays.sort(data); 
		for (int i = 1; i <= data.length; i++) {
			if(i != data[i-1]) {
				System.out.println("Missing element is "+ i);
				break;
			}
		}
		
	}
}
	
		
		/*
		 * int[] arr = {1,2,3,4,7,6,8}; int sum1=0;int sum2=0; for(int
		 * i=0;i<arr.length;i++) {
		 * 
		 * sum1=sum1+arr[i]; }
		 * 
		 * System.out.println(sum1);
		 * 
		 * for(int i=1;i<=8;i++) {
		 * 
		 * sum2=sum2+i; }
		 * 
		 * System.out.println(sum2);
		 * 
		 * System.out.println("Missing Number :" +(sum2-sum1));
		 */
	
	
	


