package servicenow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC005 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Login
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("m3GkKEKU8atr");
		driver.findElementById("sysverb_login").click();
		//Click Incidents
		driver.findElementById("filter").sendKeys("incident");		
		driver.findElementByXPath("//div[text()='Incidents']").click();
		//Click New
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_new").click();
		//Get incident number
		String incidentNumber = driver.findElementById("incident.number").getAttribute("value");
		System.out.println(incidentNumber);
		//Fill the details
		driver.findElementById("incident.short_description").sendKeys("New Incident");
		driver.findElementByXPath("(//button[text( )='Submit'])[2]").click();
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(incidentNumber,Keys.ENTER);
		Thread.sleep(2000); 
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		driver.findElementById("sysverb_delete_bottom").click();
		driver.findElementById("ok_button").click();
		String text = driver.findElementByXPath("//table[@id='incident_table']//tr[1]/td[1]").getText(); 
		System.out.println(text);
		 
	}

}
