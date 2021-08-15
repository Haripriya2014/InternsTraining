package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resolve extends BaseClass {

	 @When("Change the state to Resolved")
	 public void changeState()
	 {
		    WebElement stateElement = driver.findElementById("incident.state");
			Select dd1 = new Select(stateElement);
			dd1.selectByVisibleText("Resolved");
	 }
	
	 @And("Update the description")
	 public void updateDesc() throws InterruptedException
	 {
		    driver.findElementById("activity-stream-textarea").sendKeys("Ticket is Resolved");
			Thread.sleep(2000);
			driver.findElementById("sysverb_update_bottom").click();
		 
	 }
	
	
	 @Then("Check state is updated")
	 public void checkState()
	 {
		 driver.findElementByXPath("//a[@class='linked formlink']").click();
		 String stateElement1 = driver.findElementById("incident.state").getText();
			
		 if(stateElement1.contains("Resolved")) {
				 System.out.println("Incident is Resolved");
				 }
		 else {
				 System.out.println("Incident is not Resolved");
				 }
				 
	 }
}
