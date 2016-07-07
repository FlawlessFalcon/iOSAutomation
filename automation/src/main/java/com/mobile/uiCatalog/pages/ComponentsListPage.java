package com.mobile.uiCatalog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobile.automation.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ComponentsListPage extends AbstractPage{
	
	//Constants
	
	public static String expStaticText="UIKitCatalog";
	
	//Objects
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
	private static WebElement staticText;
	
	
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
	private static WebElement compActInd;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[2]")
	private static WebElement compActIndText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
	private static WebElement compAlertCont;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[2]")
	private static WebElement compAlertContText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")
	private static WebElement compButtons;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[2]")
	private static WebElement compButtonsText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")
	private static WebElement compDatePick;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[2]")
	private static WebElement compDatePickText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[1]")
	private static WebElement compImageView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[2]")
	private static WebElement compImageViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAStaticText[1]")
	private static WebElement compPageCont;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAStaticText[2]")
	private static WebElement compPageContText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIAStaticText[1]")
	private static WebElement compPickerView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIAStaticText[2]")
	private static WebElement compPickerViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]/UIAStaticText[1]")
	private static WebElement compProgView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]/UIAStaticText[2]")
	private static WebElement compProgViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAStaticText[1]")
	private static WebElement compSegCont;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAStaticText[2]")
	private static WebElement compSegContText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]/UIAStaticText[1]")
	private static WebElement compSliders;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]/UIAStaticText[2]")
	private static WebElement compSlidersText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[11]/UIAStaticText[1]")
	private static WebElement compStackView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[11]/UIAStaticText[2]")
	private static WebElement compStackViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[12]/UIAStaticText[1]")
	private static WebElement compSteppers;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[12]/UIAStaticText[2]")
	private static WebElement compSteppersText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[13]/UIAStaticText[1]")
	private static WebElement compSwitches;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[13]/UIAStaticText[2]")
	private static WebElement compSwitchesText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[14]/UIAStaticText[1]")
	private static WebElement compTextField;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[14]/UIAStaticText[2]")
	private static WebElement compTextFieldText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[15]/UIAStaticText[1]")
	private static WebElement compTextView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[15]/UIAStaticText[2]")
	private static WebElement compTextViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[16]/UIAStaticText[1]")
	private static WebElement compWebView;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[16]/UIAStaticText[2]")
	private static WebElement compWebViewText;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[17]/UIAStaticText[1]")
	private static WebElement compSearch;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[18]/UIAStaticText[1]")
	private static WebElement compToolbars;
	
	//Methods
	
	public static void checkStaticText(){
		staticText.getAttribute("value");
	}
	
	public static void clickActInd(){
		compActInd.click();
		//Activity Indicator Page
	}
	
	public static void clickAlertCont(){
		compAlertCont.click();
		//Alert Controller Page
	}
	
	public static void clickButtons(){
		compButtons.click();
		//Buttons Page
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ButtonsPage());
	}
	
	public static void clickDatePick(){
		compDatePick.click();
		//Date Picker Page
	}
	
	public static void clickImageView(){
		compImageView.click();
		//Image View Page
	}
	
	public static void clickPageCont(){
		compPageCont.click();
		//Page Control Page
	}
	
	public static void clickPickerView(){
		compPickerView.click();
		//Picker View Page
	}
	
	public static void clickProgView(){
		compProgView.click();
		//Progress View Page
	}
	
	public static void clickSegCont(){
		compSegCont.click();
		//Segmented Control Page
	}
	
	public static void clickSliders(){
		compSliders.click();
		//Sliders Page
	}
	
	public static void clickStackView(){
		compStackView.click();
		//Stack View Page
	}
	
	public static void clickSteppers(){
		compSteppers.click();
		//Steppers Page
	}
	
	public static void clickSwitches(){
		compSwitches.click();
		//Switches Page
	}
	
	public static void clickTextField(){
		compTextField.click();
		//Text Field Page
	}
	
	public static void clickTextView(){
		compTextView.click();
		//Text View Page
	}
	
	public static void clickWebView(){
		compWebView.click();
		//Web View Page
	}
	
	public static void clickSearch(){
		compSearch.click();
		//Search Page
	}
	
	public static void clickToolbars(){
		compToolbars.click();
		//Toolbars Page
	}
}
