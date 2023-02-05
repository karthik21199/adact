package com.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerClass extends BaseClass{

	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		loginCredentials(username, "karthikraja84596");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		loginCredentials(password, "RSFTGH");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login(login);
		
		
		
		
		
	}
	
	
	
}
