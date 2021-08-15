package javaprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=343; int orig=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
        System.out.println("Reverse Number : " +rev);
        
   	    if(rev==orig)
        	System.out.println("Palindrome Number");
        else
        	
        	System.out.println("Not a Palindrome Number");
	}

}
