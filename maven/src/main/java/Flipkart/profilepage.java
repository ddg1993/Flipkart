package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilepage {

	private WebDriver driver;
	
	@FindBy (xpath="//div[text()='dhiraj']")
	private WebElement profile;
	@FindBy (xpath="(//a[contains(@class,'_2kxe')])[4]")
	private WebElement ord;
	@FindBy (xpath="(//span[contains(text(),'Atomberg ')])[1]")
	private WebElement order1;
	@FindBy (xpath="//span[contains(text(),'boAt Bassheads')]")
	private WebElement order2;
	@FindBy (xpath="//div[text()='Logout']")
	private WebElement logout;
	
	
public profilepage(WebDriver driver1) 
{
this.driver=driver1;
PageFactory.initElements(driver1, this);
}
	
public void profile()
{
Actions at = new Actions(driver);
at.moveToElement(profile).perform();	
}

public void order()
{
ord.click();	
}

public void order1()
{
order1.click();	
}

public void order2()
{
order2.click();	
}

public void logout()
{
logout.click();		
}
}
