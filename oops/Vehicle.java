package oops;

//Super Class
public class Vehicle {
	
public void applyBrake()
{
	System.out.println("applied brake");
}

public void soundHorn()
{
	System.out.println("Sound of Horn");
}
	public static void main(String[] args) {
		
		Vehicle ve = new Vehicle();
		ve.applyBrake();
		ve.soundHorn();
	}

}
