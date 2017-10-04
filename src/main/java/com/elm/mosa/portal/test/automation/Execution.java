package com.elm.mosa.portal.test.automation;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.DSSProgram_Configuration_Page;
import pages.DSSProgram_Execution_page;

import java.sql.*;
import java.io.File;

import pages.SSP_Login_Page;

public class Execution {

	public WebDriver Driver;
	public DSSProgram_Execution_page Execution_Page ;
	public SSP_Login_Page LoginPage;
	public DSSProgram_Configuration_Page Configuration; 
	public String username;
	public String Password;
	StringBuilder sb;
	//String connectionstring ="jdbc:sqlserver://192.168.96.199:1433","sa","Aa123456"};
	String line;
	String queryfilepath;
	
	
	public Execution(WebDriver Driver1) throws InterruptedException {
		//super();
		this.Driver=Driver1;
		Execution_Page = new DSSProgram_Execution_page(Driver1);
		username= "opn_admin";
		Password= "admin";
		queryfilepath ="C:\\insert\\insertupdate.txt";
		//setup(username,Password);
	}


/*
	@BeforeMethod
	public void setup(String user, String pass) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "C:/Chrome/chromedriver.exe");
		//Driver= new ChromeDriver();
		Driver = new FirefoxDriver();
		LoginPage = new SSP_Login_Page(Driver);
		Execution_Page = new DSSProgram_Execution_page(Driver);
		Driver.get("http://localhost:8080/SSP-WEB/login");
		Driver.manage().window().maximize();
		LoginPage.login(user, pass);
	}

	
	/*
	BufferedReader bufferedReader1 = new BufferedReader(
            new FileReader("templates\\sqlQueries\\GetPlayerDetails.txt"));
	*/
	
	
	public void cleanupinsert() throws ClassNotFoundException, SQLException, IOException{
		BufferedReader BReader = new BufferedReader(new FileReader(queryfilepath));
		String line;
		StringBuilder bs = new StringBuilder();
		while((line = BReader.readLine())!=null){
			bs.append(line+"\n");
		}
		String Query = bs.toString();
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//String Query= "SELECT NIN FROM [SSPCore].[EPS].[TBL_SSP_ER_DSSSUPPORT_Eligibility_Expected_Results]";
		Connection Conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","sa","Aa123456");
		Statement st = Conn.createStatement();
		boolean RS1 = st.execute(Query);
		 //ResultSet RS = st.executeQuery(Query);
		 //System.out.println(RS.getMetaData());
		 System.out.println(RS1);
		//System.out.println(Query.toString());
	}
	
	public void UploadAgencyFiles() throws IOException{
		 File DS_DYBB = new File("C:\\MOSA\\Test_Data\\Eligibility\\Txt\\DS_DYBB_Yakeen_Batch_Bordercrossing.txt");
		 File DYBB_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DYBB\\OUTBOUND");
		 
		 File DS_DYBH = new File("C:\\MOSA\\Test_Data\\Eligibility\\Txt\\DS_DYBH_Yakeen_Batch_HousingExpats.txt");
		 File DYBH_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DYBH\\OUTBOUND");
		 
		 File DS_DYBN = new File("C:\\MOSA\\Test_Data\\Eligibility\\Txt\\DS_DYBN_Yakeen_Batch_NonHousingExpats.txt");
		 File DYBN_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DYBN\\OUTBOUND");
		 
		 File DS_DNBBI = new File("C:\\MOSA\\Test_Data\\Eligibility\\Txt\\DS_DNBBI_NIC.txt");
		 File DNBBI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DNBBI\\OUTBOUND");
		 
		 File DS_DGEI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DGEI_GOSI.accdb");
		 File DS_DGEI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DGEI\\OUTBOUND");
		 
		 File DS_DMCI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMCI_MoCI_Commercial_Info.accdb");
		 File DS_DMCI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMCI\\OUTBOUND");
		 
		 File DS_DMEI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMEI_MoCS_Employment_Info.accdb");
		 File DS_DMEI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMEI\\OUTBOUND");
		 
		 File DS_DMEI2 = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMEI2_MOE.accdb");
		 File DS_DMEI2_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMEI2\\OUTBOUND");
		 
		 File DS_DMEInfo1 = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMEInfo1_MoHE.accdb");
		 File DS_DMEInfo1_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMEInfo1\\OUTBOUND");
		 
		 File DS_DMHI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMHI_MoSA_HRData_Info.accdb");
		 File DS_DMHI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMHI\\OUTBOUND");
		 
		 File DS_DMRInfo1 = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DMRInfo1_MoSA_ResidencyOrigin_Info.accdb");
		 File DS_DMRInfo1_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DMRInfo1\\OUTBOUND");
		 
		 File DS_DSCI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_DSCI_SIDF_Commercial_Info.accdb");
		 File DS_DSCI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_DSCI\\OUTBOUND");
		 
		 File DS_PRI = new File("C:\\MOSA\\Test_Data\\Eligibility\\DS_PRI_PPA.accdb");
		 File DS_PRI_OTBOUND = new File("C:\\SSP\\DATA\\DSSSUPPORT\\SFTP\\DS_PRI\\OUTBOUND");
		 
		 
		 FileUtils.copyFileToDirectory(DS_DYBB, DYBB_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DYBH, DYBH_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DYBN,DYBN_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DNBBI,DNBBI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DGEI,DS_DGEI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMCI,DS_DMCI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMEI,DS_DMEI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMEI2,DS_DMEI2_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMEInfo1,DS_DMEInfo1_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMHI,DS_DMHI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DMRInfo1,DS_DMRInfo1_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_DSCI,DS_DSCI_OTBOUND);
		 FileUtils.copyFileToDirectory(DS_PRI,DS_PRI_OTBOUND);
	}
	
	

