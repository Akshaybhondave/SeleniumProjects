/**
 * 
 */
package com.vtiger.webpageScripts;

import org.testng.annotations.Test;

import com.vtiger.utility.BaseUtility;
import com.vtiger.webpages.DashBoardPage;

/**
 * @author Akshay
 *
 */
public class DashBoardPageScript
{
	@Test(priority=2)
	public void leadCreation() 
	{
		//BaseUtility.setUp();
		System.out.println("Into the leadCreation Class");
		BaseUtility.driver.findElement(DashBoardPage.leadPlusSign).click();
		BaseUtility.driver.findElement(DashBoardPage.quickCreateLead).click();
		BaseUtility.driver.findElement(DashBoardPage.dropdownselection).click();
		BaseUtility.driver.findElement(DashBoardPage.selectMr).click();
		BaseUtility.driver.findElement(DashBoardPage.firstname).sendKeys(BaseUtility.getInputFromPropertyFile("firstname"));
		BaseUtility.driver.findElement(DashBoardPage.lastname).sendKeys(BaseUtility.getInputFromPropertyFile("lastname"));
		BaseUtility.driver.findElement(DashBoardPage.phone).sendKeys(BaseUtility.getInputFromPropertyFile("phone"));
		BaseUtility.driver.findElement(DashBoardPage.companyname).sendKeys(BaseUtility.getInputFromPropertyFile("companyname"));
		BaseUtility.driver.findElement(DashBoardPage.email).sendKeys(BaseUtility.getInputFromPropertyFile("email"));
		BaseUtility.driver.findElement(DashBoardPage.Administrator).click();
		BaseUtility.driver.findElement(DashBoardPage.Dropdown).click();
		BaseUtility.driver.findElement(DashBoardPage.saveButton).click();
		System.out.println("\nLead Created ");
		try {
		BaseUtility.sleep();
		//BaseUtility.CleanUp();
		
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
