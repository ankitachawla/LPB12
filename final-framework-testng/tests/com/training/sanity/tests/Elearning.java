package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginEl;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Elearning {


	private WebDriver driver;
	private String baseUrl;
	private LoginEl loginEl;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginEl = new LoginEl(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(enabled=false)
	public void validLoginTest() {
		
		loginEl.sendUserName("admin");
		loginEl.sendPassword("admin@123");
		loginEl.clickLoginBtn(); 
		screenShot.captureScreenShot("screenshot/First");
	}
	
	@Test(enabled=false)
	public void lostPasswordLink()
	{
		loginEl.sendUserName("admin");
		loginEl.clicklostbutton();
	}
		
	@Test
	public void clicksignUp()
	{
		loginEl.clicksignUp();
		loginEl.regfirstname("test");
		loginEl.reglastname("test");
		loginEl.regemail("test@test.com");
		loginEl.regpass1("welcome");
		loginEl.regskype("ABC");
		loginEl.regusername("Test");
		//loginEl.Lang();
		loginEl.regphone("12345");
		loginEl.regcode("123");
		loginEl.reglinkurl("a@a.com");
	}	
		
	}