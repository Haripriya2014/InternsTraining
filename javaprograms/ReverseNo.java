package javaprograms;
import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int num=12345; int orig=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
        System.out.println("Reverse Number : " +rev);
        
              	
	}

}

		/*
		 * int num=0; int rev=0; //Scanner System.out.println("Enter your number: ");
		 * Scanner sc = new Scanner(System.in); num=sc.nextInt(); while(num!=0) {
		 * rev=rev*10+num%10; num=num/10; } System.out.println("Reverse Number : "
		 * +rev);
		 */
