package javaprograms;


public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String input = "chennai600128";
		long total = 0;
		String rep = input.replaceAll("[\\D]", "");
		System.out.println("Numeric Values are : " +rep);
		char[] ch = rep.toCharArray();
		for(int i =0;i<ch.length;i++) {
			int j = Character.getNumericValue(ch[i]);
			total = total +j;
		}
		System.out.println("Sum of the digits in the string : " +total);
		
			
		}
	}


