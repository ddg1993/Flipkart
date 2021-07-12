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

public class FlipkartprofileTestclass{
//public static void main(String[] args) 
WebDriver driver;
FlipkartSigninPOM signin;	
profilepage profile;


@BeforeClass
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

	@BeforeMethod
	public void useridpass()	
	{
	signin.user();
	signin.pass();
	signin.loginbtn();
	}

	@Test
	public void aorder() throws InterruptedException
	{
	profile.profile();
	profile.order();
	profile.order1();
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	Assert.assertNotEquals(url1, "ps://www.flipkart.com/order_details?order_id=OD222224589808410000&item_id=22222458980841000&unit_id=22222458980841000000");
	String title1=driver.getTitle();
	System.out.println(title1);
	boolean r=title1.equals("Flipkart.com: Order Information");
	Assert.assertTrue(r);
	Thread.sleep(5000);
	}

	@Test
	public void border() throws InterruptedException
	{
	profile.profile();
	profile.order();
	profile.order2();
	SoftAssert softas = new SoftAssert();
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	softas.assertEquals(url1, "https://www.flipkart.com/order_details?order_id=OD222224440235165000&item_id=22222444023516501&unit_id=22222444023516501000");
	String title1=driver.getTitle();
	boolean r1=title1.equals("Flipkart.com: Order Information");
	System.out.println(title1);
	softas.assertTrue(r1);
	softas.assertAll();
	Thread.sleep(5000);
	}

	@AfterMethod
	public void logout()
	{
	profile.profile();
	profile.logout();
	}

	@AfterClass
	public void close()
	{
		driver.manage().window().maximize();
	}

	}