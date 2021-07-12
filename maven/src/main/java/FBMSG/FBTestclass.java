package FBMSG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBTestclass {

public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Software\\Selenium\\chromedriver\\chromedriver.exe");

ChromeOptions otp = new ChromeOptions();
otp.addArguments("disable-notifications");
WebDriver driver =  new ChromeDriver(otp);


driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
String p1 ="C:\\Users\\DJ\\Desktop\\excel.xlsx";
FileInputStream f1 = new FileInputStream(p1); 
Workbook w=WorkbookFactory.create(f1);
Sheet s = w.getSheet("fb");  //sheet fb
Row r = s.getRow(0);
Cell c = r.getCell(0);
String v =c.getStringCellValue();
int LR = s.getLastRowNum();
int LC = r.getLastCellNum();

Sheet msgsheet = w.getSheet("fbmsg");  // sheet msgsheet
Row r1 = msgsheet.getRow(0);
Cell c1 = r1.getCell(0);
String v1 =c1.getStringCellValue();
int LR1 = msgsheet.getLastRowNum();
int LC1 = r1.getLastCellNum();

System.out.println("LAST ROW NO. sheet fb " +LR);
System.out.println("LAST COLOUMN NO. sheet fb " +LC);
System.out.println("LAST ROW NO. sheet fbmsg " +LR1);
System.out.println("LAST COLOUMN NO. sheet fbmsg " +LC);

FBPOM fbmsg = new FBPOM(driver);

String username = s.getRow(0).getCell(0).getStringCellValue();
fbmsg.email(username);
String pass = s.getRow(0).getCell(1).getStringCellValue();
fbmsg.pass(pass);
fbmsg.loginbtn();
String fname = s.getRow(1).getCell(0).getStringCellValue();
fbmsg.searchbox(fname);
Thread.sleep(5000);
fbmsg.vivek();
Thread.sleep(5000);
fbmsg.message();
Thread.sleep(5000);
for(int i=0 ; i<=LR1; i++)
{
for (int j=0;j<LC1;j++)
{
String val = msgsheet.getRow(i).getCell(j).getStringCellValue();
fbmsg.msgbox(val);
fbmsg.sendtn();
}
}
}
}
