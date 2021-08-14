package servicenow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeTC001 {

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
		//Get Change number 
		String number = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		System.out.println(number); 

		//check both the change numbers
		if(number.equals(changeNumber))
			System.out.println("New Change is created successfully"); 
		else
			System.out.println("New Change is not created");


	}

}
