package com.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseClass {
	

@Given("Url luanch of the Application")
public void url_luanch_of_the_application() {
	urlLaunch("https://adactinhotelapp.com/");
	
}

@When("Enter username in username field")
public void enter_username_in_username_field() {
	WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	loginCredentials(username, "karthikraja84596");
}

@When("Enter password in password field")
public void enter_password_in_password_field() {
	WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	loginCredentials(password, "RSFTGH");
}

@When("click login button")
public void click_login_button() {
	WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
	login(login);

}

@Then("Navigate to the next page")
public void navigate_to_the_next_page() {
    
}



}
