package javaprograms;


import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int data[]= {1,3,6,7,9,2,5}; 
		Arrays.sort(data);
		int secondLargest=data.length-2;
		
	System.out.println("Second Largest Number : " +data[secondLargest]);
	
		

	}

}


	


