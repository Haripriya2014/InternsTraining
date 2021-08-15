package oops;

//MethodOverloading
public class EmployeeDetails {
	public void findDetails(String name)
	{
	System.out.println("Employee info: "  +name);	
	}
	public void findDetails(int empno)
	{
	System.out.println("Employee info: "  +empno);	
	}
	public void findDetails(int empId,String name)
	{
		System.out.println("Employee info: "  +empId+ "" +name);
	}
	public void findDetails(String email,int phno)
	{
		System.out.println("Employee info: "  +email+  ""  +phno);
	}
	public static void main(String[] args) {
		
		EmployeeDetails ed =new EmployeeDetails();
		ed.findDetails("Hari");
		ed.findDetails(100);
		ed.findDetails(200, "Hari");
		ed.findDetails("hari@gmail.com", 98454326);
	} 

}
