package com.automation.session1;

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
		System.out.println("Opening FaceBook From Chrome");
		String pageTitle1 = cdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle1);
		System.out.println("Page Title length is  :"+pageTitle1.length());
		String currentUrl = cdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl);
		System.out.println(cdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl.length());
		
		
		System.out.println("Opening Google From Chrome");
		cdriver.get("http://www.google.com");
		String pageTitle2 = cdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle2);
		System.out.println("Page Title length is  :"+pageTitle2.length());
		String currentUrl1 = cdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl1);
		System.out.println(cdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		System.out.println("Opening Flipkart From Chrome");
		cdriver.get("http://www.Flpikart.com");
		String pageTitle3 = cdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle3);
		System.out.println("Page Title length is  :"+pageTitle3.length());
		String currentUrl2 = cdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl2);
		System.out.println(cdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		/* get current URL and Print the lenght from Chrome*/
		
		
		/* get the page source and print the length*/
		//System.out.println(cdriver.getPageSource().length());
		/*Close the browser*/
		cdriver.close();
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
		
		System.out.println("Opening Google From Firefox");
		fdriver.get("http://www.google.com");
		String pageTitle2 = fdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle2);
		System.out.println("Page Title length is  :"+pageTitle2.length());
		String currentUrl2 = fdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl2);
		System.out.println(fdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		System.out.println("Opening Flipkart From Firefox");
		fdriver.get("http://www.Flpikart.com");
		String pageTitle3 = fdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle3);
		System.out.println("Page Title length is  :"+pageTitle3.length());
		String currentUrl3 = fdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl3);
		System.out.println(fdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		
		
		/*Close the browser*/
		fdriver.close();
		
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
		
		System.out.println("Opening Google From IE");
		IEdriver.get("http://www.google.com");
		String pageTitle = IEdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle);
		System.out.println("Page Title length is  :"+pageTitle2.length());
		String currentUrl = IEdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl);
		System.out.println(IEdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		System.out.println("Opening Flipkart From IE");
		IEdriver.get("http://www.Flpikart.com");
		String pageTitle3 = IEdriver.getTitle();
		System.out.println("Page Title from Chrome Browser:"+pageTitle3);
		System.out.println("Page Title length is  :"+pageTitle3.length());
		String currentUrl3 = IEdriver.getCurrentUrl();
		System.out.println("Page Current URL From Chrome Browser:"+currentUrl3);
		System.out.println(IEdriver.getPageSource().length());
		//System.out.println("Page length of Current URL:"+currentUrl1.length());
		
		
		/*Close the browser*/
		IEdriver.close();
		
		
	}
}

public class LaunchingBrowser
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
	
	BrowserCall BC1 = new BrowserCall();
	BC1.chromeCall();
	BC1.fireFoxCall();
	BC1.ieBrowserCall();
	System.out.println("All Browsers are closed");
	
	//WebDriver driver = new ChromeDriver();
	//driver.get("http://facebook.com");
}
}
