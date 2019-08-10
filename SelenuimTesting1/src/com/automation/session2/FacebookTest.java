package com.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FacebookCall
{
	void call() throws InterruptedException
	{
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		
		/* print page title */
		System.out.println("The Page title is :"+cdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+cdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = cdriver.findElement(By.name("firstname"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay ");
		Thread.sleep(2000);
		
		/*Typing Name in surname field Element */
		WebElement lastNameInputField = cdriver.findElement(By.name("lastname"));
		lastNameInputField.sendKeys("Bhondave");
		Thread.sleep(2000);
		
		/*Typing Name in email or mobile field Element */
		WebElement regEmailInputField = cdriver.findElement(By.name("reg_email__"));
		regEmailInputField.sendKeys("8888333759");
		Thread.sleep(2000);
		
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = cdriver.findElement(By.name("reg_passwd__"));
		emailInputField.sendKeys("akshay@26");
		Thread.sleep(2000);
		
		
	
		/*selection of Radio Button */
		
		WebElement radiomaleInputField = cdriver.findElement(By.id("u_0_7"));
		//WebElement radiofemaleInputField = cdriver.findElement(By.id("u_0_6"));
		radiomaleInputField.click();
		//radiofemaleInputField.click();
		Thread.sleep(2000);
}


}



public class FacebookTest 
{
	public static void main(String[] args) 
		
	
	{
		
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			
			
			//System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
			
			//System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
			
			
			
			try
			{
				FacebookCall FBC1 = new FacebookCall();
				//ChromeBrowser1 CB1 = new ChromeBrowser1();
				//FirefoxBrowser1 FB1 = new FirefoxBrowser1();
				//IEBrowser1 IB1 = new IEBrowser1();
			
				FBC1.call();
				//FB1.Browsercall();
				//IB1.Browsercall();
				
			
			} 
			
			catch (InterruptedException e)
			{
				
				System.out.println(e);
			}
		}
	
}

