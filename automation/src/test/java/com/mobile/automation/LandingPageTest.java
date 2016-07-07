package com.mobile.automation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.mobile.uiCatalog.pages.LandingPage;

public class LandingPageTest extends AbstractTest{
	
	@Test
	public void staticTextTest(){
		LandingPage.clickUiKitCatalog();
		//assertArrayEquals("The Static Text is incorrect", LandingPage.expStaticText, LandingPage.checkStaticText());
		//assertEquals();

		
	}

}
