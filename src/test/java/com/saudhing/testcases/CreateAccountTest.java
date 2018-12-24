package com.saudhing.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.saudhing.base.Page;
import com.saudhing.pages.ZohoAppPage;
import com.saudhing.pages.crm.accounts.AccountsPage;
import com.saudhing.pages.crm.accounts.CreateAccountPage;
import com.saudhing.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount(data.get("accountname"));

	}

}
