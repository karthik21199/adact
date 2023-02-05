package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String input) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\New\\Adactin\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		return driver;
	}
	
	public static void urlLaunch(String input) {
		driver.get(input);

	}
	
	public static void loginCredentials(WebElement element , String input) {
		element.sendKeys(input);
		element.click();

	}
     public static void login(WebElement element) {
    	 element.click();
	

}
	

	
	
}
