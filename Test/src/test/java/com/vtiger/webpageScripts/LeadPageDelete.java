/**
 * 
 */
package com.vtiger.webpageScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.utility.BaseUtility;
import com.vtiger.webpages.CreatLoadPage;
import com.vtiger.webpages.DeleteLead;

/**
 * @author Akshay
 *
 */
public class LeadPageDelete
{	
	@Test(priority=4)
	public void deleteLead()
	{
		try {
		System.out.println("In to the Delete Page");
		BaseUtility.sleep();
		//Clicking on Menu>Marketing
		BaseUtility.driver.findElement(CreatLoadPage.menuButton).click();
		BaseUtility.driver.findElement(CreatLoadPage.marketModule).click();
		
		//Click on Leads	
		BaseUtility.driver.findElement(CreatLoadPage.lead).click();
			
	//click on Check Box of Newly created Lead
		BaseUtility.driver.findElement(DeleteLead.checkBox).click();
		

	//Clicking on Delete Button
	BaseUtility.driver.findElement(DeleteLead.deleteButton).click();
		BaseUtility.sleep();
	
	//Clicking Yes on Confirmation Pop-Up 
		BaseUtility.driver.findElement(DeleteLead.confirmYesButton).click();
		
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Lead Deleted Sucessfully");
		BaseUtility.CleanUp();
	}
}
