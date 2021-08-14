package servicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeTC002 {

	public static void main(String[] args) {
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
		//Enter Change,click Create New
		driver.findElementById("filter").sendKeys("Change");
		driver.findElementByXPath("(//div[text()='Create New'])[3]").click(); 
		driver.switchTo().frame("gsft_main");
		//Click Normal Change
		driver.findElementByXPath("//span[text()='ITIL Mode 1 Normal Change']").click(); 
		//Get Change number 
		String  changeNumber =  driver.findElementById("change_request.number").getAttribute("value");
		System.out.println("Change Number : " +changeNumber);
		driver.findElementById("change_request.short_description").sendKeys("New Change Request");
		driver.findElementById("sysverb_insert_bottom").click();
		driver.switchTo().defaultContent();
		//Click open,search change
		driver.findElementByXPath("(//div[text()='Open'])[3]").click();
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@class='form-control']").sendKeys(changeNumber,Keys.ENTER);
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		WebElement state = driver.findElementById("change_request.state");
		Select dd = new Select(state);
		dd.selectByVisibleText("Assess");
		driver.findElementById("lookup.change_request.assignment_group").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandle = new ArrayList<String>(windowHandles);
		String secondHandle = listHandle.get(1);
		driver.switchTo().window(secondHandle);
		//driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input").sendKeys("Software",Keys.ENTER);
		driver.findElementByXPath("//a[text()='Software']").click();
		driver.switchTo().window(listHandle.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElementById("lookup.change_request.assigned_to").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listHandle1 = new ArrayList<String>(windowHandles1);
		String secondHandle1 = listHandle1.get(1);
		driver.switchTo().window(secondHandle1);
		driver.findElementByXPath("//div[@class='input-group']//input[1]").sendKeys("ITIL User",Keys.ENTER);
		driver.findElementByXPath("//a[text( )='ITIL User']").click();
		driver.switchTo().window(listHandle.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_update_bottom").click();
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		String stateValue = driver.findElementById("change_request.state").getText();
		String group = driver.findElementById("sys_display.change_request.assignment_group").getAttribute("value");
		String assignee = driver.findElementById("sys_display.change_request.assigned_to").getAttribute("value");
		
		//verifying
		if (stateValue.contains("Assess"))
		System.out.println("State is Assess");
		else
		System.out.println("State is not Assess");
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
