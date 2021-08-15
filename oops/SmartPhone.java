package oops;

//MethodOverriding
public class SmartPhone extends AndroidPhone{
	public void connectWhatsApp()
	{
		System.out.println("Connect WhatsApp");
	}
	public void takeVideo()
	{
		System.out.println("Take Video in Smartphone");
	}
	

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
		
		

	}

}
