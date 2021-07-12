package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Flipkart.FlipkartSigninPOM;
import Flipkart.profilepage;

public class FlipkartSigninTestclass{
//public static void main(String[] args) 
WebDriver driver;
FlipkartSigninPOM signin;	
profilepage profile;


@BeforeMethod
public void browser()	
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\Software\\Selenium\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	//driver.manage().window().maximize();
	signin = new FlipkartSigninPOM(driver);
	profile = new profilepage(driver);
	}

	
@Test
	public void useridpass()	
	{
	signin.user();
	signin.pass();
	signin.loginbtn();
	}

	
@AfterMethod
	public void logout()
	{
	profile.profile();
	profile.logout();
	}


	}