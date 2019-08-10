/**
 * 
 */
package com.vtiger.webpageScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.utility.BaseUtility;
import com.vtiger.utility.DateUtility;
import com.vtiger.utility.SeleniumConstant;
import com.vtiger.webpages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ASUS
 *
 */
public class LoginPageScript {

	
//	@Test
//	public void runChromeBrowserFirst(){
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.vtiger.com/vtigercrm/");
//		
//		driver.findElement(LoginPage.Username).sendKeys("admin");
//		driver.findElement(LoginPage.Password).sendKeys("admin");
//		driver.findElement(LoginPage.Signin).click();
//	}
//	
//	@Test
//	public void runChromeBrowserSeocnd(){
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		/*Read url frol constant file*/
//		driver.get(SeleniumConstant.APP_URL);
//		
//		driver.findElement(LoginPage.Username).sendKeys("admin");
//		driver.findElement(LoginPage.Password).sendKeys("admin");
//		driver.findElement(LoginPage.Signin).click();
//	}
//	
//	@Test
//	public void runChromeBrowserSeocndThrid(){
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(SeleniumConstant.APP_URL);
//		/*Load property file*/
//		BaseUtility.loadPropertyFile();
//		/*read test data from property file*/
//		String userName=BaseUtility.getProperties.getProperty("userName");
//		String password=BaseUtility.getProperties.getProperty("password");
//		
//		driver.findElement(LoginPage.Username).sendKeys(userName);
//		driver.findElement(LoginPage.Password).sendKeys(password);
//		driver.findElement(LoginPage.Signin).click();
//	}
//	
//	@Test
//	public void runChromeBrowserSeocndFinal(){
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(SeleniumConstant.APP_URL);
//		/*Load property file*/
//		BaseUtility.loadPropertyFile();
//		/*with the help to getInputFromPropertyFile() read input data from property file*/
//		driver.findElement(LoginPage.Username).sendKeys(BaseUtility.getInputFromPropertyFile("userName"));
//		driver.findElement(LoginPage.Password).sendKeys(BaseUtility.getInputFromPropertyFile("password"));
//		driver.findElement(LoginPage.Signin).click();
//	}
	
	@Test(priority=1)
	public void loginIntoVtigerApp() throws InterruptedException{
		
		BaseUtility.setUp();		
		/*with the help to getInputFromPropertyFile() read input data from property file*/
		BaseUtility.driver.findElement(LoginPage.Username).sendKeys(BaseUtility.getInputFromPropertyFile("userName"));
		BaseUtility.driver.findElement(LoginPage.Password).sendKeys(BaseUtility.getInputFromPropertyFile("password"));
		BaseUtility.driver.findElement(LoginPage.Signin).click();
		Thread.sleep(3000);
		//BaseUtility.CleanUp();
		
		System.out.println("Login Date is : "+DateUtility.getTodaysSystemDateInFormart());
		System.out.println("Your Future Login Date "+DateUtility.getPastOrFutureDatFromTodayInFormart(BaseUtility.days));
	}
	
	
}

	
