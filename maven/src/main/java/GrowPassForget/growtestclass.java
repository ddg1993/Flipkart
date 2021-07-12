package GrowPassForget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growtestclass {

	@FindBy (xpath = "//span[text()='Login/Register']")
	private WebElement loginbtn;
	
	@FindBy (xpath ="//input[@id='login_email1']")
	private WebElement loginemail;
	
	@FindBy (xpath ="//span[text()='Continue']")
	private WebElement continuebtn;
	
	@FindBy (xpath ="//div[text()='Forgot Password?']")
	private WebElement forgotpass;
	
public growtestclass(WebDriver driver1 ) {
	PageFactory.initElements(driver1, this);
}

public void loginbtn()
{
loginbtn.click();	
}

public void loginemail(String a)
{
loginemail.sendKeys(a);	
}

public void continuebtn()
{
continuebtn.click();	
}

public void forgotpass()
{
forgotpass.click();	
}

}
