package com.elm.mosa.portal.test.automation;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SSP_Login_Page;


public class Configure_Execute  {

	WebDriver Driver;
	String User="opn_admin";
	String Pass ="admin";
	Configuration configuration;
    SSP_Login_Page LoginPage;
	Execution execution;
	//Execution executer; 
  /*
	public Configure_Execute() throws InterruptedException{
		executer = new Execution();
	}
	*/

	@BeforeMethod
	public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Chrome/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("no-sandbox");
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	     Driver = new ChromeDriver(capabilities);
	     Driver.get("http://localhost:8080/SSP-WEB/login");
	 	 Driver.manage().window().maximize();
	     LoginPage = new SSP_Login_Page(Driver);
	 	 LoginPage.login(User, Pass);
	     configuration = new Configuration(Driver);
	     execution = new Execution(Driver);

	}
	
	
   @Test(priority=1)
	public void ConfigureAE() throws InterruptedException{
		configuration.ConfigureAE();
	}

	
	@Test(priority=2)
	public void ConfigureHE() throws InterruptedException{
		configuration.ConfigureHE();
	}
	
	
	@Test(priority=3)
	public void ConfigureAI() throws InterruptedException{
		configuration.ConfigureAI();
	}
	
	
	@Test(priority=4)
	public void ConfigureDQD() throws InterruptedException{
		configuration.ConfigureDQdependent();
	}
	
	@Test(priority=5)
	public void ConfigureDCD() throws InterruptedException{
		configuration.ConfigureDCdependent();
	}
	
	@Test(priority=6)
	public void ConfigureEWSD() throws InterruptedException{
		configuration.ConfigureEWSdepedent();
	}
	
	@Test(priority=7)
	public void ConfigureCESD() throws InterruptedException{
		configuration.ConfigureCESdependent();
	}
	
	@Test(priority=8)
	public void ConfigureCED() throws InterruptedException{
		configuration.ConfigureCEdependent();
	}
	
	@Test(priority=9)
	public void ConfigureDQ() throws InterruptedException{
		configuration.configureDQ();
	}
	
	@Test(priority=10)
	public void ConfigureDC() throws InterruptedException{
		configuration.configureDC();
	}
	
	@Test(priority=11)
	public void ConfigureEWS() throws InterruptedException{
		configuration.configureEWS();
	}
	
	@Test(priority=12)
	public void ConfigureCESA() throws InterruptedException{
		configuration.ConfigureCESA();
	}
	
	@Test(priority=13)
	public void ConfigureCEA() throws InterruptedException{
		configuration.ConfigureCEA();
	}

	@Test(priority=14)
	public void ExecuteAE() throws ClassNotFoundException, SQLException, IOException, InterruptedException{
		execution.Applicant_Extraction();
	}
	
	@Test(priority=15)
	public void ExecuteHE() throws IOException, InterruptedException{
	execution.Household_Extraction();
	
	}
	
	@Test(priority=16)
	public void ExecuteAI() throws InterruptedException{
		execution.Agency_Integration();
	}
	
	@Test(priority=17)
	public void ExecuteDQD() throws InterruptedException{
		execution.Data_Quality_Dependent();
	}
	
	@Test (priority=18)
	public void ExecuteDCD() throws InterruptedException{
		execution.Data_Consolidation_Dependent();
	}
	
	@Test(priority =19)
	public void ExecuteEWSD() throws InterruptedException{
		execution.Eligibility_WorkSpace_Dependent();
	}
	
	@Test (priority=20)
	public void ExecuteCESD() throws InterruptedException{
		execution.Core_Eligibility_Simulation_Dependent();
	}
	
	@Test (priority=21)
	public void ExecueCED() throws InterruptedException{
		execution.Core_Eligibility_Dependent();
	}
	
	@Test(priority=22)
	public void ExecuteDQ() throws InterruptedException{
		execution.Data_Quality();
	}
	
	@Test(priority=23)
	public void ExecuteDC() throws InterruptedException{
		execution.Data_Consolidation();
	}
	
	@Test(priority=24)
	public void ExecuteEWS() throws InterruptedException{
		execution.Eligibility_WorkSpace();
	}
	
	@Test (priority=25)
	public void ExecuteCESA() throws InterruptedException{
		execution.Core_Eligibility_Simulation_Applicant();
	}
	
	@Test (priority=26)
	public void ExecuteCEA() throws InterruptedException{
		execution.Core_Eligibility_Applicant();
	}
	
	@AfterMethod
	public void End(){
		Driver.quit();
	}
   
}
