package javaprograms;

public class ReverseAString {
	public static void main(String[] args) {
		//StringBuffer 
		
		/*String str = "Agni";
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		System.out.println(buffer.reverse());
	}
}*/

		
		  //for loop
		  
		  String str = "Madam"; 
		  String reverse = "";
             for (int i =str.length()-1;i>=0;i--) {
              reverse=reverse+str.charAt(i);
   		  } 
		  
             System.out.println("The reversed string is :" +reverse);
             
		/*
		 * if(str.equals(reverse)) System.out.println("Palindrome"); else
		 * System.out.println("Not a Palindrome");
		 */
			
		}
			
	}
