package javaprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "radar"; 
		  String reverse = "";
           for (int i =str.length()-1;i>=0;i--) {
            reverse=reverse+str.charAt(i);
 		  } 
		  
           System.out.println("The reversed string is :" +reverse);
           
        
		if(str.equals(reverse)) 
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
			
		}
			
	}

	


