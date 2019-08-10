package com.vtiger.webpages;

import org.openqa.selenium.By;

public class DashBoardPage
{
	static public By leadPlusSign = By.cssSelector("a[id='menubar_quickCreate']");
	static public By quickCreateLead = By.cssSelector("div >a[id= 'menubar_quickCreate_Leads']");

	// Selecting from dropdown
	static public By dropdownselection = By.linkText("None");
	static public By selectMr = By.cssSelector("div#select2-drop li:nth-of-type(2) div");

	// Filling All Details
	static public By firstname = By.name("firstname");
	static public By  lastname = By.name("lastname");
	static public By phone = By.name("phone");
	static public By companyname = By.name("company");
	static public By email = By.name("email");
	static public By Administrator = By.linkText("Administrator");
	static public By Dropdown = By.cssSelector("div#select2-drop>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>div");
	static public By saveButton = By.name("saveButton");
}