package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSigninPOM {


	
@FindBy (xpath="//a[text()='Login']")
private WebElement login;
@FindBy (xpath="(//input[contains(@class,'_2IX_2- ')])[1]")
private WebElement userid;
@FindBy (xpath="(//input[contains(@class,'_2IX_2- ')])[2]")
private WebElement password;	
@FindBy (xpath="(//button[@type='submit'])[2]")
private WebElement loginbtn;


public FlipkartSigninPOM(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}

public void login()
{
login.click();	
}

public void user()
{	
userid.sendKeys("8446507570");
}

public void pass()
{
password.click();	
password.sendKeys("Dhiraj1993");
}

public void loginbtn()
{
loginbtn.click();	
}

}
