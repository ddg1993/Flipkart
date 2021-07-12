package FBMSG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPOM {

	@FindBy (xpath="//input[contains(@id,'email')]")
	private WebElement email;
	@FindBy (xpath="//input[contains(@id,'pas')]")
	private WebElement password;
	@FindBy (xpath="//button[contains(@type,'submit')]")
	private WebElement loginbtn;
	@FindBy (xpath="//input[contains(@name,'global')]")
	private WebElement searchbox;
	@FindBy (xpath="//span[text()='Message']")
	private WebElement message;
	@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")
	private WebElement msgblock;
	@FindBy (xpath= "//div[@aria-label='Press Enter to send']")
	private WebElement sendbtn;
	@FindBy (xpath= "(//span[text()='Add Friend'])[1]")
	private WebElement addFriend;
	
	@FindBy (xpath="//div[@aria-label='Close chat']")
	private WebElement closechat;
	
	@FindBy (xpath="//strong[text()='vivek pophali']")
	private WebElement vivek;
	@FindBy (xpath="//span[text()='Vivek Pophali']")
	private WebElement vivekProfile;
	
	@FindBy (xpath="//strong[text()='chhaya bade-dhakne']")
	private WebElement chhaya;
	@FindBy (xpath="//span[text()='Chhaya Bade-Dhakne']")
	private WebElement chhayaProfile;
	
	@FindBy (xpath="//strong[text()='pranati kanthake']")
	private WebElement pranati;
	@FindBy (xpath="//span[text()='Pranati Kanthake']")
	private WebElement pranatiProfile;
	
	@FindBy (xpath="//strong[text()='siddesh taras']")
	private WebElement siddesh;
	
	@FindBy (xpath="//span[text()='Siddesh Taras']")
	private WebElement siddeshProfile;
	

	
public FBPOM(WebDriver driver1 ) 
{
PageFactory.initElements(driver1, this);
}

public void email(String mail)
{
email.sendKeys(mail);
}

public void pass(String pass)
{	
password.sendKeys(pass);
}

public void loginbtn()
{
loginbtn.click();	
}

public void searchbox(String name)
{
searchbox.click();
searchbox.clear();
searchbox.sendKeys(name);
}


public void message()
{
message.click();	
}

public void msgbox(String msg)
{
msgblock.click();
msgblock.sendKeys(msg);
}

public void sendtn()
{
sendbtn.click();	
}

public void vivek()
{
vivek.click();	
}
public void vivekprofile()
{
vivekProfile.click();	
}

public void chhaya()
{
chhaya.click();	
}
public void chhayaprofile()
{
chhayaProfile.click();
}

public void pranati()
{
pranati.click();	
}
public void pranatiprofile()
{
pranatiProfile.click();
}

public void siddesh()
{
siddesh.click();	
}
public void siddeshprofile()
{
siddeshProfile.click();
}

public void friendreq()
{
addFriend.click();	
}

public void closechat()
{
closechat.click();	
}
}