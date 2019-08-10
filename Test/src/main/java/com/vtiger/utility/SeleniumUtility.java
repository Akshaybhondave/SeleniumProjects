package com.vtiger.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility extends BaseUtility

{
	public static Select getDropdownInstance(WebElement element) {

		return new Select(element);
	}

	public static String getAttributeForRequestElement(WebElement element, String attributeName) {

		return element.getAttribute(attributeName);
	}
	
	public static String getCSSAttributeForRequestElement(WebElement element, String attributeName) {

		return element.getCssValue(attributeName);
	}

	public static String getTextFromElement(WebElement element) {

		return element.getText();
	}


	public static void dragAndDrop(WebElement source,WebElement target){
		action.dragAndDrop(source, target).build().perform();
	}

}
