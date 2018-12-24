package com.saudhing.rough;

import com.saudhing.base.Page;
import com.saudhing.pages.HomePage;
import com.saudhing.pages.LoginPage;
import com.saudhing.pages.ZohoAppPage;
import com.saudhing.pages.crm.accounts.AccountsPage;
import com.saudhing.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
	
		HomePage home = new HomePage();
		
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("sdhingra13@gmail.com", "Zohopassword@13");
		zp.goToCRM();
		
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount("Saurabh");
		
		
	}

}
