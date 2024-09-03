package com.fireflink.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M74.578,74')]")
	private WebElement userIcon;
	
	@FindBy(xpath = "//li[text()='Sign out']")
	private WebElement signOutButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getuserIcon() {
		return userIcon;
	}
	
	public WebElement getsignOutButton() {
		return signOutButton;
	}
	
	

}
