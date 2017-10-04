package com.elm.mosa.portal.test.automation;
import org.testng.TestListenerAdapter;
import  org.testng.TestNG;
public class Executer {
		//@SuppressWarnings("deprecation")
		public static void main(String[] args){
			//TestListenerAdapter tla = new TestListenerAdapter();
			TestNG testng1 = new TestNG();
			testng1.setTestClasses(new Class[] {Configuration.class});
			//testng.addListener(tla);
			testng1.run();
			}
	}


