package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class StioltoRespimatPageTest extends BaseTest {
	
	
	@BeforeClass
	public void stioltoSetUp()
	{
		homePage.getHomepage();
		stiltoPage = homePage.navigateToStioltoRespimatPage();
	}
	
	
	@Description("Stiolto page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void homePageURLTest()
	{
		Assert.assertEquals(stiltoPage.getHomePageURL(), Constants.STIOLTO_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying Stiolto logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void stiltoLogoExistTest()
	{
		Assert.assertTrue(stiltoPage.isLogoExist());
	}
	
	@Description("Stiolto page title test")
	@Severity(SeverityLevel.MINOR)
	@Test
	public void homePageTitleTest()
	{
		Assert.assertEquals(stiltoPage.getHomePageTitle(), Constants.STIOLTO_PAGE_TITLE);
	}
	
	
	public String getRandomEmailID()
	{
		return "testautomation" + System.currentTimeMillis() + "@opencart.com";
	  //return "testautomation" + UUID.randomUUID() + "@opencart.com";
	}
	
	
	@DataProvider
	public Object[][] getPatientRegData()
	{
		return new Object[][]
		{
			{"Udhya", "Kumar", "9943980764", "45kljdls", "4", "Chennai", "tn", "56272"},
			{"Velan", "Raj", "9043980764", "11euwhfoike", "7", "Bangalore", "karnataka", "89383"},
			{"Kapoor", "Khan", "8543980764", "add123", "9", "Hyderabad", "AP", "39383"},
		};
		
	}
	
	
	@Test(dataProvider = "getPatientRegData")
	public void patientRegTest(String firstName, String lastName, String phoneNumber, String address, String floor, String city, String state, String zipcode)
	{
		boolean isRegDone = stiltoPage.patientRegisteration(firstName, lastName, phoneNumber, getRandomEmailID(), address, floor, city, state, zipcode);
		
		Assert.assertTrue(isRegDone);
	}

}
