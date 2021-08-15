package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete extends BaseClass {
	

	
	@Given("Check the incident number")
	public void check() {
		driver.findElementByXPath("//a[@class='linked formlink']").click();
	}
	@When("Click Delete button")
	public void del() {
		driver.findElementById("sysverb_delete_bottom").click();
	}
	
	@And("Click Ok button")
	public void ok() {
		driver.findElementById("ok_button").click();
	}
	@Then("Check whether the incident is deleted")
	public void chec()
	{
		String text = driver.findElementByXPath("//table[@id='incident_table']//tr[1]/td[1]").getText(); 
		System.out.println(text);
	}
	

	 
}
