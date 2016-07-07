package com.mobile.uiCatalog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobile.automation.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ButtonsPage extends AbstractPage{
	
	//Expected Label on the Page
	
	public static String expSysText = "SYSTEM (TEXT)";
	public static String expSysConAddText = "SYSTEM (CONTACT ADD)";
	public static String expSysDetDisText = "SYSTEM (DETAIL DISCLOSURE)";
	public static String expImageText = "IMAGE";
	public static String expAttrText = "ATTRIBUTED TEXT";	
	
	//Objects
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
	private static WebElement textButton;
	
	@FindBy(name="UICatalog")
	private static WebElement navUICatalog;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")
	private static WebElement backButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]/UIAElement[1]")
	private static WebElement sysText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]")
	private static WebElement sysTextButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAElement[1]")
	private static WebElement sysContactText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAButton[1]")
	private static WebElement sysContactAddButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]/UIAElement[1]")
	private static WebElement sysDetailsDisText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAButton[1]")
	private static WebElement sysDetailsDisclosureButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[4]/UIAElement[1]")
	private static WebElement imageText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[1]")
	private static WebElement imageButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[5]/UIAElement[1]")
	private static WebElement attrText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAButton[1]")
	private static WebElement attrTextButton;
	
	//Methods
	
	public static void checkButtonText(){
		textButton.getAttribute("value");
	}
	
	public static void clickUiCatalog(){
		navUICatalog.click();
		//Return to ComponentList Page
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ComponentsListPage());
	}
	
	public static void clickBackButton(){
		backButton.click();
		//Return to ComponentList Page
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ComponentsListPage());		
	}
	
	public static void checkSysText(){
		sysText.getAttribute("label");
	}
	
	public static void clickSysTextButton(){
		sysTextButton.click();
	}
	
	public static void checkSysContactText(){
		sysContactText.getAttribute("label");
	}
	
	public static void clickSysContactAddButton(){
		sysContactAddButton.click();
	}
	
	public static void clickSysDetailsDisText(){
		sysDetailsDisText.getAttribute("label");
	}

	public static void clickSysDetailsDisclosureButton(){
		sysDetailsDisclosureButton.click();
	}
	
	public static void checkImageText(){
		imageText.getAttribute("label");
	}
	
	public static void clickImageButton(){
		imageButton.click();
	}
	
	public static void checkAttrText(){
		attrText.getAttribute("label");
	}
	
	public static void clickAttrTextButton(){
		attrTextButton.click();
	}
	
}
