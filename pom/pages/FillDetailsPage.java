package pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class FillDetailsPage extends ProjectSpecificMethods{
	
	//Enter View Name 
	public FillDetailsPage enterName() {
		driver.findElementById("fname").sendKeys("HariPr");
		return this;
	}
	
	//Enter View Unique Name
	public FillDetailsPage enterUniqName() {
		driver.findElementById("devname").sendKeys("HariPr_25");
		return this;
	}
	
	
	//Click on My User Provisioning Requests Under Step two		
    public FillDetailsPage clickUserProv() {
    	driver.findElementByXPath("//label[@for='fscope1']").click();
		return this;
	}		
	
	// Under Field Select First DropDown as Name
    
    public FillDetailsPage selectName() {
    	WebElement name = driver.findElementById("fcol1");
		Select dd = new Select(name);
		dd.selectByVisibleText("Name");
		return this;
	}
	
    // Under Operator Get the List of values availble from dropdown

    public FillDetailsPage getListSize() {
    	WebElement name1 = driver.findElementById("fop1");
		Select dd1 = new Select(name1);
		List<WebElement> list = dd1.getOptions();
        	System.out.println(list.size());
        	for (WebElement eachList : list) {
		System.out.println(eachList.getText());
		}	
	     return this;
    }
			
	// Under Field Select First DropDown as Created Date

     public FillDetailsPage selectCreatedDate() {
    	WebElement name = driver.findElementById("fcol1");
		Select dd = new Select(name);
		dd.selectByVisibleText("Created Date");
	
	return this;
     }
   // Under Step 3 Get the List of Available Fields

    public FillDetailsPage getListSel() {
    	WebElement name2 = driver.findElementByXPath("//select[@multiple='multiple']");
    	Select dd2 = new Select(name2);
    	List<WebElement> list1 = dd2.getOptions();
    	System.out.println(list1.size());
    	for (WebElement eachList1 : list1) {
    		System.out.println(eachList1.getText());
 		}
         return this;
}

			//Under Step 3 Get the List of Selected Fields

  public FillDetailsPage getListAvail() {
	 WebElement name3 = driver.findElementByXPath("(//select[@multiple='multiple'])[2]");
     Select dd3 = new Select(name3);
		List<WebElement> list2 = dd3.getOptions();
     System.out.println(list2.size());
     for (WebElement eachList2 : list2) {
			System.out.println(eachList2.getText());
		}
	return this;
  }
		// Select an Option From Available Field  and Click Add Option 
    public FillDetailsPage selectOption() {
    	WebElement name2 = driver.findElementByXPath("//select[@multiple='multiple']");
    	Select dd2 = new Select(name2);
    	dd2.selectByValue("AppName");
	return this;
    }
	
	// Click on Visible to All Users 
   public FillDetailsPage clickAllUsers() {
	   driver.findElementByXPath("//b[text()='all users']").click();
	return this;
   }
	
   //Click on Save

    public MyHomePage clickSave() {
	  driver.findElementByXPath("(//input[@name='save'])[2]").click();
	   return new MyHomePage();
    }
	
	

}
