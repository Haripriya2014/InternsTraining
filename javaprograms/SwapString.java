package javaprograms;

public class SwapString {

	public static void main(String[] args) {
		//using third variable
		/*
		 * String s1="Java"; String s2="Selenium"; String temp ="";
		 * 
		 * System.out.println("Before swapping :" + "s1 -> " + s1 + " " + "s2 -> " +
		 * s2); temp =s1; s1=s2; s2=temp; System.out.println("After swapping :" +
		 * "s1 -> " + s1 + " " + "s2 -> " + s2);
		 */
		//not using third variable
		  String  s1="Java";
		  String s2="Selenium";
		  //String temp ="";
		  		  
		  System.out.println("Before swapping :"   +s1);
		  System.out.println("Before swapping :"   +s2);
		  s1=s1+s2;//JavaSelenium
		  s2=s1.substring(0, s1.length()-s2.length());//java(initial value of s1)
		  s1=s1.substring(s2.length());//selenium (initial value of s2)
		  System.out.println("After swapping :"  +s1);
		  System.out.println("After swapping :"  +s2);
	}

}
