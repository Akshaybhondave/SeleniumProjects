package com.automation.session2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class BrowserCall
{
	void chromeCall()
	{
		/*Chrome Browser open*/
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		
		/*Get the page title and print the lenght from Chrome*/
		String pageTitle = cdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle);
		System.out.println("Page Title length is  :"+pageTitle.length());
		
		/* get current URL and Print the lenght from Chrome*/
		String currentUrl = cdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl);
		System.out.println("Page length of Current URL:"+currentUrl.length());
		
		/* get the page source and print the length*/
		System.out.println(cdriver.getPageSource().length());
		/*Close the browser*/
		cdriver.quit();
	}
	
	void fireFoxCall()
	{
		/*FireFox Browser open*/
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.facebook.com");
		
		
		
		/*Get the page title and print the lenght from FireFox*/
		System.out.println("From Firefox");
		String pageTitle1 = fdriver.getTitle();
		System.out.println("Page Title from FireFox:"+pageTitle1);
		System.out.println("Page Title length is  :"+pageTitle1.length());
		
		/* get current URL and Print the lenght from FireFox*/
		String currentUrl1 = fdriver.getCurrentUrl();
		System.out.println("Page Current URL:"+currentUrl1);
		System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		
		/* get the page source and print the length*/
		System.out.println(fdriver.getPageSource().length());
		
		/*Close the browser*/
		fdriver.quit();
		
	}
	
	void ieBrowserCall()
	{
		/*IE open */
		WebDriver IEdriver = new InternetExplorerDriver();	
		IEdriver.get("https://www.facebook.com");
		
		/*Get the page title and print the lenght from IE*/
		System.out.println("From IE");
		String pageTitle2 = IEdriver.getTitle();
		System.out.println("Page Title from IE:"+pageTitle2);
		System.out.println("Page Title length is  :"+pageTitle2.length());
		
		/* get current URL and Print the lenght from IE*/
		String currentUrl2 = IEdriver.getCurrentUrl();
		System.out.println("Page Current URL:"+currentUrl2);
		System.out.println("Page length of Current URL:"+currentUrl2.length());
		
		System.out.println(IEdriver.getPageSource().length());
		
		/*Close the browser*/
		IEdriver.close();
		
		
	}
}







public class MultipleBrowserOpen
{
	public static void main(String[] args)
	{
		/* set the path for driver Executable*/

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Software\\chromedriver_win32\\chromedriver.exe");
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Software\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium_Software\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		
		
		BrowserCall BC1 = new BrowserCall();
		BC1.chromeCall();
		BC1.fireFoxCall();
		BC1.ieBrowserCall();
		System.out.println("All Browsers are closed");
		
	}
}
