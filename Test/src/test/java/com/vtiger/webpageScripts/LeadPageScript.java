/**
 * 
 */
package com.vtiger.webpageScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.utility.BaseUtility;
import com.vtiger.webpages.CreatLoadPage;

/**
 * @author Akshay
 *
 */
public class LeadPageScript

{	
	@Test(priority=3)
	public void leadModify() throws InterruptedException
	{
		
			System.out.println("Into the Modify Method");
			BaseUtility.driver.navigate().refresh();
			BaseUtility.sleep();
		//Clicking on Menu>Marketing
		BaseUtility.driver.findElement(CreatLoadPage.menuButton).click();
		BaseUtility.driver.findElement(CreatLoadPage.marketModule).click();
		
		
		//Click on Leads
		BaseUtility.driver.findElement(CreatLoadPage.lead).click();
		BaseUtility.sleep();
		WebElement Leadname =BaseUtility.driver.findElement(CreatLoadPage.leadFinding);
		BaseUtility.sleep();
		
	//System.out.println("validation Started");
	
	System.out.println("\nLead name is: "+Leadname.getText());
	if(Leadname.getText().equals(BaseUtility.getInputFromPropertyFile("firstname")))
	{
		System.out.println("\n Link Validation Successful");
	}
	else
	{
		System.out.println("\n Link Validation UnSuccessful");
	}
	BaseUtility.driver.findElement(CreatLoadPage.leadFinding).click();
	BaseUtility.sleep();
	
	
	BaseUtility.driver.findElement(CreatLoadPage.commentBox).sendKeys(BaseUtility.getInputFromPropertyFile("commentToBeSend"));
	System.out.println("\n Text Typed Successfully");
	BaseUtility.sleep();
	BaseUtility.driver.findElement(CreatLoadPage.postButton).click();
	
	//Validating Comments
	WebElement comments = BaseUtility.driver.findElement(CreatLoadPage.comment);
	System.out.println("Comments Enter is :-"+comments.getText());
	if(comments.getText().equals(BaseUtility.getInputFromPropertyFile("commentToBeSend")))
	{
		System.out.println("\nComment Validation Done Successfully");
	}
	else 
	{
		System.out.println("\nUnsuccessFull Attempt");
	}
	
	BaseUtility.sleep();

	}
		
}


