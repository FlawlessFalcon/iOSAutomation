package com.mobile.automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.mobile.uiCatalog.pages.LandingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AbstractTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	/**
	 * 
	 * Initial Setup for the IOSDriver which will install the App and initiate the App on the IOS Simulator
	 * @throws Exception 
	 * 
	 */
	
	@Before
	public void setUp() throws Exception {
		
		//stopAppium();
		//startAppium();
		//Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
        File app = new File("/Users/Ganesh/Library/Developer/Xcode/DerivedData/UIKitCatalog-gusbduwxgmtxdrfzryguebyupsul/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.ROTATABLE, true);
		
		//Create an instance of RemoteWebDriver and connect to the Appium server.
        //Appium will launch the BmiCalc App in iPhone Simulator using the configurations specified in Desired Capabilities
        try {
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());

	}
	
	@After
	public void tearDown() throws Exception {
        try{
        	driver.quit();
        	//stopAppium();
        }catch(Exception e){
        	
        }
    }
	
	public static void startAppium() throws Exception {
		
		System.out.println("Trying to Start Appium Server!");
		CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
		command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/appium.js", false);
		command.addArgument("--address", false);
		command.addArgument("127.0.0.1");
		command.addArgument("--port", false);
		command.addArgument("4723");
		command.addArgument("--no-reset", false);
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);
		Thread.sleep(3000);
		System.out.println("Appium Server is Started");
		
	}
	
	public static void stopAppium() throws Exception {
		
		System.out.println("Trying to Stop Appium Server!");
		Runtime.getRuntime().exec("killall node");
		System.out.println("Appium Server is now Shutdown");
		
	}

}
