package oops;

//Interface - implementation class
public class Desktop implements Software {
	public void desktopModel() {
		System.out.println("Desktop Model");
	}
	
	
public void hardwareResources() {
	System.out.println("RAM");
	
}

public void softwareResources() {
	System.out.println("Application");
	
}
	
public static void main(String[] args) {
	Desktop de =new Desktop();
	de.desktopModel();
	de.hardwareResources();
	de.softwareResources();
	
	}

}
