package com.saudhing.pages.crm.accounts;

import com.saudhing.base.Page;

public class CreateAccountPage extends Page{
	
	public void createAccount(String accountName) {
		
		type("accountname_ID", accountName);
		
		
	}

}
