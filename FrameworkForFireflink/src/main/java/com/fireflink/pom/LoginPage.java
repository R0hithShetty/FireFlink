package com.fireflink.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "emailId")
	private WebElement emailidTextfield;
	
	@FindBy(name = "password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@class=\"product_1\"]")
	private WebElement platformlink;
	
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getemailidTextfield() {
		return emailidTextfield;
	}
	
	public WebElement getpasswordTextfield() {
		return passwordTextfield;
	}
	
	public WebElement getloginButton() {
		return loginButton;
	}
	
	public WebElement getplatformlink() {
		return platformlink;
	}
	
	
	
	

}
