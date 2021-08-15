package oops;

//Method Overloading
public class Calculator {
	public void add(int n1,int n2)
	{
	System.out.println(n1+n2);	
	}
	public void add(int n1,int n2,int n3)
	{
	System.out.println(n1+n2+n3);	
	}
	public void multiply(int n1,int n2)
	{
	System.out.println(n1*n2);	
	}
	public void multiply(int n1,double n2)
	{
	System.out.println(n1*n2);	
	}
	public void sub(int n1,int n2)
	{
	System.out.println(n1-n2);	
	}
	public void sub(double n1,double n2)
	{
	System.out.println(n1-n2);	
	}
	public void div(int n1,int n2)
	{
	System.out.println(n1/n2);	
	}
	public void div(double n1,int n2)
	{
	System.out.println(n1/n2);	
	}
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.add(10, 20);
		ca.add(10, 20, 30);
		ca.multiply(10, 20);
		ca.multiply(10, 20.101);
		ca.sub(20, 10);
		ca.sub(20.10, 10);
		ca.div(20, 10);
		ca.div(20.20, 10);

	}

}
