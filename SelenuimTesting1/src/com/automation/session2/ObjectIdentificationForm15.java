package com.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class ChromeBrowser1
{
	void Browsercall() throws InterruptedException
	{
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-15");
		
		/* print page title */
		System.out.println("The Page title is :"+cdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+cdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = cdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay ");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement fatherNameInputField = cdriver.findElement(By.id("father_name"));
		fatherNameInputField.sendKeys("Bhausaheb");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement addressInputField = cdriver.findElement(By.id("address"));
		addressInputField.sendKeys("New sangvi , Pune");
		Thread.sleep(2000);
		
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = cdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		Thread.sleep(2000);
		
		
		/*Typing in DOB Field*/
		WebElement DOBInputField = cdriver.findElement(By.name("birth_date"));
		DOBInputField.sendKeys("26/06/1996");
		Thread.sleep(2000);
		
		
		/*Typing in pincode Field*/
		WebElement pincodeInputField = cdriver.findElement(By.id("pincode"));
		pincodeInputField.sendKeys("411057");
	
		/*selection of Radio Button 
		//WebElement radiomaleInputField = cdriver.findElement(By.id("male"));
		WebElement radiofemaleInputField = cdriver.findElement(By.id("female"));
		radiofemaleInputField.click();
		Thread.sleep(2000);*/
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		fatherNameInputField.clear();
		addressInputField.clear();
		pincodeInputField.clear();
		DOBInputField.clear();
		cdriver.close();
		



	}
}

class FirefoxBrowser1
{
	void Browsercall() throws InterruptedException
	{
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-15");
		
		/* print page title */
		System.out.println("The Page title is :"+fdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+fdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = fdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay ");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement fatherNameInputField = fdriver.findElement(By.id("father_name"));
		fatherNameInputField.sendKeys("Bhausaheb");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement addressInputField = fdriver.findElement(By.id("address"));
		addressInputField.sendKeys("New sangvi , Pune");
		Thread.sleep(2000);
		
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = fdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		Thread.sleep(2000);
		
		
		/*Typing in DOB Field*/
		WebElement DOBInputField = fdriver.findElement(By.name("birth_date"));
		DOBInputField.sendKeys("26/06/1996");
		Thread.sleep(2000);
		
		
		/*Typing in pincode Field*/
		WebElement pincodeInputField = fdriver.findElement(By.id("pincode"));
		pincodeInputField.sendKeys("411057");
	
		/*selection of Radio Button 
		//WebElement radiomaleInputField = fdriver.findElement(By.id("male"));
		WebElement radiofemaleInputField = fdriver.findElement(By.id("female"));
		radiofemaleInputField.click();
		Thread.sleep(2000);*/
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		fatherNameInputField.clear();
		addressInputField.clear();
		pincodeInputField.clear();
		DOBInputField.clear();
		fdriver.close();
	}
}



class IEBrowser1
{
	void Browsercall() throws InterruptedException
	{
		WebDriver IEdriver = new InternetExplorerDriver();
		IEdriver.get("https://www.colorlib.com/etc/regform/colorlib-regform-15");
		
		/* print page title */
		System.out.println("The Page title is :"+IEdriver.getTitle());
		
		/*Page current URL is*/
		System.out.println("Page Current URL is"+IEdriver.getCurrentUrl());
		
		/* Identifiy Element*/
		WebElement userNameInputField = IEdriver.findElement(By.id("name"));
		
		/*Typing Name in Identified Element */
		userNameInputField.sendKeys("Akshay ");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement fatherNameInputField = IEdriver.findElement(By.id("father_name"));
		fatherNameInputField.sendKeys("Bhausaheb");
		Thread.sleep(2000);
		
		/*Typing Name in father field Element */
		WebElement addressInputField = IEdriver.findElement(By.id("address"));
		addressInputField.sendKeys("New sangvi , Pune");
		Thread.sleep(2000);
		
		
		/*Typing Email in Email Field*/
		WebElement emailInputField = IEdriver.findElement(By.id("email"));
		emailInputField.sendKeys("akshaybhondave26@gmail.com");
		Thread.sleep(2000);
		
		
		/*Typing in DOB Field*/
		WebElement DOBInputField = IEdriver.findElement(By.name("birth_date"));
		DOBInputField.sendKeys("26/06/1996");
		Thread.sleep(2000);
		
		
		/*Typing in pincode Field*/
		WebElement pincodeInputField = IEdriver.findElement(By.id("pincode"));
		pincodeInputField.sendKeys("411057");
	
		/*selection of Radio Button 
		//WebElement radiomaleInputField = IEdriver.findElement(By.id("male"));
		WebElement radiofemaleInputField = IEdriver.findElement(By.id("female"));
		radiofemaleInputField.click();
		Thread.sleep(2000);*/
		
		
		
		
		userNameInputField.clear();
		emailInputField.clear();
		fatherNameInputField.clear();
		addressInputField.clear();
		pincodeInputField.clear();
		DOBInputField.clear();
		IEdriver.close();
	}
}




public class ObjectIdentificationForm15 
{
public static void main(String[] args)
{
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		
		System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
		
		
		
		try
		{
			ChromeBrowser1 CB1 = new ChromeBrowser1();
			FirefoxBrowser1 FB1 = new FirefoxBrowser1();
			IEBrowser1 IB1 = new IEBrowser1();
		
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
}
