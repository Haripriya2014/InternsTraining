package javaprograms;
import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};

		if (data.length < 2) { 
				System.out.println(" Invalid Input "); 
			} else {
				Arrays.sort(data); 
				System.out.println(data[1]);
			}
		}
		
	}


