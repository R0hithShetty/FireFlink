package com.fireflink.testscripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EndtoEnd {
	@Test
	public void EndToEnd() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://app.fireflink.com");
		driver.findElement(By.id("emailId")).sendKeys("rohith.m@fireflink.com");
		driver.findElement(By.name("password")).sendKeys("Rohi@92422");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//div[@class=\"product_1\"]")).click();
		
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
			
		}
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M74.578,74')]")).click();
		driver.findElement(By.xpath("//li[text()='Sign out']")).click();
	}
	
	

}
