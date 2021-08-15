package javaprograms;

public class Triangle {
	
	public static void main(String[] args) {
			
			int row=5;
			for(int i=0;i<row;i++)
			{
				for(int j=row-i;j>1;j--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();

			}
		}
}
		
		/*
		 * int n = 5;
		 * 
		 * 
		 * int i, j; // outer loop to handle number of rows // n in this case for(i=0;
		 * i<n; i++){ // inner loop to handle number of columns // values changing
		 * according to outer loop for(j=0; j<=i; j++){ // printing stars
		 * System.out.print("* "); }
		 * 
		 * // ending line after each row System.out.println();
		 * 
		 * }
		 */
	


