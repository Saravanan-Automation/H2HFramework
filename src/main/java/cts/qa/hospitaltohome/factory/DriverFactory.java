package cts.qa.hospitaltohome.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import cts.qa.hospitaltohome.exception.FrameworkException;



public class DriverFactory {
	
	WebDriver driver;
	Properties prop;
	OptionsManager optionsManager;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public static String highlight = null;
	
	public WebDriver initDriver(Properties prop)
	{
		//String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		System.out.println("Browser name is: " +browserName);
		
		highlight = prop.getProperty("highlight");
		
		optionsManager = new OptionsManager(prop);
		
		switch(browserName.toLowerCase().trim())
		{
		
		case "chrome":
			//driver = new ChromeDriver(optionsManager.getChromeOptions());
			tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
			break;
			
		case "firefox":
			//driver = new FirefoxDriver(optionsManager.getFirefoxOptions());
			tlDriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
			break;
			
		case "edge":
			//driver = new EdgeDriver(optionsManager.getEdgeOptions());
			tlDriver.set(new EdgeDriver(optionsManager.getEdgeOptions()));
			break;
			
		case "safari":
			//driver = new SafariDriver();
			tlDriver.set(new SafariDriver());
			break;
			
		default:
			System.out.println("Please pass the right browser name..." + browserName);
			throw new FrameworkException("No Browser Found...");
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(prop.getProperty("url"));
		
		return getDriver();
			
	}
	
	public static WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
	public Properties initProp()
	{
		//mvn clean install -Denv="qa"
		//mvn clean install
		FileInputStream ip = null;
		prop = new Properties();
		
		String envName = System.getProperty("env");
		System.out.println("Environment name is: " + envName);
		
		
		try {
		if(envName == null)
		{
			System.out.println("Your environment is null, hence running tests on QA Environment");
			ip = new FileInputStream("./src/test/resources/config/config.dev.properties");
			
		}
		
		else
		{
			switch(envName.toLowerCase().trim())
			{
			
			case "qa":
				ip = new FileInputStream("./src/test/resources/config/config.qa.properties");
				break;
				
			case "dev":
				ip = new FileInputStream("./src/test/resources/config/config.dev.properties");
				break;
				
			case "stage":
				ip = new FileInputStream("./src/test/resources/config/config.stage.properties");
				break;
				
			case "uat":
				ip = new FileInputStream("./src/test/resources/config/config.uat.properties");
				break;
				
			case "prod":
				ip = new FileInputStream("./src/test/resources/config/config.properties");
				break;
				
			default:
				System.out.println("Please pass the right environment name: " + envName);
				throw new FrameworkException("Wrong Environment name: " + envName);
			}				
		}
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	
		return prop;
	}

public static String getScreenshot(String methodName) {
		
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir") + "/screenshots/" + methodName + "_" + System.currentTimeMillis()+".png";
				
		File destination = new File(path);
		
		try {
			FileHandler.copy(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

}