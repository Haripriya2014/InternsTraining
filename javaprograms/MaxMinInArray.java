package javaprograms;
import java.util.Arrays;

public class MaxMinInArray {

	public static void main(String[] args) {
		Integer[] array = {1, 45, 77, 88, 33, 23, 4};
		Arrays.sort(array);
		System.out.println("Minimum number in Array "+array[0]);
		System.out.println("Maximum number in Array "+array[array.length-1]);

	}

}

/*
 * public void usingCollection() { Integer max =
 * Collections.max(Arrays.asList(array));
 * System.out.println("Maximum array of number is "+max); Integer min =
 * Collections.min(Arrays.asList(array));
 * System.out.println("Minimum array of number is "+min); }
 */