package com.automation.session2;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class ChromeBrowser
{
	void Browsercall() throws InterruptedException
	{
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-7");
		
		/* print page title */
		System.out.println("The Page title is :"+cdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+cdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = cdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay_Bhondave");
		//Thread.sleep(2000);
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = cdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		//Thread.sleep(2000);
		
		/*typing Password in Password Field*/
		WebElement passwordInputField = cdriver.findElement(By.id("pass"));
		passwordInputField.sendKeys("Akshay@26");
		//Thread.sleep(2000);
		
		/*RE-typing Password in Password Field*/
		WebElement rePasswordInputField = cdriver.findElement(By.id("re_pass"));
		rePasswordInputField.sendKeys("Akshay@26");
		
		
		/*Click on I agree all statement*/
		WebElement checkBox = cdriver.findElement(By.className("label-agree-term"));
		checkBox.click();
		Thread.sleep(2000);
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		passwordInputField.clear();
		rePasswordInputField.clear();
		cdriver.close();
	}
}

class FirefoxBrowser 
{
	void Browsercall() throws InterruptedException
	{
		WebDriver fdriver = new FirefoxDriver();

		fdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-7");
		
		/* print page title */
		System.out.println("The Page title is :"+fdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+fdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = fdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay_Bhondave");
		//Thread.sleep(2000);
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = fdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		//Thread.sleep(2000);
		
		/*typing Password in Password Field*/
		WebElement passwordInputField = fdriver.findElement(By.id("pass"));
		passwordInputField.sendKeys("Akshay@26");
		//Thread.sleep(2000);
		
		/*RE-typing Password in Password Field*/
		WebElement rePasswordInputField = fdriver.findElement(By.id("re_pass"));
		rePasswordInputField.sendKeys("Akshay@26");
		
		
		/*Click on I agree all statement*/
		WebElement checkBox = fdriver.findElement(By.className("label-agree-term"));
		checkBox.click();
		Thread.sleep(2000);
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		passwordInputField.clear();
		rePasswordInputField.clear();
		fdriver.close();
		
	}
}


class IEBrowser
{
	void Browsercall() throws InterruptedException
	{
		WebDriver IEdriver = new InternetExplorerDriver();
		IEdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-7");
		/* print page title */
		System.out.println("The Page title is :"+IEdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+IEdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = IEdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay_Bhondave");
		//Thread.sleep(2000);
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = IEdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		//Thread.sleep(2000);
		
		/*typing Password in Password Field*/
		WebElement passwordInputField = IEdriver.findElement(By.id("pass"));
		passwordInputField.sendKeys("Akshay@26");
		//Thread.sleep(2000);
		
		/*RE-typing Password in Password Field*/
		WebElement rePasswordInputField = IEdriver.findElement(By.id("re_pass"));
		rePasswordInputField.sendKeys("Akshay@26");
		
		
		/*Click on I agree all statement*/
		WebElement checkBox = IEdriver.findElement(By.className("label-agree-term"));
		checkBox.click();
		Thread.sleep(2000);
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		passwordInputField.clear();
		rePasswordInputField.clear();
		IEdriver.close();

		
		
	}
}


public class ObjectIdentificationForm7
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	
	
	System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	
	System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
	
	
	
	try
	{
		ChromeBrowser CB1 = new ChromeBrowser();
		FirefoxBrowser FB1 = new FirefoxBrowser();
		IEBrowser IB1 = new IEBrowser();
	
		CB1.Browsercall();
		FB1.Browsercall();
		IB1.Browsercall();
		
	
	} 
	
	catch (InterruptedException e)
	{
		
		System.out.println(e);
	}
}
}
