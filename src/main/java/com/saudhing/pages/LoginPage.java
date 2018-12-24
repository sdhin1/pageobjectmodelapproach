package com.saudhing.pages;

import org.openqa.selenium.By;

import com.saudhing.base.Page;

public class LoginPage extends Page{
	
	public ZohoAppPage doLogin(String username, String password) {	
		
		type("email_XPATH", username);
		type("password_XPATH", password);
		click("signbtn_XPATH");
		
		return new ZohoAppPage();
		
	}

}
