package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ISISpirivaPageTest extends BaseTest {
	
	
	@BeforeClass
	public void stioltoISISetUp()
	{
		homePage.getHomepage();
		isispirivaPage = homePage.navigateToSpirivaISIPage();
	}
	
	
	
	//SPIRIVA
	@Description("Spiriva prescribing info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 1)
	public void getSpirivaPrescribingInfoLinkTest()
	{
		Assert.assertEquals(isispirivaPage.getSpirivaPrescribingInfoLink(), Constants.SPIRIVA_PRESCRIBING_INFO_PDF);
	}
	
	
	@Description("Spiriva Instructions for use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 2)
	public void getSpirivaInstructionsforUseLinkTest()
	{
		Assert.assertEquals(isispirivaPage.getSpirivaInstructionsforUseLink(), Constants.SPIRIVA_INSTRUCTIONS_FOR_USE_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 3)
	public void getSpirivaHandihalerInfoLinkTest()
	{
		Assert.assertEquals(isispirivaPage.getSpirivaHandihalerInfoLink(), Constants.SPIRIVA_HANDIHALER_INFO_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Patient Info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 4)
	public void getSpirivaHandihalerPatientInfoLinkTest()
	{
		Assert.assertEquals(isispirivaPage.getSpirivaHandihalerPatientInfoLink(), Constants.SPIRIVA_HANDIHALER_PATIENT_INFO_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Instructions for use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 5)
	public void getSpirivaHandihalerInstructionForUseLinkTest()
	{
		Assert.assertEquals(isispirivaPage.getSpirivaHandihalerInstructionForUseLink(), Constants.SPIRIVA_HANDIHALER_INSTRUCTIONS_FOR_USE_PDF);
	}

}
