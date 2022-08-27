package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageOrders;

public class loginTest extends baseClass {
	LoginPage lp = new LoginPage(driver);
	ManageOrders mo;

	@Test(priority = 1)
	public void testcase01verifyLoginFunctionality() {
		mo = new ManageOrders(driver);
		lp = new LoginPage(driver);
		lp.performLogin();
		HomePage hp = new HomePage(driver);
		String actual = hp.displayProfileName();
		String expected = "Admin";
		System.out.println(actual);
		Assert.assertEquals(actual, expected, "User login is not working as we expected");

	}

//	@Test(priority = 2)
//
//	public void Manageorders_search_btn_size() {
//		mo = new ManageOrders(driver);
//		lp = new LoginPage(driver);
//		lp.performLogin();
//
//		mo.gettab();
//		String actual = mo.fontSearch();
//		System.out.println(actual);
//		String expected = "16px";
//		Assert.assertEquals(actual, expected, "Font size is not correct");
//
//	}
//
//	@Test(priority = 3)
//
//	public void ManageordersResetButtonFontSize() {
//		mo = new ManageOrders(driver);
//		lp = new LoginPage(driver);
//		lp.performLogin();
//
//		mo.gettab();
//		String actual2 = mo.fontRest();
//		System.out.println(actual2);
//		String expected2 = "16px";
//		Assert.assertEquals(actual2, expected2, "Font size is not correct");
//	}
//
//	@Test(priority = 4)
//
//	public void ManageordersSearchButtonValidation() {
//		mo = new ManageOrders(driver);
//		lp = new LoginPage(driver);
//		lp.performLogin();
//
//		mo.gettab();
//		String actual2 = mo.backGround_search();
//		System.out.println(actual2);
//		String expected2 = "rgba(0, 123, 255, 1)";
//		Assert.assertEquals(actual2, expected2, "Font size is not correct");
//	}

}