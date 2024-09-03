package com.fireflink.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fireflink.pom.HomePage;
import com.fireflink.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	FileLib f=new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getDataProperties("url");
		driver.get(url);

	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage page=new LoginPage(driver);
		String un = f.getDataProperties("un");
		String pwd = f.getDataProperties("pwd");
		page.getemailidTextfield().sendKeys(un);
		page.getpasswordTextfield().sendKeys(pwd);
		page.getloginButton().click();
		page.getplatformlink().click();
		
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
			
		}
		driver.switchTo().parentFrame();
	}
	
	@AfterMethod
	public void logout() {
		HomePage page02=new HomePage(driver);
		page02.getuserIcon().click();
		page02.getsignOutButton().click();
	}
	
	@AfterTest
	public void closebrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
