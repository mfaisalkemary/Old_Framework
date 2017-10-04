package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
public class DSSProgram_Configuration_Page {
WebDriver Driver;
WebDriverWait Wait;
Actions action;
//Actions builder = new Actions(Driver);

@FindBy (css="ul.nav:nth-child(6) > li:nth-child(1)")
WebElement Process;

//#wizard > form > div > div.form-group > table > tbody > tr:nth-child(1) > td.centeriz > center > input
/*@FindBy (css="tr.ng-scope:nth-child(1) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureAe;*/


@FindBy (css="#wizard > form > div > div.form-group > table > tbody > tr:nth-child(1) > td.centeriz > center > input")
WebElement SelectConfigureAe;

@FindBy (css="tr.ng-scope:nth-child(2) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureHE;



@FindBy (css="tr.ng-scope:nth-child(1) > td:nth-child(2)")
WebElement ConfigurationPageIdentifier;


@FindBy(css="tr.ng-scope:nth-child(3) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureAI;


@FindBy (css="tr.ng-scope:nth-child(4) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureDQDependent;


@FindBy(css="tr.ng-scope:nth-child(5) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureDCdependent;


@FindBy (css="tr.ng-scope:nth-child(6) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigurEWSdependent;

@FindBy(css="tr.ng-scope:nth-child(7) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureCESdepedent;

@FindBy (css="tr.ng-scope:nth-child(8) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureCEdependent;

@FindBy (css="tr.ng-scope:nth-child(9) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureDQ;

@FindBy (css="tr.ng-scope:nth-child(10) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectconfigureDC;


@FindBy (css="tr.ng-scope:nth-child(11) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectconfigureEW;


@FindBy(css="tr.ng-scope:nth-child(12) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectconfigureCESApplicant;

@FindBy (css="tr.ng-scope:nth-child(13) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
WebElement SelectConfigureCEApplicant;

@FindBy (css="tr.ng-scope:nth-child(1) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement AEconfigurationwaiting;

@FindBy (css="tr.ng-scope:nth-child(1) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
public WebElement AEconfigurationresult;

@FindBy (css="tr.ng-scope:nth-child(2) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement HEconfigurationresult;

@FindBy (css="tr.ng-scope:nth-child(2) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement HEconfigurationwaiting;


@FindBy (css="tr.ng-scope:nth-child(3) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement AIconfigurationresult;

@FindBy (css="tr.ng-scope:nth-child(3) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement AIconfigurationrwaiting;
            
@FindBy (css="tr.ng-scope:nth-child(4) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement DQDependentconfiguratioresult;

            
@FindBy (css="tr.ng-scope:nth-child(4) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement DQDependentconfiguratiowaiting;

@FindBy (css="tr.ng-scope:nth-child(5) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement DCdependentResult;

@FindBy (css="tr.ng-scope:nth-child(5) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement DCdependentwaiting;


@FindBy (css="tr.ng-scope:nth-child(6) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement EWSDependentresult;

@FindBy (css="tr.ng-scope:nth-child(6) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement EWSDependentdependentwaiting;


@FindBy (css="tr.ng-scope:nth-child(7) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement CESdepedentresult; 

@FindBy (css="tr.ng-scope:nth-child(7) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement CESdepedentwaiting; 

@FindBy (css="tr.ng-scope:nth-child(8) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement CEdependentresult;

@FindBy (css="tr.ng-scope:nth-child(8) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement CEdependentwaiting;

@FindBy (css="tr.ng-scope:nth-child(9) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement ConfigureDQresult;

@FindBy (css="tr.ng-scope:nth-child(9) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement ConfigureDQwaiting; 

@FindBy (css="tr.ng-scope:nth-child(10) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement ConfigureDCresult; 

@FindBy (css="tr.ng-scope:nth-child(10) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement ConfigureDCwaiting; 


@FindBy (css="tr.ng-scope:nth-child(11) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement ConfigureEWresult;

@FindBy (css="tr.ng-scope:nth-child(11) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement ConfigureEWwaiting;


@FindBy (css="tr.ng-scope:nth-child(12) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement ConfigureCESApplicantresult; 

@FindBy (css="tr.ng-scope:nth-child(12) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement ConfigureCESApplicantwaiting;


@FindBy (css="tr.ng-scope:nth-child(13) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
WebElement ConfigureCEApplicantresult;

@FindBy (css="tr.ng-scope:nth-child(13) > td:nth-child(4) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
WebElement ConfigureCEApplicanttwaiting;


@FindBy (css="li.next:nth-child(2) > a:nth-child(1)")
WebElement ConfigureButton;
	


@FindBy (css=".open > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
WebElement Configuremenu1;


@FindBy (id="106_anchor")
WebElement Configuremenu;


@FindBy (id="106")
WebElement processlink;

@FindBy (css="ul.nav:nth-child(6) > li:nth-child(1) > a:nth-child(1)")
WebElement processDropDown;
//ul.nav:nth-child(6) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1)
@FindBy (css="ul.nav:nth-child(6) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1)")
WebElement ChooseEligibility;

//.open > ul:nth-child(2) > li:nth-child(1)

@FindBy(css="ul.nav:nth-child(6) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2)")
WebElement ChooseConfigue;


@FindBy (css="ul.nav:nth-child(6) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2)")
WebElement Configure;


@FindBy (id="106_anchor")
WebElement RightClick;


@FindBy (css=".vakata-context > li:nth-child(1) > a:nth-child(1)")
WebElement Eligibility_From_Right_click;

@FindBy (css=".vakata-context > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
WebElement Configure_From_Right_click;


public  DSSProgram_Configuration_Page(WebDriver Drive){
	this.Driver = Drive;
	PageFactory.initElements(Drive, this);
	 action= new Actions(Driver);
}



public void Rightclick(WebElement element){
	
	
}



public void ConfigureAeProcesse() throws InterruptedException{
	System.out.println("configuring AE from configuration page ");
	Wait = new WebDriverWait(Driver,1600);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(3000);
	Configure_From_Right_click.click();
	System.out.println("Waiting for AE checkbox");
	Wait.until(ExpectedConditions.visibilityOf(SelectConfigureAe));
	SelectConfigureAe.click();
	Thread.sleep(2000);
	System.out.println("AE checkbox clicked");
    ConfigureButton.click();
    //Thread.sleep(3000);
    Wait.until( new ExpectedCondition<Boolean>(){
		@Override
		public Boolean apply(WebDriver Driver) {
			String copmleted = AEconfigurationwaiting.getAttribute("class");
			while (copmleted.equals("")) 
			{				
				
			return false;
			
			}
			try {
				Thread.sleep(3600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
    	
    }
    );
   
}




public void configureHEProcess() throws InterruptedException{
	Wait = new WebDriverWait(Driver, 180000);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(3000);
	Configure_From_Right_click.click();
	Thread.sleep(3000);
	SelectConfigureHE.click();
	ConfigureButton.click();
	 Thread.sleep(3000);
	Wait.until( new ExpectedCondition<Boolean>(){
		@Override
		public Boolean apply(WebDriver Driver) {
			String copmleted = HEconfigurationwaiting.getAttribute("class");
			while (copmleted.equals("")) 
			{				
				
			return false;
			
			}
			try {
				Thread.sleep(3600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		
    	
    }
);
}



public void ConfigureAIprocess() throws InterruptedException{
	Wait = new WebDriverWait(Driver, 180000);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(2000);
	Configure_From_Right_click.click();
	Thread.sleep(3000);
	SelectConfigureAI.click();
	ConfigureButton.click();
	Thread.sleep(3000);
	Wait.until( new ExpectedCondition<Boolean>(){

		@Override
		public Boolean apply(WebDriver Driver) {
			String copmleted = AIconfigurationrwaiting.getAttribute("class");
			while (copmleted.equals("")) 
			{				
				
			return false;
			
			}
			try {
				Thread.sleep(3600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
    	
    }
);	
}



public void ConfigureDQDependent() throws InterruptedException{
	Wait = new WebDriverWait(Driver, 180000);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(2000);
	Configure_From_Right_click.click();
	Thread.sleep(2000);
	SelectConfigureDQDependent.click();
	ConfigureButton.click();
	Thread.sleep(3000);
	Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String completed = DQDependentconfiguratiowaiting.getAttribute("class");
				while (completed.equals("")){
					
					return false;
				}
				
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			{
			return true;
			
	}
			}
	}
		);
}




/*
public  ExpectedCondition<Boolean> validate (){
	return new ExpectedCondition<Boolean>(){
	@Override
	public Boolean apply(WebDriver Driver) {
		String copmleted = DQdependentwaiting.getAttribute("class");
		if(copmleted.equals("ng-hide"))
			return true;
		else
			apply(Driver);
	};

};
}
*/






public void ConfigureDCdependent() throws InterruptedException{
	Wait = new WebDriverWait(Driver, 180000);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(2000);
	Configure_From_Right_click.click();
	Thread.sleep(2000);
	SelectConfigureDCdependent.click();
	ConfigureButton.click();
	Thread.sleep(3000);
	Wait.until( new ExpectedCondition<Boolean>(){
		@Override
		public Boolean apply(WebDriver Driver) {
			String copmleted = DCdependentwaiting.getAttribute("class");
			
			while (copmleted.equals("")) 
			{				
				
				return false;
				
			}
			try {
				Thread.sleep(3600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		    }
    	
    }
);		
}

/*
public void ConfigureDCdependent() throws InterruptedException{
	Wait = new WebDriverWait(Driver, 180000);
	action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(2000);
	Configure_From_Right_click.click();
	Thread.sleep(2000);
	SelectConfigureDCdependent.click();
	ConfigureButton.click();
	Thread.sleep(3000);
	Wait.until( new ExpectedCondition<Boolean>(){
		@Override
		public Boolean apply(WebDriver Driver) {
			String copmleted = DataConsolidationdependentwaiting.getAttribute("class");
			while (copmleted.equals("")) 
			{				
				return false;
				}
			try {
				Thread.sleep(3600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		    
		}
    	
    }
);		
	
}
*/

	public void ConfigureEWSDependent() throws InterruptedException{ 
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectConfigurEWSdependent.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = EWSDependentdependentwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);		
		
	
}
	
	
	public void ConfigureCESDependent() throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectConfigureCESdepedent.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = CESdepedentwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);		
		
	}
	
	
	
	public void  ConfigureCEDependent () throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectConfigureCEdependent.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = CEdependentwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);			
		
	}
	
	
	public void  ConfigureDQ() throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectConfigureDQ.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = ConfigureDQwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    
			}
	    	
	    }
	);			
		
	}

	
	public void  ConfigureDC() throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectconfigureDC.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = ConfigureDCwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);
		
	}
	
	public void ConfigureEWS () throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectconfigureEW.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = ConfigureEWwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);
		
	}
	
	public void ConfigureCESA() throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectconfigureCESApplicant.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = ConfigureCESApplicantwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);
		
	}
	
	
	public void ConfigureCEA () throws InterruptedException{
		Wait = new WebDriverWait(Driver, 180000);
		action.contextClick(RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(2000);
		Configure_From_Right_click.click();
		Thread.sleep(2000);
		SelectConfigureCEApplicant.click();
		ConfigureButton.click();
		Thread.sleep(3000);
		Wait.until( new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver Driver) {
				String copmleted = ConfigureCEApplicanttwaiting.getAttribute("class");
				while (copmleted.equals("")) 
				{				return false;
				}
				try {
					Thread.sleep(3600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			    }
	    	
	    }
	);
		
	}
	
public String ReturnAEconfigurationResult (){
	if (AEconfigurationresult.getAttribute("class").equals("")){
	return AIconfigurationresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}


public String ReturnHEconfigurationResult (){
	if (HEconfigurationresult.getAttribute("class").equals("")){
	return HEconfigurationresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

/*
public String ReturnHEconfigurationresult (){
	if (HEconfigurationresult.getAttribute("class").equals("")){
	return HEconfigurationresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}
*/

public String ReturnAIconfiguratioresult (){
	if (AIconfigurationresult.getAttribute("class").equals("")){
	return AIconfigurationresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnDQdependentResult (){
	if (DQDependentconfiguratioresult.getAttribute("class").equals("")){
	return DQDependentconfiguratioresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnDataConsolidationdependentresult(){
	if (DCdependentResult.getAttribute("class").equals("")){
	return DCdependentResult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnEligibilityWorkSpaceDependentresult(){
	if (EWSDependentresult.getAttribute("class").equals("")){
	return EWSDependentresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}


public String returnCoreEligibilitySimulationDependentresult(){
	if (CESdepedentresult.getAttribute("class").equals("")){
	return CESdepedentresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnCoreEligibilityDependentresult(){
	if (CEdependentresult.getAttribute("class").equals("")){
	return CEdependentresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnConfiguredataqualityresult (){
	if (ConfigureDQresult.getAttribute("class").equals("")){
	return ConfigureDQresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnConfigureDataConsolidationresult(){
	if (ConfigureDCresult.getAttribute("class").equals("")){
	return ConfigureDCresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnConfigureeligibilityworkSpaceresult(){
	if (ConfigureEWresult.getAttribute("class").equals("")){
	return ConfigureEWresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnCoreeligibilitysimulationapplicantresult (){
	if (ConfigureCESApplicantresult.getAttribute("class").equals("")){
	return ConfigureCESApplicantresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

public String returnCoreEligibilityApplicantresult (){
	if (ConfigureCEApplicantresult.getAttribute("class").equals("")){
	return ConfigureCEApplicantresult.getAttribute("ng-show");
	}
	else
		return "wrong";
}

}

