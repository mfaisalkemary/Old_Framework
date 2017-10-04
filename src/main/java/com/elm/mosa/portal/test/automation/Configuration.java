package com.elm.mosa.portal.test.automation;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DSSProgram_Configuration_Page;
import pages.SSP_Login_Page;

public class Configuration  {
public DSSProgram_Configuration_Page ProcessPage;
public SSP_Login_Page LoginPage;
public WebDriver Driver;
public String username ;
public String Password ;

/*
@BeforeMethod
public void setup() throws InterruptedException{
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Chrome/chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("no-sandbox");
    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
    Driver = new ChromeDriver(capabilities);
	//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");

	
	
	System.out.println("calling configuration setup");
	//Driver = new FirefoxDriver();
    LoginPage = new SSP_Login_Page(Driver);
	ProcessPage = new DSSProgram_Configuration_Page(Driver);
	Driver.get("http://localhost:8080/SSP-WEB/login");
	Driver.manage().window().maximize();
	LoginPage.login("opn_admin", "admin");
}
*/



public Configuration (WebDriver Driver1) throws InterruptedException{
	System.out.println("calling configuration constructor");
	this.Driver=Driver1;
	//this.username=User;
	//this.Password=Pass;
	ProcessPage = new DSSProgram_Configuration_Page(Driver1);
	//LoginPage = new SSP_Login_Page(Driver1);
	//LoginPage.login(User, Pass);
	
}










public void ConfigureAE() throws InterruptedException{
	System.out.println("calling configure AE method");
	ProcessPage.ConfigureAeProcesse();
   Assert.assertEquals(ProcessPage.ReturnAEconfigurationResult(),"item.configured === true");
   end();
   
}




public void ConfigureHE() throws InterruptedException{
	ProcessPage.configureHEProcess();
	Assert.assertEquals(ProcessPage.ReturnHEconfigurationResult(),"item.configured === true");
}



@Test(priority=3)
public void ConfigureAI() throws InterruptedException{
	ProcessPage.ConfigureAIprocess();
	Assert.assertEquals(ProcessPage.ReturnAIconfiguratioresult(),"item.configured === true");
}


@Test(priority=4)
public void ConfigureDQdependent() throws InterruptedException{
	ProcessPage.ConfigureDQDependent();
	Assert.assertEquals(ProcessPage.returnDQdependentResult(),"item.configured === true");
}



@Test(priority=5)
public void ConfigureDCdependent() throws InterruptedException{
ProcessPage.ConfigureDCdependent();
Assert.assertEquals(ProcessPage.returnDataConsolidationdependentresult(),"item.configured === true");
}


@Test(priority=6)
public void ConfigureEWSdepedent() throws InterruptedException{
ProcessPage.ConfigureEWSDependent();
Assert.assertEquals(ProcessPage.returnEligibilityWorkSpaceDependentresult(),"item.configured === true");
}


@Test (priority=7)
public void ConfigureCESdependent() throws InterruptedException{
	ProcessPage.ConfigureCESDependent();
	Assert.assertEquals(ProcessPage.returnCoreEligibilitySimulationDependentresult(),"item.configured === true");
}

@Test(priority=8)
public void ConfigureCEdependent() throws InterruptedException{
	ProcessPage.ConfigureCEDependent();
	Assert.assertEquals(ProcessPage.returnCoreEligibilityDependentresult(), "item.configured === true");
}


@Test(priority=9)
public void configureDQ() throws InterruptedException{
	ProcessPage.ConfigureDQ();
	Assert.assertEquals(ProcessPage.returnConfiguredataqualityresult(),"item.configured === true");
	
}

@Test(priority=10)
public void configureDC() throws InterruptedException{
	ProcessPage.ConfigureDC();
	Assert.assertEquals(ProcessPage.returnConfigureDataConsolidationresult(), "item.configured === true");
}

@Test(priority=11)
public void configureEWS() throws InterruptedException{
	ProcessPage.ConfigureEWS();
	Assert.assertEquals(ProcessPage.returnConfigureeligibilityworkSpaceresult(), "item.configured === true");
}


	
@Test(priority=12)
public void ConfigureCESA() throws InterruptedException{
	ProcessPage.ConfigureCESA();
	Assert.assertEquals(ProcessPage.returnCoreeligibilitysimulationapplicantresult(), "item.configured === true");
}

@Test (priority=13)
public void ConfigureCEA() throws InterruptedException{
	ProcessPage.ConfigureCEA();
	Assert.assertEquals(ProcessPage.returnCoreEligibilityApplicantresult(), "item.configured === true");
}

@AfterMethod
public void end(){
	Driver.quit();
}

}
