package com.vtiger.webpages;

import org.openqa.selenium.By;

public class CreatLoadPage

{

	public static By menuButton = By.xpath("//div[@id='appnavigator']");
	public static By marketModule = By.id("MARKETING_modules_dropdownMenu");
	
	//Click on Leads	
	public static By lead = By.cssSelector("ul.module-qtip:nth-child(2) li>a>span");	
	public static By leadFinding = By.xpath("//a[text()='White']");
	public static By commentBox = By.xpath("//textarea[@placeholder='Post your comment here']");
	public static By postButton = By.xpath("//div[@class ='col-xs-6 pull-right paddingTop5 paddingLeft0']//div//Button[@type='button']");
	public static By comment =By.xpath("//span[@class='commentInfoContent']");
}
