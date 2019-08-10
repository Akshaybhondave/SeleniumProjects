package com.automation.seesion6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

public static void main(String[] args) {

//open firefox browser

WebDriver driver = new FirefoxDriver();

//maximize the browser window

driver.manage().window().maximize();

//Implicit wait

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//enter the application url

driver.get("https://jqueryui.com");

/*Click on checkbox and radio button*/

driver.findElement(By.linkText("Checkboxradio")).click();

// /**

// * Identify frame before performing any operation inside the frame

// */

// WebElement frame=driver.findElement(By.className("demo-frame"));

// /*switch control inside the frame*/

// driver.switchTo().frame(frame);

/*switch to frame using index*/

driver.switchTo().frame(0);

/*CLick on Paris radio button*/

driver.findElement(By.cssSelector("label[for='radio-2']")).click();

/**

* Before clicking on application logo switch control back to main page

* because application logo is a part of main page

*/

/*Switch control back to main page*/

driver.switchTo().defaultContent();

/*click on JQuery logo*/

driver.findElement(By.linkText("jQuery UI")).click();

}

}