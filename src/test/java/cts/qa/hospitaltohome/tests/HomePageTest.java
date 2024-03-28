package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Design hospital to home page")
@Story("Home page features")
@Feature("Feature home page")
public class HomePageTest extends BaseTest {
	
	@Description("Home Page Navigation test")
	@Severity(SeverityLevel.MINOR)
	@BeforeClass 
	public void professionalbtnExistTest()
	{
		Assert.assertTrue(homepage.getHomepage());
	
	}
	
	@Description("Home page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 1)
	public void homePageURLTest()
	{
		Assert.assertEquals(homepage.getHomePageURL(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying Header BI logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 2)
	public void headerBILogoExist()
	{
		Assert.assertTrue(homepage.isHeaderBILogoExist());
	}
	
	@Description("Verifying Rate This Site Button exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 3)
	public void isRateThisSiteExistTest()
	{
		Assert.assertTrue(homepage.isRateThisSiteExist());
	}
	
	@Description("Home page title test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 4)
	public void homePageTitleTest()
	{
		Assert.assertEquals(homepage.getHomePageTitle(), Constants.HOME_PAGE_TITLE);
	}
	
	
	@Description("Header BI logo page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 5)
	public void headerBILogoPageURLTest()
	{
		Assert.assertEquals(homepage.getHeaderBILogoPageURL(), Constants.BI_PAGE_URL_FRACTION);
		
	}
	
	@Description("Home page title test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 6)
	public void biPageTitleTest()
	{
		Assert.assertEquals(homepage.getBIPageTitle(), Constants.BI_PAGE_TITLE);
	}
	
	
	//STIOLTO
	@Description("Stiolto Prescribing info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 7)
	public void getStioltoPrescrbinginfoLinkTest()
	{
		Assert.assertEquals(homepage.getStioltoPrescrbinginfoLink(), Constants.STIOLTO_PRESCRIBING_INFO_PDF);
	}
	
	@Description("Stiolto Patient info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 8)
	public void getStioltoPatientinfoLinkTest()
	{
		Assert.assertEquals(homepage.getStioltoPatientinfoLink(), Constants.STIOLTO_PATIENT_INFO_PDF);
	}
	
	@Description("Stiolto Instructions of use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 9)
	public void getStioltoInstructionsOfUseLinkTest()
	{
		Assert.assertEquals(homepage.getStioltoInstructionsOfUseLink(), Constants.STIOLTO_INSTRUCTIONS_FOR_USE_PDF);
	}
	
	
	//SPIRIVA
	@Description("Spiriva prescribing info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 10)
	public void getSpirivaPrescribingInfoLinkTest()
	{
		Assert.assertEquals(homepage.getSpirivaPrescribingInfoLink(), Constants.SPIRIVA_PRESCRIBING_INFO_PDF);
	}
	
	
	@Description("Spiriva Instructions for use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 11)
	public void getSpirivaInstructionsforUseLinkTest()
	{
		Assert.assertEquals(homepage.getSpirivaInstructionsforUseLink(), Constants.SPIRIVA_INSTRUCTIONS_FOR_USE_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 12)
	public void getSpirivaHandihalerInfoLinkTest()
	{
		Assert.assertEquals(homepage.getSpirivaHandihalerInfoLink(), Constants.SPIRIVA_HANDIHALER_INFO_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Patient Info link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 13)
	public void getSpirivaHandihalerPatientInfoLinkTest()
	{
		Assert.assertEquals(homepage.getSpirivaHandihalerPatientInfoLink(), Constants.SPIRIVA_HANDIHALER_PATIENT_INFO_PDF);
	}
	
	
	
	@Description("Spiriva Handihaler Instructions for use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 14)
	public void getSpirivaHandihalerInstructionForUseLinkTest()
	{
		Assert.assertEquals(homepage.getSpirivaHandihalerInstructionForUseLink(), Constants.SPIRIVA_HANDIHALER_INSTRUCTIONS_FOR_USE_PDF);
	}
	
	
	//FOOTER LINKS
	@Description("Verifying Footer BI logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 15)
	public void footerBILogoExist()
	{
		Assert.assertTrue(homepage.isFooterBILogoExist());
	}
	
	
	@Description("Footer BI logo page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 16)
	public void footerBILogoPageURLTest()
	{
		Assert.assertEquals(homepage.getFooterBILogoPageURL(), Constants.BI_PAGE_URL_FRACTION);
		
	}
	
	
	@Description("Contact us link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 17)
	public void getContactUsLinkTest()
	{
		Assert.assertEquals(homepage.getContactUsLink(), Constants.CONTACT_US_LINK);
	}
	
	
	@Description("Privacy Notice link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 18)
	public void getPrivacyNoticeLinkTest()
	{
		Assert.assertEquals(homepage.getPrivacyNoticeLink(), Constants.PRIVACY_NOTICE_PDF);
	}
	
	
	@Description("Terms of use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 29)
	public void getTermsOfUseLinkTest()
	{
		Assert.assertEquals(homepage.getTermsOfUseLink(), Constants.TERMS_OF_USE_PDF);
	}
	
	
	
	
	
}
