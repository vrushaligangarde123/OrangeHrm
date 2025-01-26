package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayerPackage.BaseClass;

public class WebElementHelper extends BaseClass{
	public static void click(WebElement wb) {
		wb.click();
	}
	
	public static void sendKeys(WebElement wb,String value) {
		wb.sendKeys(value);
	}
	public static String getText(WebElement wb) {
		return wb.getText();
	}
}
