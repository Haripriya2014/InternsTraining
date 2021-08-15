package javaprograms;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
	int array[]= {1,3,3,3,3,5,6,6,7,7,7,9,9};
	
		
		  int n=array.length;
		  Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
		  for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) { 
				 if(array[j]==array[i]) {
		  dupNumbers.add(array[i]);
		  } 
		} 
	} System.out.println(dupNumbers);
 }
}

