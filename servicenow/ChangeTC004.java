package servicenow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeTC004 {

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
		driver.findElementById("sysverb_delete_bottom").click();
		driver.findElementById("ok_button").click();
		String text = driver.findElementByXPath("//table[@id='change_request_table']//tr[1]/td[1]").getText(); 
		System.out.println(text);
		
}
	}
