package com.saudhing.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.saudhing.pages.HomePage;
import com.saudhing.pages.LoginPage;
import com.saudhing.pages.ZohoAppPage;
import com.saudhing.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) {

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin(data.get("username"), data.get("password"));

	}

}
