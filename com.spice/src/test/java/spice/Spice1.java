package spice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Spice1 {
  
public WebDriver driver;
	
	public Actions action;
	
	
  @Test(priority=1)
  public void spicelog() throws Exception {
	  
	  action = new Actions(driver);
	  //login First mouse over
	  WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
	  action.moveToElement(ele1).build().perform();
	  //second mouse over
	  
	  Thread.sleep(3000);
	 //MOUSEOVER FOR REGISTER
	  WebElement ele3 = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
	  action.moveToElement(ele3).build().perform();
	  Thread.sleep(4000);
      driver.findElement(By.linkText("Member Login")).click();
	  
	  //driver.findElement(By.linkText("Sign up")).click();
		
	  
  }
  
	/*
	 * @Test(priority=2) public void registration() throws Exception {
	 * Thread.sleep(2000); new Select(driver.findElement(By.name(
	 * "CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$DropDownListTitle"))).
	 * selectByIndex(1); Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).
	 * sendKeys("Ramesh"); Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).
	 * sendKeys("Patel"); Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).
	 * sendKeys("6303278540"); Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword"
	 * )). sendKeys("Ravi@123"); Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm"
	 * )). sendKeys("Ravi@123"); Thread.sleep(2000); //DATE PICKER
	 * driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")).click();
	 * driver.findElement(By.xpath("//th[@class='datepickerGoPrev']//a//span")).
	 * click(); driver.findElement(By.xpath(
	 * "//tbody[@class='datepickerYears']//tr[3]//td[3]//a[1]")).click();
	 * driver.findElement(By.xpath(
	 * "//tbody[@class='datepickerMonths']//tr[2]//td[3]//a[1]")).click();
	 * driver.findElement(By.
	 * xpath("//td[@class='datepickerSunday validDate']//span[contains(text(),'17')]"
	 * )).click();
	 * 
	 * Thread.sleep(2000); driver.findElement(By.id(
	 * "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).
	 * sendKeys("rameshgurram7969@gmail.com"); Thread.sleep(2000);
	 * driver.findElement(By.id("chkSpiceClubTnC")). click(); Thread.sleep(2000);
	 * driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_ButtonSubmit")). click();
	 * 
	 * }
	 */	  
  @Test(priority=2)
  public void spicelogin() throws Exception {
	  driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("6303278541");  
	  driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("raviramesh99");  
	  driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn")).click();  
	  
  
  }

  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();        //maximize the window
	  driver.get("https://www.spicejet.com/");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
