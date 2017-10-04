package com.elm.mosa.portal.test.automation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Check_Eligibility {
	public static String ER_BDR_column ="ER_BDR_Is_Rule_Passed";
	public static String ER_BDR_name ="ER_BDR";
	
	public static String ER_BDR0021_column ="ER_BDR0021_Is_Rule_Passed";
	public static String ER_BDR0021_name ="ER_BDR0021";
	
	public static String ER_BDR0051_column ="ER_BDR0051_Is_Rule_Passed";
	public static String ER_BDR0051_name="ER_BDR0051";
	
	public static String ER_BDR0061_column ="ER_BDR0061_Is_Rule_Passed";
	public static String ER_BDR0061_name ="ER_BDR0061";
	
	public static String ER_BDR0071_column ="ER_BDR0071_Is_Rule_Passed";
	public static String ER_BDR0071_name ="ER_BDR0071";
	
	public static String ER_BDR0031_column= "ER_BDR0031_Is_Rule_Passed";
	public static String ER_BDR0031_name ="ER_BDR0031";
	
	public static String ER_BDR0041_column= "ER_BDR0041_Is_Rule_Passed";
	public static String ER_BDR0041_name ="ER_BDR0041";
	
	public static String ER_BDR0121_column = "ER_BDR0121_Is_Rule_Passed";
	public static String ER_BDR0121_name = "ER_BDR0121";
	
	public static String ER_BDR0131_column = "ER_BDR0131_Is_Rule_Passed";
	public static String ER_BDR0131_name ="ER_BDR0131";
	
	public static String ER_BDR0161_column ="ER_BDR0161_Is_Rule_Passed";
	public static String ER_BDR0161_name ="ER_BDR0161";
	
	public static String ER_BDR0171_column ="ER_BDR0171_Is_Rule_Passed";
	public static String ER_BDR0171_name="ER_BDR0171";
	
	public static String ER_BDR0181_column = "ER_BDR0181_Is_Rule_Passed";
	public static String ER_BDR0181_name="ER_BDR0181";
	
	public static String ER_BDR0141_column= "ER_BDR0141_Is_Rule_Passed";
	public static String ER_BDR0141_name= "ER_BDR0141";
	
	public static String ER_BDR0191_column ="ER_BDR0191_Is_Rule_Passed";
	public static String ER_BDR0191_name ="ER_BDR0191";
	
	public static String ER_BDR0201_column = "ER_BDR0201_Is_Rule_Passed";
	public static String ER_BDR0201_name = "ER_BDR0201";
	
	public static String ER_BDR0151_column ="ER_BDR0151_Is_Rule_Passed";
	public static String ER_BDR0151_name ="ER_BDR0151";
	
	
	public static String  ER_BDR0221_column ="ER_BDR0221_Is_Rule_Passed";
	public static String  ER_BDR0221_name ="ER_BDR0221";
	
	public static String  ER_BDR0231_column="ER_BDR0231_Is_Rule_Passed";
	public static String  ER_BDR0231_name ="ER_BDR0231";
	
	public static String ER_BDR0241_column ="ER_BDR0241_Is_Rule_Passed";
	public static String ER_BDR0241_name="ER_BDR0241";
	
	public static String  ER_BDR0211_column="ER_BDR0211_Is_Rule_Passed";
	public static String  ER_BDR0211_name="ER_BDR0211";
	
	public static String ER_BDR0251_column ="ER_BDR0251_Is_Rule_Passed";
	public static String ER_BDR0251_name="ER_BDR0251";
	
	public static String ER_BDR0261_column="ER_BDR0261_Is_Rule_Passed";
	public static String ER_BDR0261_name="ER_BDR0261";
	
	
	public static ArrayList<String> GetNin () throws ClassNotFoundException, SQLException{
		String Query= "SELECT NIN FROM [SSPCore].[EPS].[TBL_SSP_ER_DSSSUPPORT_Eligibility_Expected_Results]";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection Conn = DriverManager.getConnection("jdbc:sqlserver://192.168.96.199:1433","sa","Aa123456");
		 Statement st = Conn.createStatement();
		 ResultSet RS = st.executeQuery(Query);
		 ArrayList<String> ninsList = new ArrayList<String>(); 
		 
		 while (RS.next()){
			 ninsList.add(RS.getString(1));
		 }
		 
		 Conn.close();
		 
		 return ninsList;
	}
	
	public static  boolean DBtesting(String Rule,String NIN,String Rule_name) throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection Conn = DriverManager.getConnection("jdbc:sqlserver://192.168.96.199:1433","sa","Aa123456");
		 Statement st = Conn.createStatement();
		 Statement st1 = Conn.createStatement();
		String Query="SELECT "+Rule+" FROM [SSPCore].[EPS].[TBL_SSP_ER_DSSSUPPORT_Eligibility] where nin= "+NIN;
		String Query2="SELECT "+Rule+" FROM [SSPCore].[EPS].[TBL_SSP_ER_DSSSUPPORT_Eligibility_Expected_Results] where nin= "+NIN;
		ResultSet RS = st.executeQuery(Query);
		ResultSet RS2 = st1.executeQuery(Query2);
		RS.next();
		RS2.next();
		
		if (RS.getString(1).equals(RS2.getString(1))){
			System.out.println("passed ");
			Reporter.log( NIN+" passed ", true );
			Conn.close();
			return true;
		}
		else 
			Reporter.log( NIN+" Has failed with rule "+Rule_name, true );
		Conn.close();
			return false;
			
			
	}

	@Test(priority=1)
	public void ER_BDR_Test() throws ClassNotFoundException, SQLException{
		
		ArrayList<String> RS = GetNin();
		boolean ispassed =true;
		
		for (String nin : RS)
		{
			if(DBtesting(ER_BDR_column, nin,ER_BDR_name)== false)
			{
				ispassed = false;
			}
		}

		if(!ispassed)
		 {
			 Assert.fail("Rule "+ER_BDR_name+"have failed with some NINs");
		 }
		
		/*
		while (RS.next()){
		 if(DBtesting(ER_BDR_column, RS.getString(1))== false){
			ispassed = false;
			}	
		}
	*/
		
	}


	@Test(priority=2)
	public void ER_BDR0021_Test() throws ClassNotFoundException, SQLException{
		
		ArrayList<String> RS = GetNin();
		boolean ispassed =true;
		
		for (String nin : RS)
		{
			if(DBtesting(ER_BDR0021_column, nin,ER_BDR0021_name)== false)
			{
				ispassed = false;
			}
		}

		if(!ispassed)
		 {
			 Assert.fail("Rule "+ER_BDR0021_name+"have failed with some NINs");
		 }

	}
		
		
	@Test(priority=3)
   public void ER_BDR0051_Test() throws ClassNotFoundException, SQLException{
			
			ArrayList<String> RS = GetNin();
			boolean ispassed =true;
			
			for (String nin : RS)
			{
				if(DBtesting(ER_BDR0051_column, nin,ER_BDR0051_name)== false)
				{
					ispassed = false;
				}
			}

			if(!ispassed)
			 {
				 Assert.fail("Rule "+ER_BDR0051_name+"have failed with some NINs");
			 }

		}


			@Test(priority=4)
       public void ER_BDR0061_Test() throws ClassNotFoundException, SQLException{
				
				ArrayList<String> RS = GetNin();
				boolean ispassed =true;
				
				for (String nin : RS)
				{
					if(DBtesting(ER_BDR0061_column, nin,ER_BDR0061_name)== false)
					{
						ispassed = false;
					}
				}

				if(!ispassed)
				 {
					 Assert.fail("Rule "+ER_BDR0061_name+"have failed with some NINs");
				 }
			}

				
				@Test(priority=4)
				public void ER_BDR0071_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0071_column, nin,ER_BDR0071_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0071_name+"have failed with some NINs");
					 }

	}
				
				@Test(priority=5)
				public void ER_BDR0031_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0031_column, nin,ER_BDR0031_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0031_name+"have failed with some NINs");
					 }

	                 }

				
				@Test(priority=6)
				public void ER_BDR0041_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0041_column, nin,ER_BDR0041_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0041_name+"have failed with some NINs");
					 }

	                 }
				
				
				@Test(priority=7)
				public void ER_BDR0121_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0121_column, nin,ER_BDR0121_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0121_name+"have failed with some NINs");
					 }

	                 }
				
				
				
				@Test(priority=8)
				public void ER_BDR0131_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0131_column, nin,ER_BDR0131_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0131_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=9)
				public void ER_BDR0171_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0171_column, nin,ER_BDR0171_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0171_name+"have failed with some NINs");
					 }

	                 }
				
				
				@Test(priority=10)
				public void ER_BDR0181_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0181_column, nin,ER_BDR0181_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0181_name+"have failed with some NINs");
					 }

	                 }
				
				

				@Test(priority=11)
				public void ER_BDR0141_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0141_column, nin,ER_BDR0141_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0141_name+"have failed with some NINs");
					 }

	                 }
				
				
				@Test(priority=12)
				public void ER_BDR0191_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0191_column, nin,ER_BDR0191_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0191_name+"have failed with some NINs");
					 }

	                 }
				
				
				
				@Test(priority=13)
				public void ER_BDR0201_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0201_column, nin,ER_BDR0201_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0201_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=14)
				public void ER_BDR0151_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0151_column, nin,ER_BDR0151_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0151_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=15)
				public void ER_BDR0221_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0221_column, nin,ER_BDR0221_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0221_name+"have failed with some NINs");
					 }

	                 }
				
				
				@Test(priority=16)
				public void ER_BDR0231_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0231_column, nin,ER_BDR0231_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0231_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=17)
				public void ER_BDR0241_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0241_column, nin,ER_BDR0241_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0241_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=18)
				public void ER_BDR0211_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0211_column, nin,ER_BDR0211_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0211_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=19)
				public void ER_BDR0251_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0251_column, nin,ER_BDR0251_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0251_name+"have failed with some NINs");
					 }

	                 }
				
				@Test(priority=20)
				public void ER_BDR0261_Test() throws ClassNotFoundException, SQLException{
					
					ArrayList<String> RS = GetNin();
					boolean ispassed =true;
					
					for (String nin : RS)
					{
						if(DBtesting(ER_BDR0261_column, nin,ER_BDR0261_name)== false)
						{
							ispassed = false;
						}
					}

					if(!ispassed)
					 {
						 Assert.fail("Rule "+ER_BDR0261_name+"have failed with some NINs");
					 }

	                 }

}
