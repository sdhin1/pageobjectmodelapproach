package com.saudhing.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saudhing.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {
		
		Page.click("accountstab_XPATH");
		
		return new AccountsPage();

	}

	public void goToDeals() {

	}
	
	public void signOut() {
		
	}

}
