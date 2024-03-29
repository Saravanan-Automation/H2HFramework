package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ISIStioltoPageTest extends BaseTest {
	
	
	@BeforeClass
	public void stioltoISISetUp()
	{
		homePage.getHomepage();
		isistioltoPage = homePage.navigateToStioltoISIPage();
	}
	

	
	//STIOLTO
	@Description("Stiolto Prescribing info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 1)
	public void getStioltoPrescrbinginfoLinkTest()
	{
		Assert.assertEquals(isistioltoPage.getStioltoPrescrbinginfoLink(), Constants.STIOLTO_PRESCRIBING_INFO_PDF);
	}
	
	@Description("Stiolto Patient info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 2)
	public void getStioltoPatientinfoLinkTest()
	{
		Assert.assertEquals(isistioltoPage.getStioltoPatientinfoLink(), Constants.STIOLTO_PATIENT_INFO_PDF);
	}
	
	@Description("Stiolto Instructions of use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 3)
	public void getStioltoInstructionsOfUseLinkTest()
	{
		Assert.assertEquals(isistioltoPage.getStioltoInstructionsOfUseLink(), Constants.STIOLTO_INSTRUCTIONS_FOR_USE_PDF);
	}
	
	

}
