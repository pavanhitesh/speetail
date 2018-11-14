package com.speetail.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.speetail.exception.AutomationException;
import com.speetail.utilities.ExtentReport;

public class SingletonAction {
	
Logger logger = LogManager.getLogger(SingletonAction.class);
	
	private static WebDriver driver;
	private static ExtentReport extentReport;
	private static Properties prop;
	private static final String STRING_FORMAT = "%s%s%s%s%s";
	
	
	public static ExtentReport getExtentReport() {
		if(extentReport==null) {
			extentReport = new ExtentReport();
		}
		return extentReport;
	}
	
	public static Properties getProperties() {
		
		try {
			if(prop==null) {
				prop = new Properties();
				prop.load(new FileInputStream(String.format(STRING_FORMAT, System.getProperty("user.dir"),File.separator,"config",File.separator,"testData.properties")));
			}
		}catch(Exception e) {
			throw new AutomationException("TestProperties not found",e);
		}
		return prop;
	}

	public static WebDriver getWebDriver(String browser) {
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("user.dir"));
		builder.append(File.separator);
		builder.append("driver");
		builder.append(File.separator);
		
		if(driver==null) {
			switch(browser) {
			case "ie" :
				builder.append("IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", builder.toString());
				driver = new InternetExplorerDriver();
				break;
			case "chrome":
				builder.append("chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", builder.toString());
				ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
				break;
			default:
				break;
			}
			driver.manage().window().maximize();
			return driver;
		}else {
			return driver;
		}
	}

}
