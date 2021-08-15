package javaprograms;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesSet {
	
	
	public static void main(String[] args) {
		int arr[] = {0,1,5,2,3,4,5,6,7,8,2};
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i:arr) {
		if(set1.add(i)==false) {
			System.out.println("The duplicate value is :" +i);
		}
	    
	     
		}

	}

}



