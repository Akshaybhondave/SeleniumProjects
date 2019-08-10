package com.automation.seesion6;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewTabOrWindow {

public static void main(String[] args) {

/*set the path of chrome driver executable */

System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

/*open chrome browser*/

WebDriver driver = new ChromeDriver();

//maximize the browser window

driver.manage().window().maximize();

//Implicit wait

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//enter the application url

driver.get("https://etrain.info/in");

//get home window id

String homeWinId=driver.getWindowHandle();

//click on Reservation Rules

driver.findElement(By.linkText("Reservation Rules")).click();

//get all windows id opened by webdriver

Set<String> allWinId=driver.getWindowHandles();

/**

* Get the child window id or Tab window id

* App-1: from allWinId remove homeWinId and use iterator to get child win or

* tab id

*/

allWinId.remove(homeWinId);

/*using iterator get the Iterator instance, so that you can get the child win id*/

Iterator<String> itr=allWinId.iterator();

/*get child window id using Iterator interface*/

String childWinId=itr.next();

System.out.println("Before switching: "+driver.getCurrentUrl());

/*perform required operation on new tab/window*/

driver.switchTo().window(childWinId);

System.out.println("After swriching: "+driver.getCurrentUrl());

// /*close current working window*/

// driver.close();

// /*take control back to home window*/

// driver.switchTo().window(homeWinId);

// driver.close();

/*close all the driver instances*/

driver.quit();

}

}