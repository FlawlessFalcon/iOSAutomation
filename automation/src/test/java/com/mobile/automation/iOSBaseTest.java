package com.mobile.automation;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;


/**
 * 
 * @author Ganesh
 * IOS Native App, Hybrid App, Mobile Web Automation using Simulator, Appium and Selenium WebDriver
 *
 */

public class iOSBaseTest extends AbstractTest{
	
	
	@Test 
	public void testStaticText() throws Exception {
		
		WebElement staticText = driver.findElementByClassName("UIAStaticText");
		String expectedText = "Explore UIKit controls as you navigate UIKitCatalog. For more information on how UIKitCatalog is structured, consult the ReadMe.";
		String actualText = staticText.getAttribute("value");
		assertEquals(expectedText, actualText);
		
	}
	
	@Test 
	public void testStaticTextLandscape() throws Exception {
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
		WebElement staticText = driver.findElementByClassName("UIAStaticText");
		String expectedText = "Explore UIKit controls as you navigate UIKitCatalog. For more information on how UIKitCatalog is structured, consult the ReadMe.";
		String actualText = staticText.getAttribute("value");
		assertEquals(expectedText, actualText);
		
	}
	
	@Test
	public void testUiKitCatalogNavigation() {
		
		WebElement navText = driver.findElementByClassName("UIAButton");
		navText.click();
	
	}
	
	@Test
	public void testUiKitCatalogNavigationLandscape() {
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
		WebElement navText = driver.findElementByClassName("UIAButton");
		navText.click();
	
	}
	
	@Test
	public void testUiKitCatalogPage() {
		WebElement navText = driver.findElementByClassName("UIAButton");
		navText.click();
		String expText="UIKitCatalog";
		WebElement uiKitCatalogPage= driver.findElementByClassName("UIAStaticText");
		String actText = uiKitCatalogPage.getAttribute("value");
		assertEquals(expText, actText);
	}

	@Test
	public void testActivityIndicators() {
		WebElement navText = driver.findElementByClassName("UIAButton");
		navText.click();
		WebElement actInd = driver.findElementByName("Activity Indicators");
		//WebElement actInd1 = driver.
		actInd.click();
		
	}
	
	@Test
	public void testSteppers() {
		WebElement navText = driver.findElementByClassName("UIAButton");
		navText.click();
		WebElement steppers = driver.findElementByName("Steppers");
		steppers.click();
	}
}
