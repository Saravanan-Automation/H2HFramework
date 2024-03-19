package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
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
	@Test
	public void professionalbtnExistTest()
	{
		Assert.assertTrue(homepage.getHomepage());
	}
	
	@Description("Home page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void homePageURLTest()
	{
		Assert.assertEquals(homepage.getHomePageURL(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying BI logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void logoExistTest()
	{
		Assert.assertTrue(homepage.isLogoExist());
	}
	
	@Description("Home page title test")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 4)
	public void homePageTitleTest()
	{
		Assert.assertEquals(homepage.getHomePageTitle(), Constants.HOME_PAGE_TITLE);
	}
	
}
