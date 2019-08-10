package com.automation.session4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleOperation
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	WebDriver cdriver = new ChromeDriver();
	
	cdriver.manage().window().maximize();
	cdriver.get("https://www.gsmarena.com");
	
	/*implicite wait */
	
	//cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> allSuggestions = cdriver.findElements(By.cssSelector("div[class='makers']>ul>li>a>strong>span"));	
		int suggestionsCount = allSuggestions.size();
		System.out.println("Suggestion Count"+suggestionsCount);
		for(int i = 0 ; i< suggestionsCount;i++)
			
		{
			List<WebElement> allsuggestionList = cdriver.findElements(By.cssSelector("div[class='makers']>ul>li>a>strong>span"));
			System.out.println(allsuggestionList.get(i).getText());
		}
	cdriver.close();
}
}
