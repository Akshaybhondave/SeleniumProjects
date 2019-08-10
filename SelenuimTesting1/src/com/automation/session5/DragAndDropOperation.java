package com.automation.session5;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropOperation {

public static void main(String[] args) {

/*open firefox browser*/

WebDriver driver = new FirefoxDriver();

/*maximize the browser window*/

driver.manage().window().maximize();

/*Implicit wait*/

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebDriverWait wait=new WebDriverWait(driver, 20);

/*enter the application url*/

driver.get("https://demo.vtiger.com/vtigercrm/");

/*login*/

driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.id("password")).sendKeys("admin",Keys.ENTER);

/*Create an instance of Actions class*/

Actions action=new Actions(driver);

wait.until(ExpectedConditions.titleIs("Dashboard"));

/*Identify the required element on which mouse related operations need to be performed*/

List<WebElement> allDashboards=driver.findElements(By.cssSelector(".dashboardTitle"));

System.out.println(allDashboards.size()+

allDashboards.get(0).getText()

+ allDashboards.get(1).getText());

/*drag and drop*/

action.dragAndDrop(allDashboards.get(0), allDashboards.get(1)).perform(); //or

action.dragAndDropBy(allDashboards.get(0), 100,150).perform();

}

}