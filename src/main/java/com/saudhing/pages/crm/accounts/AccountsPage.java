package com.saudhing.pages.crm.accounts;

import com.saudhing.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccount() {
		
		click("createaccountbtn_XPATH");
		
		return new CreateAccountPage();
		
	}
	
	public void goToImportAccount() {
		
	}

}
