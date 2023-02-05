package com.StepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Adactin.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defenition extends BaseClass {

	
	

@Given("Url luanch of the Application")
public void url_luanch_of_the_application(String input) throws Throwable {
	urlLaunch("https://adactinhotelapp.com/");
	
}

@When("Enter username in username field")
public void enter_username_in_username_field(String input) throws Throwable {
	WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	loginCredentials(username, "karthikraja84596");
}

@When("Enter password in password field")
public void enter_password_in_password_field(String input) throws Throwable{
	WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	loginCredentials(password, "RSFTGH");
}

@When("click login button")
public void click_login_button() throws Throwable {
	WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
	login(login);

}

@Then("Navigate to the next page")
public void navigate_to_the_next_page() {
    
}



}

	
	

