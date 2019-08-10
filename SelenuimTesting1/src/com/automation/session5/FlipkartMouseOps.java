package com.automation.session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOps {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.cssSelector("._2AkmmA._29YdH8")).click();
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		Actions mouse = new Actions(driver);

		
		List<WebElement> menu = driver.findElements(By.cssSelector("._114Zhd>li"));
		System.out.println("menu count"+menu.size());
		for(int i=0;i<menu.size();i++)
		{
			mouse.moveToElement(menu.get(i)).perform();
			System.out.println("Menu: "+menu.get(i).getText());
			//List<WebElement> SubmenuList = driver.findElements(By.cssSelector("._2GG4xt>ul>li>a"));
			List<WebElement> SubmenuList = driver.findElements(By.cssSelector("._1KCOnI._2BfSTw"));
			Thread.sleep(3000);
			for(int j=0;j<SubmenuList.size();j++)
			{
				System.out.println("SubMenu: "+SubmenuList.get(j).getText());
			}
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
