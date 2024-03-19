package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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
		homepage.getHomepage();
		stiltoPage = homepage.navigateToStioltoRespimatPage();
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

}
