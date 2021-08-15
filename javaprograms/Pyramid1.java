package javaprograms;

public class Pyramid1 {
	public static void main(String args[])   {

		//i - rows ,j - columns      
		//row - no of rows to print  
		int i, j, row = 5;       

		for (i=row; i>=0; i--)   
		{  

			for (j=row-i; j>1; j--)   
			{  

				System.out.print(" ");   
			}   

			for (j=0; j<=i; j++ )   
			{   

				System.out.print("* ");   
			}   

			System.out.println();   
		}   
	}   

}
