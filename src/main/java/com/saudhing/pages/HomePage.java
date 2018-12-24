package com.saudhing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saudhing.base.Page;

public class HomePage extends Page{
	
	public void goToSignUp() {
		
		driver.findElement(By.xpath("//*[@class='zh-signup']")).click();
		
	}
	
	public LoginPage goToLogin() {
		
		click("loginlink_XPATH");
		
		return new LoginPage();
		
	}
	
	public void goToSupport() {
		
		driver.findElement(By.xpath("//*[@class='zh-support']")).click();
		
	}
	
	public void goToZohoEdu() {
		
	}
	
	public void goToLearnMore() {
		
	}
	
	public void goToFooterLinks() {
		
	}

}
