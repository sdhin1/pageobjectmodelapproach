package com.saudhing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saudhing.base.Page;
import com.saudhing.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	public CRMHomePage goToCRM() {
		
		click("crmlink_XPATH");
		
		return new CRMHomePage();
		
	}

}
