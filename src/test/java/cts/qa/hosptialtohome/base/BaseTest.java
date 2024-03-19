package cts.qa.hosptialtohome.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.asserts.SoftAssert;

import cts.qa.hospitaltohome.factory.DriverFactory;
import cts.qa.hospitaltohome.pages.HomePage;
import cts.qa.hospitaltohome.pages.SpirivaRespimatPage;
import cts.qa.hospitaltohome.pages.StioltoRespimatPage;

//import com.qa.opencart.pages.LoginPage;
//import com.qa.opencart.pages.ProductInfoPage;
//import com.qa.opencart.pages.RegisterPage;
//import com.qa.opencart.pages.SerachResultsPage;

public class BaseTest {
	
	protected WebDriver driver;
	protected Properties prop;
	DriverFactory df;
	protected HomePage homepage;
	protected StioltoRespimatPage stiltoPage;
	protected SpirivaRespimatPage spirivaPage;
//	protected ProductInfoPage productInfoPage;
//	protected RegisterPage registerPage;
	
	
	
//	protected SoftAssert softAssert;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browserName)
	{
		df = new DriverFactory();
		prop = df.initProp();
		

		if(browserName != null)
		{
			prop.setProperty("browser", browserName);
		}
		
		driver = df.initDriver(prop);
		homepage = new HomePage(driver);
//		softAssert = new SoftAssert();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}