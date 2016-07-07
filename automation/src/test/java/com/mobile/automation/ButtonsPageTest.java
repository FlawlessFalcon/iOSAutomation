package com.mobile.automation;


import org.junit.Test;

import com.mobile.uiCatalog.pages.ButtonsPage;
import com.mobile.uiCatalog.pages.ComponentsListPage;
import com.mobile.uiCatalog.pages.LandingPage;

public class ButtonsPageTest extends AbstractTest{
	
	@Test
	public void sysTextButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickSysTextButton();
		//assertArrayEquals(ButtonsPage.expSysText, ButtonsPage.checkSysText());
		
	}
	
	@Test
	public void sysContactAddButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickSysContactAddButton();
		
	}
	
	@Test
	public void sysDetailsDisclosureButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickSysDetailsDisclosureButton();
		
	}
	
	@Test
	public void imageButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickImageButton();
		
	}
	
	@Test
	public void attrTextButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickAttrTextButton();
		
	}
}