	/*
@Test
public void testinsert() throws ClassNotFoundException, SQLException, IOException{
	
}

*/
	
//@Test(priority=1)
public void Applicant_Extraction() throws ClassNotFoundException, SQLException, IOException, InterruptedException{
//	cleanupinsert();
	System.out.println("executing AE from execution page");
	   Execution_Page.Applicant_Extraction();
	   Assert.assertEquals(Execution_Page.Return_AE_Result(),"item.executed === true");	
}


@Test(priority=2)
public void Household_Extraction() throws IOException, InterruptedException{
	//UploadAgencyFiles();
	Execution_Page.Household_Extraction();
	Assert.assertEquals(Execution_Page.Return_HE_Result(),"item.executed === true");
	
}


@Test(priority=3)
public void Agency_Integration() throws InterruptedException{
	Execution_Page.Agency_Integration();
	Assert.assertEquals(Execution_Page.Return_Agency_Result(),"item.executed === true");
}

@Test(priority=4)
public void  Data_Quality_Dependent() throws InterruptedException{
	Execution_Page.Data_Quality_Dependent();
	Assert.assertEquals(Execution_Page.Return_Data_Quality_Dependent_Result(),"item.executed === true");
}

@Test(priority=5)
public void Data_Consolidation_Dependent() throws InterruptedException{
	Execution_Page.Data_Consolidation_Dependent();
	Assert.assertEquals(Execution_Page.Return_Data_Consolidation_Dependent_Result(), "item.executed === true");
}

@Test (priority=6)
public void Eligibility_WorkSpace_Dependent() throws InterruptedException{
	Execution_Page.Eligibility_WorkSpace_Dependent();
	Assert.assertEquals(Execution_Page.Return_Eligibility_WorkSpace_Dependent_Result(), "item.executed === true");
}

@Test(priority=7)
public void  Core_Eligibility_Simulation_Dependent() throws InterruptedException{
	Execution_Page.Core_Eligibility_Simulation_Dependent();
	Assert.assertEquals(Execution_Page.Return_Core_Eligibility_Simulation_Dependent_result(), "item.executed === true");
}

@Test(priority=8)
public void Core_Eligibility_Dependent() throws InterruptedException{
	Execution_Page.Core_Eligibility_Dependent();
	Assert.assertEquals(Execution_Page.Return_Core_Eligibility_Dependent_Result(), "item.executed === true");
}

@Test(priority=9)
public void Data_Quality() throws InterruptedException{
	Execution_Page.Data_Quality();
	Assert.assertEquals(Execution_Page.Return_Data_Quality_Result(), "item.executed === true");
}

@Test(priority=10)
public void Data_Consolidation() throws InterruptedException{
	Execution_Page.Data_Consolidation();
	Assert.assertEquals(Execution_Page.Return_Data_Consolidation_Result(), "item.executed === true");
	
}

@Test(priority=11)
public void Eligibility_WorkSpace() throws InterruptedException{
	Execution_Page.Eligibility_WorkSpace();
	Assert.assertEquals(Execution_Page.Return_Eligibility_WorkSpace_Result(), "item.executed === true");
}

@Test(priority=12)
public void Core_Eligibility_Simulation_Applicant() throws InterruptedException{
	Execution_Page.Core_Eligibility_Simulation_Applicant();
	Assert.assertEquals(Execution_Page.Return_Core_Eligibility_Simulation_Applicant_Result(), "item.executed === true");
}

@Test(priority=13)
public void Core_Eligibility_Applicant() throws InterruptedException{
	Execution_Page.Core_Eligibility_Applicant();
	Assert.assertEquals(Execution_Page.Return_Core_Eligibility_Applicant_Result(), "item.executed === true");
}



@AfterMethod
public void end(){
	Driver.quit();
}
}
