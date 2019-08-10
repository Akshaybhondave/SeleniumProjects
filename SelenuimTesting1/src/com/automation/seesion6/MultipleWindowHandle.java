package com.automation.seesion6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowHandle extends SeleniumUtil
{
	public void handleAlertPopUps() 
	{
		/*pass the desired browser and app url*/

		setUp("chrome", "https://etrain.info/in");
		String url = driver.getCurrentUrl();
		System.out.println("Page URL is:-"+url);
		
		String title = driver.getTitle();
		System.out.println("\n Page Title is:-" +"\n"+title);
		
		setSleepTime(2000);
		System.out.println("Clicking on Back Navigation");
		driver.findElement(By.cssSelector("div>div >div[class = 'sliderNavText']>a[id='sliderBack']")).click();
		System.out.println("Clicked on Back Navigation");
		setSleepTime(2000);
		
		String HomeWind = driver.getWindowHandle();
		System.out.println(HomeWind);
		
		driver.findElement(By.linkText("Reservation Rules")).click();
		
		setSleepTime(2000);
		System.out.println("Clicked on Reservation Rules");
		
		Set<String> allWind = driver.getWindowHandles();
		System.out.println(allWind);
		allWind.remove(HomeWind);
		System.out.println(allWind);
		
		Iterator<String> iter=allWind.iterator();
		String childWinId=iter.next();
		
		driver.switchTo().window(childWinId);
		setSleepTime(2000);
		System.out.println("After Switch :- "+childWinId);
		driver.findElement(By.linkText("Information")).click();
		
		System.out.println("clicked");
		//setSleepTime(2000);		
		
				
	}	
	


	
public static void main(String[] args) 
{
	MultipleWindowHandle handle = new MultipleWindowHandle();
	handle.handleAlertPopUps();

}

}

