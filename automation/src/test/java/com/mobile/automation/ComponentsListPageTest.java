package com.mobile.automation;

import org.junit.Test;

import com.mobile.uiCatalog.pages.ButtonsPage;
import com.mobile.uiCatalog.pages.ComponentsListPage;
import com.mobile.uiCatalog.pages.LandingPage;

public class ComponentsListPageTest extends AbstractTest{
	
	@Test
	public void sysTextButtonTest(){
		LandingPage.clickUiKitCatalog();
		ComponentsListPage.clickButtons();
		ButtonsPage.clickSysTextButton();
		//assertArrayEquals(ButtonsPage.expSysText, ButtonsPage.checkSysText());
		
	}

}
