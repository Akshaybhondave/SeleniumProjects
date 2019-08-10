package com.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class ActiTime 
{
	void FFbrowserCall() throws InterruptedException 

	{
		/*Opening Site in FF browser*/
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://demo.actitime.com/login.do");
		
		//String CurrentUrl = fdriver.getCurrentUrl();
		//System.out.println("Login Page URL is :"+CurrentUrl);
		
		//String pageTitle = fdriver.getTitle();
		//System.out.println("Current Page Titile is :"+pageTitle);
		
		/*Entering username in Username field*/
		WebElement userNameInput = fdriver.findElement(By.id("username"));
		userNameInput.sendKeys("admin");
		
		/*Entering password in password field*/
		WebElement passwordInput = fdriver.findElement(By.name("pwd"));
		passwordInput.sendKeys("manager");
		
		
		/*Check Box Check*/
		WebElement keepLoginCheckBox = fdriver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoginCheckBox.click();
		
		Thread.sleep(2000);
		/*Login Button Click*/
		WebElement loginButton = fdriver.findElement(By.id("loginButton"));
		loginButton.click();
		
		
		
		String urlAfterLogin = fdriver.getCurrentUrl();
		System.out.println("URL after Login :"+urlAfterLogin);
		
		
	
		String pageTitleAfterLogin = fdriver.getTitle();
		Thread.sleep(3000);
		System.out.println("Page Title after Login is "+pageTitleAfterLogin);
		/*
		if (pageTitle.equals(pageTitleAfterLogin))
			
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("ABC");
		}
		//fdriver.close();
		*/
		 
		
	}
 
	void ChromeCall() throws InterruptedException 
	{
		/*Opening Site in FF browser*/
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://demo.actitime.com/login.do");
		
		//String CurrentUrl = cdriver.getCurrentUrl();
		//System.out.println("Login Page URL is :"+CurrentUrl);
		
		//String pageTitle = cdriver.getTitle();
		//System.out.println("Current Page Titile is :"+pageTitle);
		
		/*Entering username in Username field*/
		WebElement userNameInput = cdriver.findElement(By.id("username"));
		userNameInput.sendKeys("admin");
		
		/*Entering password in password field*/
		WebElement passwordInput = cdriver.findElement(By.name("pwd"));
		passwordInput.sendKeys("manager");
		
		
		/*Check Box Check*/
		WebElement keepLoginCheckBox = cdriver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoginCheckBox.click();
		
		Thread.sleep(2000);
		/*Login Button Click*/
		WebElement loginButton = cdriver.findElement(By.id("loginButton"));
		loginButton.click();
		
		
		
		String urlAfterLogin = cdriver.getCurrentUrl();
		System.out.println("URL after Login :"+urlAfterLogin);
		
		
	
		String pageTitleAfterLogin = cdriver.getTitle();
		Thread.sleep(3000);
		System.out.println("Page Title after Login is "+pageTitleAfterLogin);
		/*
		if (pageTitle.equals(pageTitleAfterLogin))
			
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("ABC");
		}
		//cdriver.close();
		 */
	}
	
}

		
public class ActitimeTest 
{

	public static void main(String[] args)
	{
		try
		{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
		
		ActiTime AT1 = new ActiTime();
		AT1.FFbrowserCall();
		AT1.ChromeCall();

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
