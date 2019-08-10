package com.automation.session8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MavenDemo
{
	public static void main(String[] args) 
	{

	}

}

class Login {

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.cssSelector("button[class = 'button buttonBlue']");
}

class leadCreation {
	By leadPlusSign = By.cssSelector("a[id='menubar_quickCreate']");
	By quickCreateLead = By.cssSelector("div >a[id= 'menubar_quickCreate_Leads']");

	// Selecting from dropdown
	By dropdownselection = By.linkText("None");
	By selectMr = By.cssSelector("div#select2-drop li:nth-of-type(2) div");

	// Filling All Details
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By phone = By.name("phone");
	By companyname = By.name("company");
	By email = By.name("email");
	By Administrator = By.linkText("Administrator");
	By Dropdown = By.cssSelector("div#select2-drop>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>div");
	By saveButton = By.name("saveButton");
}

class Modifylead
{
	By menuButton = By.xpath("//div[@id='appnavigator']");
	By marketModule = By.id("MARKETING_modules_dropdownMenu");
	
	//Click on Leads	
	By lead = By.cssSelector("ul.module-qtip:nth-child(2) li>a>span");	
	By leadFinding = By.xpath("//a[text()='White']");
	By commentBox = By.xpath("//textarea[@placeholder='Post your comment here']");
	By postButton = By.xpath("//div[@class ='col-xs-6 pull-right paddingTop5 paddingLeft0']//div//Button[@type='button']");

//Validating Comments
	By comment =By.xpath("//span[@class='commentInfoContent']");
}


class DeleteLead
{
	
	// Clicking on Menu>Marketing
	By menu=By.xpath("//div[@id='appnavigator']");
	By marketModule = By.id("MARKETING_modules_dropdownMenu");

	// Click on Leads
	By lead = By.cssSelector("ul.module-qtip:nth-child(2) li>a>span");

	//click on Check Box of Newly created Lead
	By leadCheckBox = By.xpath("//input[@class='listViewEntriesCheckBox']");

	//Clicking on Delete Button
	By deleteButton = By.xpath("//button[@id='Leads_listView_massAction_LBL_DELETE']");

	//Clicking Yes on Confirmation Pop-Up 
	By popUpYes = By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']");
}

class Logout
{
	By adminSign =By.cssSelector("a.userName.dropdown-toggle");	
	By signOutButton= By.linkText("Sign Out");
}