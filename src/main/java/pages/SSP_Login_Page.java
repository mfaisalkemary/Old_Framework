package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SSP_Login_Page {
WebDriver Driver;
WebDriverWait Wait;



@FindBy (name="username")
WebElement username;

@FindBy (name="password")
WebElement password;

@FindBy (css=".btn")
WebElement loginbutton;

@FindBy (id="enterpriseServicesLink")
WebElement enterpriseservice;

@FindBy (css="ul.nav:nth-child(6) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")
WebElement process;

@FindBy (css=".icon-briefcase > center:nth-child(1) > input:nth-child(1)")
WebElement SelectAllProcesses;

@FindBy (css="div.wizard-control:nth-child(1)")
WebElement PageIdentifier;

public  SSP_Login_Page(WebDriver Driver){
	this.Driver=Driver;
	PageFactory.initElements(Driver, this);
}


public void login(String username1,String password1 ) throws InterruptedException{
	username.sendKeys(username1);
	password.sendKeys(password1);
	Wait = new WebDriverWait(Driver, 30);
	loginbutton.click();
	enterpriseservice.click();
	Wait.until(ExpectedConditions.visibilityOf(PageIdentifier));
}


}
