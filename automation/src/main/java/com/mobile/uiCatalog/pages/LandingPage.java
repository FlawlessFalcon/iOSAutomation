package com.mobile.uiCatalog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobile.automation.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LandingPage extends AbstractPage{
	
	//Constants
	
	public static String expStaticText = "Explore UIKit controls as you navigate UIKitCatalog. For more information on how UIKitCatalog is structured, consult the ReadMe.";	
	
	//Objects
	
	@FindBy(className="UIAButton")
	private static WebElement navUiKitCatalog;
	
	@FindBy(className="UIAStaticText")
	private static WebElement textReadMe;
	
	//Methods

	public static void clickUiKitCatalog(){
		navUiKitCatalog.click();
		//Return ComponentListPage
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ComponentsListPage());
	}
	
	public static void checkStaticText(){
		textReadMe.getAttribute("value");
	}
}
