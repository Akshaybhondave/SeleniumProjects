/**
 * 
 */
package com.vtiger.utility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ASUS
 *
 */
public class BaseUtility {

	/* Reference variable of WebDriver */
	public static WebDriver driver;
	/* Current working dir */
	public static String currentWorkingDir;
	/* Reference variable of Properties class */
	public static Properties getProperties;
	/* Reference variable of InputStream class */
	public static FileInputStream fileInputStream;

	/* WebDriverWait reference variable */
	public static WebDriverWait wait;
	/* Actions reference variable */
	public static Actions action;
	
	public static String format ;

	public static final int days=10;
	public static void setUp() {
		/* load property file */
		loadPropertyFile();
		/* browser selection */
		setEnvironment(getProperties.getProperty("browserName"));
		/* open app url */
		driver.get(SeleniumConstant.APP_URL);
	}

	/**
	 * This method is used to initialize browser, maximize, wait
	 * 
	 * @param browserName
	 */
	public static void setEnvironment(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().arch32().setup();
			driver = new InternetExplorerDriver();
		}
		/* implicit wait */
		driver.manage().timeouts().implicitlyWait(SeleniumConstant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		/* maximize browser window */
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, SeleniumConstant.IMPLICIT_WAIT);
		/* Create an instance of Actions class */
		action = new Actions(driver);
	}

	/**
	 * This method is used to load property file
	 */
	public static void loadPropertyFile() {

		/* Current working dir */
		currentWorkingDir = System.getProperty("user.dir");
		/* Create in instance of Properties class */
		getProperties = new Properties();
		/* Create an instance of FileInputStream class */
		try {
			fileInputStream = new FileInputStream(currentWorkingDir + "\\TestData\\VtigerTestData.properties");
			getProperties.load(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to get data from property file
	 */
	public static String getInputFromPropertyFile(String key) {
		return getProperties.getProperty(key);
	}

	public static void CleanUp()
	{
		driver.close();
	}
	
	public static void sleep() throws InterruptedException
	{
		Thread.sleep(5000);
	}

}
