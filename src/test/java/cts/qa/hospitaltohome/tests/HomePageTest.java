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
		Assert.assertTrue(homePage.getHomepage());
	
	}
	
	@Description("Home page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 1)
	public void homePageURLTest()
	{
		Assert.assertEquals(homePage.getHomePageURL(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying Header BI logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 2)
	public void headerBILogoExist()
	{
		Assert.assertTrue(homePage.isHeaderBILogoExist());
	}
	
	@Description("Verifying Rate This Site Button exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 3)
	public void isRateThisSiteExistTest()
	{
		Assert.assertTrue(homePage.isRateThisSiteExist());
	}
	
	@Description("Home page title test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 4)
	public void homePageTitleTest()
	{
		Assert.assertEquals(homePage.getHomePageTitle(), Constants.HOME_PAGE_TITLE);
	}
	
	
	@Description("Header BI logo page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 5)
	public void headerBILogoPageURLTest()
	{
		Assert.assertEquals(homePage.getHeaderBILogoPageURL(), Constants.BI_PAGE_URL_FRACTION);
		
	}
	
	@Description("BI page title test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 6)
	public void biPageTitleTest()
	{
		Assert.assertEquals(homePage.getBIPageTitle(), Constants.BI_PAGE_TITLE);
	}
	
	
	@Description("Stiolto Prescribing Info Page url test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 7)
	public void stioltoPrescribingInfoPageURLTest()
	{
		Assert.assertEquals(homePage.getStioltoPrescribingInfoPageURL(), Constants.STIOLTO_PRESCRIBING_INFO_PDF);
	}
	
	
	@Description("Spiriva Prescribing Info Page url test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 8)
	public void spirivaPrescribingInfoPageURLTest()
	{
		Assert.assertEquals(homePage.getSpirivaPrescribingInfoPageURL(), Constants.SPIRIVA_PRESCRIBING_INFO_PDF);
	}
	
	
	@Description("Stiolto Product HCP Page url test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 9)
	public void stioltoProductPageURLTest()
	{
		Assert.assertEquals(homePage.getStioltoProductPageURL(), Constants.STIOLTO_PRODUCT_HCP_URL);
	}
	
	
	@Description("Spiriva Product HCP Page url test")
	@Severity(SeverityLevel.MINOR)
	@Test (priority = 10)
	public void spirivaProductPageURLTest()
	{
		Assert.assertEquals(homePage.getSpirivaProductPageURL(), Constants.SPIRIVA_PRODUCT_HCP_URL);
	}
	
	
	

	
	//FOOTER LINKS
	@Description("Verifying Footer BI logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test (priority = 11)
	public void footerBILogoExist()
	{
		Assert.assertTrue(homePage.isFooterBILogoExist());
	}
	
	
	@Description("Footer BI logo page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 12)
	public void footerBILogoPageURLTest()
	{
		Assert.assertEquals(homePage.getFooterBILogoPageURL(), Constants.BI_PAGE_URL_FRACTION);
		
	}
	
	
	@Description("Contact us link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 13)
	public void getFooterHomeLinkTest()
	{
		Assert.assertEquals(homePage.getFooterHomeLink(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	
	
	@Description("Contact us link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 14)
	public void getContactUsLinkTest()
	{
		Assert.assertEquals(homePage.getContactUsLink(), Constants.CONTACT_US_LINK);
	}
	
	
	@Description("Privacy Notice link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 15)
	public void getPrivacyNoticeLinkTest()
	{
		Assert.assertEquals(homePage.getPrivacyNoticeLink(), Constants.PRIVACY_NOTICE_PDF);
	}
	
	
	@Description("Terms of use link Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test (priority = 16)
	public void getTermsOfUseLinkTest()
	{
		Assert.assertEquals(homePage.getTermsOfUseLink(), Constants.TERMS_OF_USE_PDF);
	}
	
	
	
	
	
}
