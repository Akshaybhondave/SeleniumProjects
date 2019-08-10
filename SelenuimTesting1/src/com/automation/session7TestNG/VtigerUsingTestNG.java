package com.automation.session7TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VtigerUsingTestNG 
{

WebDriver cdriver;
Actions action;

@BeforeTest
public void browserOpening()
{
System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
//System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
cdriver= new ChromeDriver();
//cdriver= new FirefoxDriver();
cdriver.manage().window().maximize();
cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
cdriver.manage().window().maximize();


//cdriver.get("https://demo.vtiger.com");
cdriver.get("https://demo.vtiger.com/vtigercrm/");

WebDriverWait wait = new WebDriverWait(cdriver, 30);
wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("button[class = 'button buttonBlue']")));
//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Try Open Source")));
//cdriver.findElement(By.linkText("Try Open Source")).click();
System.out.println("Opening Vtiger");
}


@BeforeMethod

public void userLogin()
{
//Entering UserName 
WebElement username = cdriver.findElement(By.id("username"));
username.sendKeys("admin");

//Entering Password and Entering so that user gets logged ON
WebElement password = cdriver.findElement(By.id("password"));
password.sendKeys("admin");

WebElement Button = cdriver.findElement(By.cssSelector("button[class = 'button buttonBlue']"));
cdriver.findElement(By.cssSelector("button[class = 'button buttonBlue']")).click();

System.out.println("Login Successful");

}

@Test (priority =1)
public void leadCreation() throws InterruptedException
{
	//Opening menubar quickCreate
	cdriver.findElement(By.cssSelector("a[id='menubar_quickCreate']")).click();
	//Clicking on Leads
	cdriver.findElement(By.cssSelector("div >a[id= 'menubar_quickCreate_Leads']")).click();

	//Selecting from dropdown
		cdriver.findElement(By.linkText("None")).click();
		cdriver.findElement(By.cssSelector("div#select2-drop li:nth-of-type(2) div")).click();
		
		//Filling All Details 
		cdriver.findElement(By.name("firstname")).sendKeys("White");
		cdriver.findElement(By.name("lastname")).sendKeys("Devil");
		cdriver.findElement(By.name("phone")).sendKeys("2233665588");
		cdriver.findElement(By.name("company")).sendKeys("Mind-Your-Own-Business	");
		cdriver.findElement(By.name("email")).sendKeys("DonjenMaster@hotmail.com");
		cdriver.findElement(By.linkText("Administrator")).click()	;
		cdriver.findElement(By.cssSelector("div#select2-drop>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>div")).click();
		cdriver.findElement(By.name("saveButton")).click();
	
		System.out.println("\nLead Created ");
		Thread.sleep(4000);
}


	@Test (priority =2)
	public void leadModify() throws InterruptedException
	{
		Thread.sleep(2000);
		//Clicking on Menu>Marketing
		cdriver.findElement(By.xpath("//div[@id='appnavigator']")).click();
		cdriver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		
		//Click on Leads	
		cdriver.findElement(By.cssSelector("ul.module-qtip:nth-child(2) li>a>span")).click();
		Thread.sleep(2000);
		
	WebElement name = cdriver.findElement(By.xpath("//a[text()='White']"));
	Thread.sleep(2000);
	//System.out.println("validation Started");
	
	System.out.println("\nLead name is: "+name.getText());
	if(name.getText().equals("White"))
	{
		System.out.println("\n Link Validation Successful");
	}
	else
	{
		System.out.println("\n Link Validation UnSuccessful");
	}
	
	cdriver.findElement(By.xpath("//a[text()='White']")).click();
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
	//cdriver.navigate().back();
	//cdriver.navigate().refresh();
	Thread.sleep(2000);

	}	
	
	@Test(priority = 3)
	
	public void leadDelete() throws InterruptedException
	{
		Thread.sleep(2000);
		//Clicking on Menu>Marketing
		cdriver.findElement(By.xpath("//div[@id='appnavigator']")).click();
		cdriver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		
		//Click on Leads	
		cdriver.findElement(By.cssSelector("ul.module-qtip:nth-child(2) li>a>span")).click();
			
	//click on Check Box of Newly created Lead
	cdriver.findElement(By.xpath("//input[@class='listViewEntriesCheckBox']")).click();
	Thread.sleep(2000);

	//Clicking on Delete Button
	cdriver.findElement(By.xpath("//button[@id='Leads_listView_massAction_LBL_DELETE']")).click();
	Thread.sleep(2000);
	
	//Clicking Yes on Confirmation Pop-Up 
	cdriver.findElement(By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")).click();
	Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		Thread.sleep(4000);
		cdriver.findElement(By.cssSelector("a.userName.dropdown-toggle")).click();
		
		cdriver.findElement(By.linkText("Sign Out")).click();
		
		System.out.println("\nSuccesfully Signed-Out..");
		
	}
		
	@AfterTest
	public void browserClose()
	{
		cdriver.close();
		System.out.println("\nBrowser Closed Successfully");
	}
		
	}
 
