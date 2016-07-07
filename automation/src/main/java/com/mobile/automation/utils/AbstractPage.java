package com.mobile.automation.utils;

import com.mobile.automation.AbstractTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AbstractPage {
	
	//Initialize the driver with Abstract Test
	protected static AppiumDriver<MobileElement> driver = AbstractTest.driver;

}
