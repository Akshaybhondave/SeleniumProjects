package com.automation.session5;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



class Test
{
	
	void validation() throws InterruptedException
	{
		try
		{
		WebDriver cdriver= new FirefoxDriver();
		
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cdriver.manage().window().setSize(new Dimension(400,400));
		cdriver.manage().window().maximize();
		cdriver.get("https://demo.vtiger.com/vtigercrm/");
		System.out.println("Opening Vtiger");
		
		//Entering UserName 
		WebElement username = cdriver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		//Entering Password and Entering so that user gets logged ON
		WebElement password = cdriver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		//Without locating Sign In Button Directly Login By Pressing Enter(Key Board Operations)
		//password.sendKeys("admin",Keys.ENTER);
		
		//Validating Sign In Button and Clicking on Sign In button Exeplicitly
		WebElement Button = cdriver.findElement(By.cssSelector("button[class = 'button buttonBlue']"));
		System.out.println("Sign_in_Button_isDisplayed ?:-"+Button.isDisplayed() + 
				" \n Sign_in_Button_isEnabled ?:- "+Button.isEnabled());
				cdriver.findElement(By.cssSelector("button[class = 'button buttonBlue']")).click();	
		
				//Opening menubar quickCreate
		cdriver.findElement(By.cssSelector("a[id='menubar_quickCreate']")).click();
		//Clicking on Leads
		cdriver.findElement(By.cssSelector("div >a[id= 'menubar_quickCreate_Leads']")).click();
		
		//Selecting from dropdown
				cdriver.findElement(By.linkText("None")).click();
				cdriver.findElement(By.cssSelector("div#select2-drop li:nth-of-type(2) div")).click();
				
		//Filling All Details 
				cdriver.findElement(By.name("firstname")).sendKeys("Akshay");
				cdriver.findElement(By.name("lastname")).sendKeys("Bhondave");
				cdriver.findElement(By.name("phone")).sendKeys("8888333759");
				cdriver.findElement(By.name("company")).sendKeys("Mindtree");
				cdriver.findElement(By.name("email")).sendKeys("MindTreeMinds@gmail.com");
				cdriver.findElement(By.linkText("Administrator")).click()	;
				cdriver.findElement(By.cssSelector("div#select2-drop>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>div")).click();
				cdriver.findElement(By.name("saveButton")).click();
			
				System.out.println("\nLead Created ");
				
				Thread.sleep(2000);
				//Clicking on Menu>Marketing
				cdriver.findElement(By.xpath("//div[@id='appnavigator']")).click();
				cdriver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
				
			//Click on Leads	
				cdriver.findElement(By.cssSelector("ul.module-qtip:nth-child(2) li>a>span")).click();
				Thread.sleep(2000);
			
			//Validating Leads	
				WebElement name = cdriver.findElement(By.xpath("//a[text()='Akshay']"));
				Thread.sleep(2000);
				//System.out.println("validation Started");
				
				System.out.println("\nLead name is: "+name.getText());
				if(name.getText().equals("Akshay"))
				{
					System.out.println("\n Link Validation Successful");
				}
				else
				{
					System.out.println("\n Link Validation UnSuccessful");
				}
				
				cdriver.findElement(By.xpath("//a[text()='Akshay']")).click();
				Thread.sleep(2000);		
				String commentToBeSend = "Hi All";
				cdriver.findElement(By.xpath("//textarea[@placeholder='Post your comment here']"))
				.sendKeys(commentToBeSend);
				System.out.println("\n Text Typed Successfully");
				
				Thread.sleep(2000);
				cdriver.findElement(By.xpath("//div[@class ='col-xs-6 pull-right paddingTop5 paddingLeft0']"
						+ "//div//Button[@type='button']")).click();;
				
				//Validating Comments
				WebElement comments = cdriver.findElement(By.xpath("//span[@class='commentInfoContent']"));
				System.out.println("Comments Enter is :-"+comments.getText());
				if(comments.getText().equals(commentToBeSend))
				{
					System.out.println("\nComment Validation Done Successfully");
				}
				else 
				{
					System.out.println("\nUnsuccessFull Attempt");
				}
				
				
				//Navigating to Back Page and Refreshing Page
				cdriver.navigate().back();
					cdriver.navigate().refresh();
					Thread.sleep(2000);
		
				//click on Check Box of Newly created Lead
				cdriver.findElement(By.xpath("//input[@class='listViewEntriesCheckBox']")).click();
				Thread.sleep(2000);
		
				//Clicking on Delete Button
				cdriver.findElement(By.xpath("//button[@id='Leads_listView_massAction_LBL_DELETE']")).click();
				Thread.sleep(2000);
				
				//Clicking Yes on Confirmation Pop-Up 
				cdriver.findElement(By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")).click();
				Thread.sleep(2000);
		
				//Recheking whether Lead is Deleted or Not
				//boolean reCheck = cdriver.findElement(By.xpath("//a[text()='Akshay']")).isDisplayed();
				//System.out.println(reCheck);
			
				System.out.println("\nScript Run Successfully");
				
				
				cdriver.findElement(By.cssSelector("a.userName.dropdown-toggle")).click();
				
				cdriver.findElement(By.linkText("Sign Out")).click();
				
				System.out.println("\nSuccesfully Signed-Out..");
				
				cdriver.close();
				System.out.println("\nBrowser Closed Successfully");
		
	}
	catch (Exception e)
	{
		System.out.println(e);
	}

	}

}

public class VtigerEndtoEnd 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	//System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
	
	Test T1 = new Test();
	T1.validation();
	
}
}
