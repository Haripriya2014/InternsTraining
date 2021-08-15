package javaprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 371, orig=number;
		int result=0;
		int remainder=0;
		
		while(number>0) {
			
			remainder=number%10;
			result=result+(remainder*remainder*remainder);
			number=number/10;
					}
			
System.out.println("Result is : " +result);
    
      if(orig == result)
    	  System.out.println("Armstrong");
      else
    	  System.out.println("Not Armstrong");

	}

}
