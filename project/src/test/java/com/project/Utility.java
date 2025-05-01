package com.project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Utility {

	public static RemoteWebDriver getDriver()
	{
		RemoteWebDriver driver;
			driver=new ChromeDriver();
			
		   driver.manage().window().maximize();
		   return driver;
		
		
	}
}

