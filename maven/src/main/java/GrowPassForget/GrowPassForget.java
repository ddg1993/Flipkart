package GrowPassForget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowPassForget
{

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Software\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://groww.in/");
	driver.manage().window().maximize();
	
	growtestclass signup = new growtestclass(driver);
	
	Thread.sleep(2000);
		
	signup.loginbtn();
	Thread.sleep(2000);
	signup.loginemail("gabhanedhiraj@gmail.com");
	Thread.sleep(2000);
	signup.continuebtn();
	Thread.sleep(2000);
	signup.forgotpass();
	}

}
