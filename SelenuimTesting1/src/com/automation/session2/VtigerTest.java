package com.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class ChromeBrowserCall
{
	void chrome() throws InterruptedException
	{
		
		
		System.out.println("Staring Execution On Chrome\n");
		WebDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://demo.vtiger.com/vtigercrm/");
		
		String pageTitle = cdriver.getTitle();
		System.out.println("\nThe Current Page Title is "+pageTitle);
		
		String pageURL = cdriver.getCurrentUrl();
		System.out.println("\nThe Current Page URL is :"+pageURL);
		
		WebElement userName = cdriver.findElement(By.id("username"));
		userName.sendKeys("admin");
	
		WebElement password = cdriver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		WebElement signInButton = cdriver.findElement(By.className("button"));
		signInButton.click();
	
		Thread.sleep(3000);
		String pageTitleAfterLogin = cdriver.getTitle();
		System.out.println("\n The Current Page Title is "+pageTitleAfterLogin);
		
		String pageURLAfterLogin = cdriver.getCurrentUrl();
		System.out.println("\n The Current Page URL is :"+pageURLAfterLogin);
		
		if(pageTitle.equals(pageURLAfterLogin)) 
		{
			System.out.println("Pass : Same Titles");
		}
		else
		{
			System.out.println("Fail : Different Titles");	
		}
		
		cdriver.close();
		System.out.println("########################################################################################");
	}
}


class FirefoxCall
{
	void fireFox() throws InterruptedException
	{
		System.out.println("\n Starting Execution on FireFox");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://demo.vtiger.com/vtigercrm/");
		
		String pageTitle = fdriver.getTitle();
		System.out.println("\n The Current Page Title is "+pageTitle);
		
		String pageURL = fdriver.getCurrentUrl();
		System.out.println("\n The Current Page URL is :"+pageURL);
		
		WebElement userName = fdriver.findElement(By.id("username"));
		userName.sendKeys("admin");
	
		WebElement password = fdriver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		WebElement signInButton = fdriver.findElement(By.className("button"));
		signInButton.click();
	
		Thread.sleep(3000);
		String pageTitleAfterLogin = fdriver.getTitle();
		System.out.println("\n The Current Page Title is "+pageTitleAfterLogin);
		
		String pageURLAfterLogin = fdriver.getCurrentUrl();
		System.out.println("\n The Current Page URL is :"+pageURLAfterLogin);
		
		if(pageTitle.equals(pageURLAfterLogin)) 
		{
			System.out.println("Pass : Same Titles");
		}
		else
		{
			System.out.println("Fail : Different Titles");	
		}
		
		fdriver.close();
		System.out.println("########################################################################################");
	}
}

class IE
{
	void iE() throws InterruptedException
	{
		
		System.out.println("\n Starting Execution on IE ");
		WebDriver IEdriver = new InternetExplorerDriver();
		
		IEdriver.get("https://demo.vtiger.com/vtigercrm/");
		
		String pageTitle = IEdriver.getTitle();
		System.out.println("\n The Current Page Title is "+pageTitle);
		
		String pageURL = IEdriver.getCurrentUrl();
		System.out.println("\n The Current Page URL is :"+pageURL);
		
		WebElement userName = IEdriver.findElement(By.id("username"));
		userName.sendKeys("admin");
	
		WebElement password = IEdriver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		WebElement signInButton = IEdriver.findElement(By.className("button"));
		signInButton.click();
	
		Thread.sleep(3000);
		String pageTitleAfterLogin = IEdriver.getTitle();
		System.out.println("\n The Current Page Title is "+pageTitleAfterLogin);
		
		String pageURLAfterLogin = IEdriver.getCurrentUrl();
		System.out.println("\n The Current Page URL is :"+pageURLAfterLogin);
		
		if(pageTitle.equals(pageURLAfterLogin)) 
		{
			System.out.println("Pass : Same Titles");
		}
		else
		{
			System.out.println("Fail : Different Titles");	
		}
		
		IEdriver.close();
		System.out.println("########################################################################################");
	}
}
public class VtigerTest {

	public static void main(String[] args)
	{
		try
		{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
		
		ChromeBrowserCall C = new ChromeBrowserCall();
		C.chrome();
		FirefoxCall F = new FirefoxCall();
		F.fireFox();
		IE Ie = new IE();
		Ie.iE();

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}


