package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSigninTestclass{
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\Software\\Selenium\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();

	
FlipkartSigninPOM signin = new FlipkartSigninPOM(driver);
signin.user();
signin.pass();
signin.loginbtn();


profilepage profile = new profilepage(driver);
profile.profile();
profile.order();
profile.order1();

}
}
