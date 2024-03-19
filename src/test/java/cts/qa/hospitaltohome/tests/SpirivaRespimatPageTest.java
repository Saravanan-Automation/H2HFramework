package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ExcelUtil;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class SpirivaRespimatPageTest extends BaseTest {
	
	@BeforeClass
	public void spirivaSetUp()
	{
		homepage.getHomepage();
		spirivaPage = homepage.navigateToSpirivaRespimatPage();
	}
	
	
	@Description("Spiriva page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void SpirivaPageURLTest()
	{
		Assert.assertEquals(spirivaPage.getHomePageURL(), Constants.SPIRIVA_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying Spiriva logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void spirivaLogoExistTest()
	{
		Assert.assertTrue(spirivaPage.isLogoExist());
	}
	
	@Description("Spiriva page title test")
	@Severity(SeverityLevel.MINOR)
	@Test
	public void SpirivaPageTitleTest()
	{
		Assert.assertEquals(spirivaPage.getHomePageTitle(), Constants.SPIRIVA_PAGE_TITLE);
	}
	
	public String getRandomEmailID()
	{
		return "testautomation" + System.currentTimeMillis() + "@opencart.com";
	  //return "testautomation" + UUID.randomUUID() + "@opencart.com";
	}
	
	
//	@DataProvider
//	public Object[][] getPatientRegData()
//	{
//		return new Object[][]
//		{
//			{"Udhya", "Kumar", "9943980764", "45kljdls", "4", "Chennai", "tn", "56272"},
//			{"Velan", "Raj", "9043980764", "11euwhfoike", "7", "Bangalore", "karnataka", "89383"},
//			{"Kapoor", "Khan", "8543980764", "add123", "9", "Hyderabad", "AP", "39383"},
//		};
//	}
	
	
	@DataProvider
	public Object[][] getPatientRegExcelData() 
	{
		Object regData[][] = ExcelUtil.getTestData(Constants.PATIENT_REGISTER_DATA_SHEET_NAME);
		
		return regData;
	}
	
	@Test(dataProvider = "getPatientRegExcelData")
	public void patientRegTest(String firstName, String lastName, String phoneNumber, String address, String floor, String city, String state, String zipcode)
	{
		boolean isRegDone = spirivaPage.patientRegisteration(firstName, lastName, phoneNumber, getRandomEmailID(), address, floor, city, state, zipcode);
		
		Assert.assertTrue(isRegDone);
	}

}


