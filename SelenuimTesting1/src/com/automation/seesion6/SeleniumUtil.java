package com.automation.seesion6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

protected WebDriver driver;

protected WebDriverWait wait;

protected Actions action;

protected void setUp(String browserName, String appUrl) {

desiredBrowser(browserName);

// maximize the browser window

driver.manage().window().maximize();

// Implicit wait

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Explicit wait

wait = new WebDriverWait(driver, 20);

//Create instance of Actions class'

action=new Actions(driver);

// enter the application url

driver.get(appUrl);

}

protected void desiredBrowser(String browserName){

	if (browserName.equalsIgnoreCase("firefox")) 
	{

		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	} 
	else if (browserName.equalsIgnoreCase("chrome")) 	
	{

		/* set the path of chrome driver executable */

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		/* open chrome browser */

		driver = new ChromeDriver();

	} 
	else 
	{

		/* set the path of ie driver executable */

		System.setProperty("webdriver.ie.driver", ".//Driver//IEDriverServer.exe");

		/* open chrome browser */

		driver = new InternetExplorerDriver();

}

}

protected void setSleepTime(int time){

try {

Thread.sleep(time);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

protected void tearDown(){

driver.close();

}

}
