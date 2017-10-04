package pages;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
public class DSSProgram_Execution_page {

	
	WebDriver Driver;
	WebDriverWait Wait;
	Actions action;
	DSSProgram_Configuration_Page ProcessPage;
	SSP_Login_Page LoginPage;
	StringBuilder sb;
	String line;
	String queryfilepath ="C:\\insert\\insertupdate.txt";
  
	  
	@FindBy (css="tr.ng-invalid:nth-child(1) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
	WebElement Applicant_Extraction;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[1]/td[3]/center/span/img[2]")
    WebElement  Applicant_Extraction_Waiting;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[1]/td[3]/center/span/img[1]")
    WebElement  Applicant_Extraction_Result;
	
	
	
	
	@FindBy (css="tr.ng-pristine:nth-child(2) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
	WebElement Household_Extraction;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[2]/td[3]/center/span/img[2]")
	WebElement Household_Extraction_Waiting;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[2]/td[3]/center/span/img[1]")
	WebElement Household_Extraction_Result;
	
	
	
	/*
	@FindBy (css="tr.ng-pristine:nth-child(3) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
	WebElement Household_Extraction;
	*/
	
	@FindBy (css="tr.ng-pristine:nth-child(3) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
	WebElement Agency_Integration;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[3]/td[3]/center/span/img[2]")
	WebElement Agency_Integration_Waiting;
	
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[3]/td[3]/center/span/img[1]")
	WebElement Agency_Integration_Result;
	
	             
	
	@FindBy (css="tr.ng-pristine:nth-child(4) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Data_Quality_Dependent;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[4]/td[3]/center/span/img[2]")
	WebElement Data_Quality_Dependent_Waiting;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[4]/td[3]/center/span/img[1]")
	WebElement Data_Quality_Dependent_Result;
	
	
	
	@FindBy (css="tr.ng-pristine:nth-child(5) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Data_Consolidation_Dependent; 
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[5]/td[3]/center/span/img[2]")
	WebElement Data_Consolidation_Dependent_Waiting;
	
	@FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[5]/td[3]/center/span/img[1]")
	WebElement Data_Consolidation_Dependent_Result;
	
	

    @FindBy (css="tr.ng-pristine:nth-child(6) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Eligibility_WorkSpace_Dependent; 
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[6]/td[3]/center/span/img[2]")
	WebElement Eligibility_WorkSpace_Dependent_Waiting;
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[6]/td[3]/center/span/img[1]")
	WebElement Eligibility_WorkSpace_Dependent_Result;
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(7) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Core_Eligibility_Simulation_Dependent;
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[7]/td[3]/center/span/img[2]")
	WebElement Core_Eligibility_Simulation_Dependent_Waiting;
    
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[7]/td[3]/center/span/img[1]")
	WebElement Core_Eligibility_Simulation_Dependent_Result;
    
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(8) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Core_Eligibility_Dependent;
    
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[8]/td[3]/center/span/img[2]")
	WebElement Core_Eligibility_Dependent_Waiting;
    
    @FindBy (xpath="//*[@id='wizard']/form/div/div[3]/table/tbody/tr[8]/td[3]/center/span/img[1]")
	WebElement Core_Eligibility_Dependent_Result;
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(9) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Data_Quality;
    
    
    @FindBy (css="tr.ng-pristine:nth-child(9) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
	WebElement Data_Quality_Waiting;
    
    
    @FindBy (css="tr.ng-pristine:nth-child(9) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
	WebElement Data_Quality_Result;
    
    
    
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(10) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Data_Consolidation;
    
    @FindBy (css="tr.ng-scope:nth-child(10) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
	WebElement Data_Consolidation_Waiting;
    
    @FindBy (css="tr.ng-scope:nth-child(10) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
	WebElement Data_Consolidation_Result;
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(11) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement  Eligibility_WorkSpace;
    
    @FindBy (css="tr.ng-scope:nth-child(11) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
	WebElement Eligibility_WorkSpace_Waiting;
    
    @FindBy (css="tr.ng-scope:nth-child(11) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
	WebElement Eligibility_WorkSpace_Result;
    
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(12) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Core_Eligibility_Simulation_Applicant;
    
    @FindBy (css="tr.ng-scope:nth-child(12) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
	WebElement Core_Eligibility_Simulation_Applicant_Waiting;
    
    
    @FindBy (css="tr.ng-scope:nth-child(12) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
	WebElement Core_Eligibility_Simulation_Applicant_Result;
    
    
    
    
    @FindBy (css="tr.ng-pristine:nth-child(13) > td:nth-child(1) > center:nth-child(1) > input:nth-child(1)")
    WebElement Core_Eligibility_Applicant; 
    
    @FindBy (css="tr.ng-scope:nth-child(13) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(2)")
	WebElement Core_Eligibility_Applicant_Waiting;
    
    @FindBy (css="tr.ng-scope:nth-child(13) > td:nth-child(3) > center:nth-child(1) > span:nth-child(1) > img:nth-child(1)")
   	WebElement Core_Eligibility_Applicant_Result;
    
    
    
    
    
    @FindBy (css=".vakata-context > li:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")
    WebElement Execute_From_Right_click;

    @FindBy (css="input.ng-valid:nth-child(3)")
    WebElement manual_List_No;
    
    
    @FindBy (css="li.next:nth-child(2) > a:nth-child(1)")
    WebElement Execute;
    
    @FindBy(css="th.col-sm-23:nth-child(1) > left:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
    WebElement AllDataSources;
    
    public DSSProgram_Execution_page(WebDriver driver){
    	this.Driver =driver;
    	PageFactory.initElements(driver, this);
    	action= new Actions(Driver);
    	ProcessPage= new DSSProgram_Configuration_Page(Driver);
    	
    	
    }

    public void Insert_Portal_Data() throws ClassNotFoundException, SQLException, IOException{
		BufferedReader BReader = new BufferedReader(new FileReader(queryfilepath));
		String line;
		StringBuilder bs = new StringBuilder();
		while((line = BReader.readLine())!=null){
			bs.append(line+"\n");
		}
		String Query = bs.toString();
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection Conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","sa","Aa123456");
		Statement st = Conn.createStatement();
		boolean RS1 = st.execute(Query);
		 System.out.println(RS1);
	}
	
    public void Transfer_Agency_Files(){
    	
    }
    
    
    public void Applicant_Extraction() throws ClassNotFoundException, SQLException, IOException, InterruptedException{
    	Wait = new WebDriverWait(Driver,40);
    	//Insert_Portal_Data();
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Applicant_Extraction));
    	Applicant_Extraction.click();
    	manual_List_No.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Applicant_Extraction_Waiting.getAttribute("class");
    			while (completed.equals("")){
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

  
    public  String Return_AE_Result(){
    	if (Applicant_Extraction_Result.getAttribute("class").equals("")){
    		return Applicant_Extraction_Result.getAttribute("ng-show");
    		}
    		else
    			return "wrong";
    }

    
    
    public void Household_Extraction() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,80);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Household_Extraction));
    	Household_Extraction.click();
    	
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Household_Extraction_Waiting.getAttribute("class");
    			while (completed.equals("")){
    				return false;
    			}
    			try {
					Thread.sleep(3600);
				} 
    			catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    			
				return true;
    		}
    	}
    			);
		}
    
    
    public String Return_HE_Result(){
	  if (Household_Extraction_Result.getAttribute("class").equals("")){
		  return Household_Extraction_Result.getAttribute("ng-show");
	  }
	  else return "Wrong";
  }
    
    
    public void Agency_Integration() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,80);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Agency_Integration));
    	Agency_Integration.click();
    	AllDataSources.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Agency_Integration_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Agency_Result(){
    	if (Agency_Integration_Result.getAttribute("class").equals("")){
  		  return Agency_Integration_Result.getAttribute("ng-show");
  	  }
  	  else return "Wrong";
    }
   
    
    public void  Data_Quality_Dependent() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,80);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Data_Quality_Dependent));
    	Data_Quality_Dependent.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Data_Quality_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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

    public String Return_Data_Quality_Dependent_Result(){
    	if (Data_Quality_Dependent_Result.getAttribute("class").equals("")){
    		  return Data_Quality_Dependent_Result.getAttribute("ng-show");
    	  }
    	  else return "Wrong";
    }
    
    public void Data_Consolidation_Dependent() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Data_Consolidation_Dependent));
    	Data_Consolidation_Dependent.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Data_Consolidation_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
     public String Return_Data_Consolidation_Dependent_Result(){

    	 if (Data_Consolidation_Dependent_Result.getAttribute("class").equals("")){
   		  return Data_Consolidation_Dependent_Result.getAttribute("ng-show");
   	  }
   	  else return "Wrong";
     }
     
    public void Eligibility_WorkSpace_Dependent() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Eligibility_WorkSpace_Dependent));
    	Eligibility_WorkSpace_Dependent.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Eligibility_WorkSpace_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Eligibility_WorkSpace_Dependent_Result(){
    	 if (Eligibility_WorkSpace_Dependent_Result.getAttribute("class").equals("")){
      		  return Eligibility_WorkSpace_Dependent_Result.getAttribute("ng-show");
      	  }
      	  else return "Wrong";
    }
    
    
    public void  Core_Eligibility_Simulation_Dependent() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Core_Eligibility_Simulation_Dependent));
    	Core_Eligibility_Simulation_Dependent.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Core_Eligibility_Simulation_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Core_Eligibility_Simulation_Dependent_result(){
    	 if (Core_Eligibility_Simulation_Dependent_Result.getAttribute("class").equals("")){
     		  return Core_Eligibility_Simulation_Dependent_Result.getAttribute("ng-show");
     	  }
     	  else return "Wrong";
    }
    
    public void Core_Eligibility_Dependent() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Core_Eligibility_Dependent));
    	Core_Eligibility_Dependent.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Core_Eligibility_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Core_Eligibility_Dependent_Result(){
    	if (Core_Eligibility_Dependent_Result.getAttribute("class").equals("")){
   		  return Core_Eligibility_Dependent_Result.getAttribute("ng-show");
   	  }
   	  else return "Wrong";
    }
   
    public void Data_Quality() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Data_Quality));
    	Data_Quality.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Data_Quality_Dependent_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Data_Quality_Result(){
    	if (Data_Quality_Result.getAttribute("class").equals("")){
     		  return Data_Quality_Result.getAttribute("ng-show");
     	  }
     	  else return "Wrong";
    }
   
    
    public void Data_Consolidation() throws InterruptedException{
    	
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Data_Consolidation));
    	Data_Consolidation.click();
    	Execute.click();
    	Thread.sleep(3000);
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Data_Consolidation_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Data_Consolidation_Result(){
    	if (Data_Consolidation_Result.getAttribute("class").equals("")){
   		  return Data_Consolidation_Result.getAttribute("ng-show");
   	  }
   	  else return "Wrong";
    }
    
    public void Eligibility_WorkSpace() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Eligibility_WorkSpace));
    	Eligibility_WorkSpace.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Eligibility_WorkSpace_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Eligibility_WorkSpace_Result(){
    	if (Eligibility_WorkSpace_Dependent_Result.getAttribute("class").equals("")){
     		  return Eligibility_WorkSpace_Dependent_Result.getAttribute("ng-show");
     	  }
     	  else return "Wrong";
    }
   
    
    public void Core_Eligibility_Simulation_Applicant() throws InterruptedException{
    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Core_Eligibility_Simulation_Applicant));
    	Core_Eligibility_Simulation_Applicant.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Core_Eligibility_Simulation_Applicant_Waiting.getAttribute("class");
    			while (completed.equals("")){
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
    
    public String Return_Core_Eligibility_Simulation_Applicant_Result(){
    	if (Core_Eligibility_Simulation_Applicant_Result.getAttribute("class").equals("")){
   		  return Core_Eligibility_Simulation_Applicant_Result.getAttribute("ng-show");
   	  }
   	  else return "Wrong";
    }

    
    public void Core_Eligibility_Applicant() throws InterruptedException{

    	Wait = new WebDriverWait(Driver,1600);
    	action.contextClick(ProcessPage.RightClick).sendKeys(Keys.ARROW_RIGHT).build().perform();
    	Thread.sleep(3000);
    	Execute_From_Right_click.click();
    	Wait.until(ExpectedConditions.visibilityOf(Core_Eligibility_Applicant));
    	Core_Eligibility_Applicant.click();
    	Execute.click();
    	Thread.sleep(3000);
    	
    	Wait.until(new ExpectedCondition<Boolean>(){
    		@Override
    		public Boolean apply(WebDriver Driver){
    			String completed= Core_Eligibility_Applicant_Waiting.getAttribute("class");
    			while (completed.equals("")){
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

    public String Return_Core_Eligibility_Applicant_Result(){
	if (Core_Eligibility_Applicant_Result.getAttribute("class").equals("")){
 		  return Core_Eligibility_Applicant_Result.getAttribute("ng-show");
 	  }
 	  else return "Wrong";
}

    
}

