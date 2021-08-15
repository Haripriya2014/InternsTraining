package oops;

//Sub Class2 - Multi-Level Inheritance
public class Audi extends Car{
public void airBag() {
	System.out.println("air bag");
}
public void cruiseControl() {
	System.out.println("cruise control");
}

public static void main(String[] args) {
	Audi au = new Audi();
	au.applyBrake();
	au.soundHorn();
	au.airConditioner();
	au.seatBelt();
	au.airBag();
	au.cruiseControl();
}
}
