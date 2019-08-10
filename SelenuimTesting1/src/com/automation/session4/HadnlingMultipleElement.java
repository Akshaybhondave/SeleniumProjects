package com.automation.session4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadnlingMultipleElement 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	WebDriver cdriver = new ChromeDriver();
	
	cdriver.manage().window().maximize();
	cdriver.get("https://www.google.com");
	
	/*implicite wait */
	
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	cdriver.findElement(By.name("q")).sendKeys("Automation Testing");
	List <WebElement> allSuggestions = cdriver.findElements(By.cssSelector("ul[class='erkvQe']>li>div>div>div>span"));

	int suggestionsCount = allSuggestions.size();
	System.out.println("Suggestion Count"+suggestionsCount);
	
	
	for(int i = 0 ; i< suggestionsCount;i++)
	{
		List<WebElement> allsuggestionList = cdriver.findElements(By.cssSelector("ul[class='erkvQe']>li>div>div>div>span"));
		System.out.println(allsuggestionList.get(i).getText());
	}
	
}
}
