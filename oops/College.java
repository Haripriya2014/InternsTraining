package oops;

//Abstract Method - implementation 
public class College extends University{
	@Override
	public void ug() {
		System.out.println("Under Graduation");
		
	}

	public static void main(String[] args) {
		College co = new College();
		co.ug();
		co.pg();

	}

}
