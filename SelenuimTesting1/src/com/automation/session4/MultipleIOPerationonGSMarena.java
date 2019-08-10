package com.automation.session4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIOPerationonGSMarena {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		
		cdriver.manage().window().maximize();
		cdriver.get("https://www.gsmarena.com");
		
		/*implicite wait */
		
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List <WebElement> allSuggestions = cdriver.findElements(By.
				cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
			
		int suggestionsCount = allSuggestions.size();
		System.out.println("Suggestion Count"+suggestionsCount);
		
		
		for(int i = 0 ; i< suggestionsCount;i++)
		{
			List<WebElement> allsuggestionList = cdriver.findElements(By.
					cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
			System.out.println(allsuggestionList.get(i).getText());
		}
		
		System.out.println("1st Assignment done");
		
		
		System.out.println("2nd Assignment Started");
		
		/*Click on Samsung and navigate to All samsung Brand page*/
		
		cdriver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		//cdriver.findElement(By.cssSelector("div>ul>li>a[href='samsung-phones-9.php']")).click();
	
		/*After Navigation Finding all Samsung Phones and Storing there Count and print count*/
		List <WebElement> allSuggestions1 = cdriver.findElements(By.
				cssSelector("div[class='makers']>ul>li>a>strong>span"));	
		
		
		/*Printing all Name of phone found on samsung page*/
		for(int i = 0 ; i< suggestionsCount;i++)
			
		{
			List<WebElement> allsuggestionList1 = cdriver.findElements(By.
						cssSelector("div[class='makers']>ul>li>a>strong>span"));
			System.out.println(allsuggestionList1.get(i).getText());
		}
		
		int suggestionsCount1 = allSuggestions1.size();
		System.out.println("Suggestion Count"+suggestionsCount1);
		cdriver.close();
	
	}
		
	}


