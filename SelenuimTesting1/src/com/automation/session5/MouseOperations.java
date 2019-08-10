package com.automation.session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

public static void main(String[] args) throws InterruptedException {

/*open firefox browser*/

WebDriver driver = new FirefoxDriver();

/*maximize the browser window*/

driver.manage().window().maximize();

/*Implicit wait*/

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

/*enter the application url*/

driver.get("https://www.flipkart.com/");

/*Handle login popup*/

try{

driver.findElement(By.cssSelector("._2AkmmA._29YdH8")).click();

}catch(NoSuchElementException e){

e.printStackTrace();

}

/*Create an instance of Actions class*/

Actions action=new Actions(driver);

/*Identify the required element on which mouse related operations need to be performed*/

List<WebElement> menu=driver.findElements(By.cssSelector("._114Zhd>li"));

/*perform the appropriate mouse related operations on the required element*/

for(int i=0;i<menu.size();i++){

action.moveToElement(menu.get(i)).perform();

Thread.sleep(2000);

}

/*Mouse hover on Electronics*/

action.moveToElement(menu.get(0)).perform();

/*click on realme*/

WebElement realMe1=driver.findElement(By.linkText("Realme"));

//realMe1.click(); //or

action.moveToElement(realMe1).click();

Thread.sleep(2000);

/**Open realme in new window*/

/*Mouse hover on Electronics*/

action.moveToElement(menu.get(0)).perform();

/*click on realme*/

WebElement realMe=driver.findElement(By.linkText("Realme"));

action.contextClick(realMe).perform(); //or

//action.moveToElement(realMe).contextClick().build().perform();

Thread.sleep(3000);

action.sendKeys("W").perform();

Thread.sleep(2000);

driver.quit();

}

}