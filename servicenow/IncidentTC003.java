package servicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC003 {

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
		driver.findElementById("filter").sendKeys("incident");	
		//click open
		driver.findElementByXPath("(//div[text() ='Open'])[1]").click();
		driver.switchTo().frame("gsft_main");
		//search for incident
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0000017", Keys.ENTER);
		driver.findElementByXPath("//a[@class='linked formlink']").click();	
		//assignment group 
		driver.findElementById("lookup.incident.assignment_group").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandle = new ArrayList<String>(windowHandles);
		String secondHandle = listHandle.get(1);
		driver.switchTo().window(secondHandle);
		driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input").sendKeys("Software",Keys.ENTER);
		driver.findElementByXPath("//a[text()='Software']").click();
		driver.switchTo().window(listHandle.get(0));
		driver.switchTo().frame("gsft_main");
		String group = driver.findElementById("sys_display.incident.assignment_group").getAttribute("value");
		//assignee
		driver.findElementById("lookup.incident.assigned_to").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listHandle1 = new ArrayList<String>(windowHandles1);
		String secondHandle1 = listHandle1.get(1);
		driver.switchTo().window(secondHandle1);
		driver.findElementByXPath("//div[@class='input-group']//input[1]").sendKeys("ITIL User",Keys.ENTER);
		driver.findElementByXPath("//a[text( )='ITIL User']").click();
		driver.switchTo().window(listHandle.get(0));
		driver.switchTo().frame("gsft_main");
		String assignee = driver.findElementById("sys_display.incident.assigned_to").getAttribute("value");
		//verifying 
		if (group.equals("Software"))
		System.out.println("Assigned to Software group");
		 else
		System.out.println("Not assigned to Software group"); 
		if(assignee.equals("ITIL User")) 
		System.out.println("Assigned to ITIL User");
		 else
		System.out.println("Not assigned to ITIL User");
		
					
	}
	
}
